package com.guinong.net.callback;

import com.guinong.net.NetworkMessage;
import com.guinong.net.NetworkResultMessage;

/**
 * @author csn
 * @date 2017/7/25 0025 18:22
 * @content
 */
public interface IAsyncMessageCallback extends IAsyncCallback {

    /**
     * 完成
     *
     * @param message
     *            消息
     * @param userState
     *            用户状态
     */
    void onComplete(NetworkResultMessage message, Object userState);
}
