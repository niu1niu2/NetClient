package com.guinong.net.callback;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.guinong.net.CodeContant;
import com.guinong.net.NetworkErrorInfo;
import com.guinong.net.NetworkException;
import com.guinong.net.NetworkMessage;
import com.guinong.net.NetworkResultMessage;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * @author csn
 * @date 2017/7/25 0025 18:13
 * @content
 */
public class NetworkJsonCallback implements Callback {
    private final Handler handler;
    private final IAsyncMessageCallback callback;
    private final Object userState;
    private final Gson gson;

    /**
     * @param isUnitTest
     * @param gson
     * @param asyncResultCallback
     * @param userState
     */
    public NetworkJsonCallback(boolean isUnitTest, Gson gson, IAsyncMessageCallback asyncResultCallback, Object userState) {
        this.gson = gson;
        this.callback = asyncResultCallback;
        if (isUnitTest) {
            this.handler = null;
        } else {
            this.handler = new Handler(Looper.getMainLooper());
        }
        this.userState = userState;
    }

    private void postException(final NetworkException exception) {
        if (handler != null) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    callback.onError(exception, userState);
                }
            });
        } else {
            callback.onError(exception, userState);
        }
    }

    @Override
    public void onFailure(Call call, IOException e) {
        if (call.isCanceled()) {
            //用户主动取消
            postException(new NetworkException(CodeContant.CODE_USER_CANCEL, e.getMessage(), null, e));
        } else {
            //服务器异常  1.主机地址出错  2.没有网络连接
            postException(new NetworkException(CodeContant.CODE_SERVER_EXCEPTION, e.getMessage(), null, e));
        }
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String result = response.body().string();
        if (result == null || result.trim().length() == 0) {
            //返回的数据错误
            postException(new NetworkException(CodeContant.CODE_DATA_EXCEPTION, "format error ", null, null));
            return;
        }
        try {
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            if (!element.isJsonObject()) {
                postException(new NetworkException(CodeContant.CODE_DATA_EXCEPTION, "format error ", null, null));
                return;
            }
            JsonObject jsonObject = (JsonObject) element;
            final NetworkMessage msg = gson.fromJson(jsonObject,
                    NetworkMessage.class);
            if (!msg.isSuccess()) {
                //1.code=404 请求页面路径错误
                //1.code=500 服务器内部错误
                //1.code=502 错误的网关
                //1.code=504 网关超时
                //1.code=405 请求方式错误
                NetworkErrorInfo errorInfo = msg.getError();
                if (errorInfo == null) {
                    errorInfo = new NetworkErrorInfo();
                    errorInfo.setCode(CodeContant.CODE_UNKNOWN);
                    String errorMessage = "未知异常";
                    if (response.code() == 404) {
                        errorMessage = "请求页面路径错误";
                    } else if (response.code() == 500) {
                        errorMessage = "服务器内部错误";
                    } else if (response.code() == 502) {
                        errorMessage = "错误的网关";
                    } else if (response.code() == 504) {
                        errorMessage = "网关超时";
                    } else if (response.code() == 405) {
                        errorMessage = "请求方式不支持(post，get)";
                    }
                    errorInfo.setMessage(errorMessage);
                }
                postException(new NetworkException(response.code(), errorInfo.getMessage(), errorInfo.getDetail(), null));
                return;
            }
            final NetworkResultMessage resultMessage = new NetworkResultMessage(msg);
            resultMessage.setResult(jsonObject.get("result"));
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callback.onComplete(resultMessage, userState);
                    }
                });
            } else {
                callback.onComplete(resultMessage, userState);
            }
        } catch (JsonSyntaxException e) {
            //不是标准的json数据
            postException(new NetworkException(CodeContant.CODE_DATA_EXCEPTION, "server json format error ", e.getMessage(), e));
            return;
        }
    }
}
