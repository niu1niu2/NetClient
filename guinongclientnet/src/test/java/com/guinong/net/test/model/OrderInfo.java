package com.guinong.net.test.model;

import com.guinong.net.verify.NotNull;
import com.guinong.net.verify.check.IModelCheck;

/**
 * @author csn
 * @date 2017/7/26 0026 11:55
 * @content
 */
public class OrderInfo extends Abc implements IModelCheck {

    @NotNull(friendlyName = "订单号", errorMessage = "老兄，订单号得有")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void validate() {
        if (!this.id.equals("123")) {
            throw new RuntimeException("订单号必须是123");
        }
    }
}
