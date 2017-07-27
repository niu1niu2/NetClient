package com.guinong.net.test.model;

import com.guinong.net.verify.NumberRange;

import java.io.Serializable;

/**
 * @author csn
 * @date 2017/7/26 0026 16:09
 * @content
 */
public class HomeRequest implements Serializable {

    @NumberRange(maxValue =3,friendlyName = "页号",minValue = 0)
    private int pageId;

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }
}
