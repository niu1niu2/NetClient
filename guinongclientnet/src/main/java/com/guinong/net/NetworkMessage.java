package com.guinong.net;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author csn
 * @date 2017/7/25 0025 17:58
 * @content
 */
public class NetworkMessage implements Serializable {

    private boolean success;
    private NetworkErrorInfo error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public NetworkErrorInfo getError() {
        return error;
    }

    public void setError(NetworkErrorInfo error) {
        this.error = error;
    }


}
