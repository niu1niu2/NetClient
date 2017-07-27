package com.guinong.net.test.model;

import com.guinong.net.verify.EmailFormat;
import com.guinong.net.verify.MobilePhoneFormat;
import com.guinong.net.verify.NotNull;
import com.guinong.net.verify.StringLength;

/**
 * @author wangyu
 * @time 2017/7/27 0027 on 上午 10:51
 * @desc
 */
public class Student {

    @NotNull(friendlyName = "姓名")
    @StringLength(minLength = 2,maxLength = 10,friendlyName = "姓名")
    private String name;
    @MobilePhoneFormat(Length = 11,friendlyName = "电话号码")
    private String phone;
    @EmailFormat(friendlyName = "邮件地址")
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
