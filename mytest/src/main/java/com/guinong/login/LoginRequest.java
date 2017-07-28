package com.guinong.login;

/**
 * @author csn
 * @date 2017/7/27 0027 10:31
 * @content
 */
public class LoginRequest {
    private String userName;
    private String password;
    private String imgcode;

    public String getImgcode() {
        return imgcode;
    }

    public void setImgcode(String imgcode) {
        this.imgcode = imgcode;
    }

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
