package com.guinong.net.callback;

import com.guinong.net.NetworkException;
import com.guinong.net.NetworkResultMessage;

/**
 * @author csn
 * @date 2017/7/26 0026 18:57
 * @content
 */
public abstract class AsyncMessageCallbackHandle implements IAsyncMessageCallback {

    private final IAsyncCallback asyncCallback;
    public AsyncMessageCallbackHandle(IAsyncCallback asyncCallback){
        this.asyncCallback =asyncCallback;
    }

    @Override
    public final void onError(NetworkException error, Object userState) {
        asyncCallback.onError(error,userState);
    }
}
