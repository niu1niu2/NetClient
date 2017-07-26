package com.guinong.net.callback;

import com.guinong.net.NetworkResultMessage;

/**
 * @author csn
 * @date 2017/7/26 0026 19:16
 * @content
 */
public class AsyncEmptyCallbackHandle extends AsyncMessageCallbackHandle {

    private final IAsyncEmptyCallback asyncCallback;
    public AsyncEmptyCallbackHandle(IAsyncEmptyCallback asyncCallback) {
        super(asyncCallback);
        this.asyncCallback = asyncCallback;
    }

    @Override
    public void onComplete(NetworkResultMessage message, Object userState) {
        asyncCallback.onComplete(userState);
    }
}
