package com.guinong.net.callback;

/**
 * @author csn
 * @date 2017/7/25 0025 19:11
 * @content
 */
public interface IAsyncResultCallback<TResult> extends IAsyncCallback {

    /**
     * 完成
     *
     * @param result
     *            消息
     * @param userState
     *            用户状态
     */
    void onComplete(TResult result, Object userState);
}
