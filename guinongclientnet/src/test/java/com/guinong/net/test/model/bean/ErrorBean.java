package com.guinong.net.test.model.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class ErrorBean implements Serializable {
    /**
     * code : 103
     * message : 用户名或密码错误
     * details : null
     */

    private int code;
    private String message;
    private Object details;

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

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

}
