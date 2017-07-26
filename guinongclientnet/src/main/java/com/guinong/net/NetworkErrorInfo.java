package com.guinong.net;

import java.io.Serializable;

/**
 * @author csn
 * @date 2017/7/25 0025 18:00
 * @content
 */
public class NetworkErrorInfo implements Serializable {

    private int code;
    private String message;
    private String detail;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
