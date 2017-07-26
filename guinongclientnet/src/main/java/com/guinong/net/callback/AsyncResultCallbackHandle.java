package com.guinong.net.callback;

import com.google.gson.Gson;
import com.guinong.net.NetworkResultMessage;

/**
 * @author csn
 * @date 2017/7/26 0026 18:59
 * @content
 */
public class AsyncResultCallbackHandle<TResult> extends AsyncMessageCallbackHandle {

    private final IAsyncResultCallback<TResult> asyncCallback;
    private final Gson gson;
    private final Class<TResult> resultClass;

    public AsyncResultCallbackHandle(Class<TResult> resultClass, IAsyncResultCallback<TResult> asyncCallback, Gson gson) {
        super(asyncCallback);
        this.resultClass = resultClass;
        this.asyncCallback = asyncCallback;
        this.gson = gson;
    }

    @Override
    public void onComplete(NetworkResultMessage message, Object userState) {
        asyncCallback.onComplete(message.ToResult(resultClass, gson), userState);
    }
}
