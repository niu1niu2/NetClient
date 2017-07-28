package com.guinong.api.api.login;

import java.io.Serializable;

/**
 * @author csn
 * @date 2017/7/27 0027 10:31
 * @content
 */
public class LoginRespon implements Serializable {


    /**
     * userId : 121
     * userKey : RGltc0ZHRmRuZEcyOEVvK2dpbkZQUT09
     * isSpokesMan : true
     * spokesManCode : c99539cc-dd64-4488-882f-74ca70d17cb4
     * validateDate : 2018-06-14 16:55:31
     */

    private String userId;
    private String userKey;
    private boolean isSpokesMan;
    private String spokesManCode;
    private String validateDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public boolean isIsSpokesMan() {
        return isSpokesMan;
    }

    public void setIsSpokesMan(boolean isSpokesMan) {
        this.isSpokesMan = isSpokesMan;
    }

    public String getSpokesManCode() {
        return spokesManCode;
    }

    public void setSpokesManCode(String spokesManCode) {
        this.spokesManCode = spokesManCode;
    }

    public String getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(String validateDate) {
        this.validateDate = validateDate;
    }
}
