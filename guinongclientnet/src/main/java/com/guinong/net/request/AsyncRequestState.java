package com.guinong.net.request;

import okhttp3.Call;

/**
 * @author csn
 * @date 2017/7/25 0025 18:49
 * @content
 */
public class AsyncRequestState implements IAsyncRequestState {

    private final Call call;
    private final Object userState;

    public AsyncRequestState(Call call, Object userState) {
        this.call = call;
        this.userState = userState;
    }

    @Override
    public boolean cancel() {
        if (call == null) {
            return false;
        }
        if (call.isCanceled()) {
            return false;
        }
        call.cancel();
        return true;
    }

    @Override
    public Object getUserState() {
        return this.userState;
    }
}
