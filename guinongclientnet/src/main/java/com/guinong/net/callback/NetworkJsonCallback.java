package com.guinong.net.callback;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.guinong.net.NetworkErrorInfo;
import com.guinong.net.NetworkException;
import com.guinong.net.NetworkMessage;
import com.guinong.net.NetworkResultMessage;
import com.guinong.net.RequestClient;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;

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
     * @param gson
     * @param asyncResultCallback
     * @param userState
     */
    public NetworkJsonCallback(Gson gson, IAsyncMessageCallback asyncResultCallback, Object userState) {
        this.gson = gson;
        this.callback = asyncResultCallback;
        if (RequestClient.isUnitTest) {
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
            postException(new NetworkException(-10000, e.getMessage(), null, e));
        } else {
            //服务器异常
            postException(new NetworkException(-999, e.getMessage(), null, e));
        }
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String result = response.body().string();
        if (result == null || result.trim().length() == 0) {
            //返回的数据错误
            postException(new NetworkException(-588, "format error ", null, null));
            return;
        }
        try {
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            if (!element.isJsonObject()) {
                postException(new NetworkException(-588, "format error ", null, null));
                return;
            }
            JsonObject jsonObject = (JsonObject) element;
           final NetworkMessage msg = gson.fromJson(jsonObject,
                    NetworkMessage.class);
            if (!msg.isSuccess()) {
                NetworkErrorInfo errorInfo = msg.getError();
                if (errorInfo == null) {
                    errorInfo = new NetworkErrorInfo();
                    errorInfo.setCode(0);
                    errorInfo.setMessage("未知异常");
                }
                postException(new NetworkException(msg.getError().getCode(), errorInfo.getMessage(), errorInfo.getDetail(), null));
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
            postException(new NetworkException(-588, "server json format error ", e.getMessage(), e));
            return;
        }
    }
}
