package com.guinong.net.test.model.api.login;

/**
 * @author csn
 * @date 2017/7/27 0027 10:31
 * @content
 */
public class LoginRequest {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
