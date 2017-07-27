package com.guinong.net.test.model.api.login;

import java.io.Serializable;

/**
 * @author csn
 * @date 2017/7/27 0027 15:09
 * @content
 */
public class LoginImageCodeRequest implements Serializable {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
