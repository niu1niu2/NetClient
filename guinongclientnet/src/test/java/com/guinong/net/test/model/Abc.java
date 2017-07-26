package com.guinong.net.test.model;

import com.guinong.net.verify.NotNull;

/**
 * @author csn
 * @date 2017/7/26 0026 13:54
 * @content
 */
public class Abc {

    @NotNull(friendlyName = "姓名")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
