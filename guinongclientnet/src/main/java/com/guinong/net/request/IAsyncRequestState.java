package com.guinong.net.request;

/**
 * @author csn
 * @date 2017/7/25 0025 18:45
 * @content
 */
public interface IAsyncRequestState {

    /**
     * 取消
     */
    boolean cancel();

    /**
     * 获取用户状态
     *
     * @return 用户传递状态值
     */
    Object getUserState();
}
