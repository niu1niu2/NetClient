package com.guinong.net.callback;

import com.google.gson.Gson;
import com.guinong.net.NetworkResultMessage;

import java.lang.reflect.Type;

/**
 * @author csn
 * @date 2017/7/26 0026 19:05
 * @content
 */
public class AsyncTypeResultCallbackHandle<TResult> extends AsyncMessageCallbackHandle {

    private final IAsyncResultCallback<TResult> asyncCallback;
    private final Gson gson;
    private final Type resultType;

    public AsyncTypeResultCallbackHandle(Type resultType, IAsyncResultCallback<TResult> asyncCallback, Gson gson) {
        super(asyncCallback);
        this.resultType = resultType;
        this.asyncCallback = asyncCallback;
        this.gson = gson;
    }

    @Override
    public void onComplete(NetworkResultMessage message, Object userState) {
        TResult result = message.ToTypeResult(resultType, gson);
        asyncCallback.onComplete(result, userState);
    }
}
