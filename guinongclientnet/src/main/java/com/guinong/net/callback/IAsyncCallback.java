package com.guinong.net.callback;

import com.guinong.net.NetworkException;

/**
 * @author csn
 * @date 2017/7/25 0025 18:14
 * @content
 */
public interface IAsyncCallback {

    /**
     *
     * @param error
     * @param userState
     */
    void onError(NetworkException error,Object userState);

}
