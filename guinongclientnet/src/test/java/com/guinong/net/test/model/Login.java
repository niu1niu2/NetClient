package com.guinong.net.test.model;

import java.io.Serializable;

/**
 * @author csn
 * @date 2017/7/26 0026 16:04
 * @content
 */
public class Login implements Serializable {
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
