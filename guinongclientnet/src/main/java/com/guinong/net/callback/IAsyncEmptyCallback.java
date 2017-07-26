package com.guinong.net.callback;

/**
 * @author csn
 * @date 2017/7/26 0026 14:18
 * @content
 */
public interface IAsyncEmptyCallback extends IAsyncCallback {

    /**
     * 完成
     *
     * @param userState
     *            用户状态
     */
    void onComplete(Object userState);
}
