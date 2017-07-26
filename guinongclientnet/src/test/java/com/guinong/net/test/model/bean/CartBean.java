package com.guinong.net.test.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class CartBean extends BaseBean {
    private List<CartEntity> cartShops;

    public String getAllCartProductCount() {
        return allCartProductCount;
    }

    public void setAllCartProductCount(String allCartProductCount) {
        this.allCartProductCount = allCartProductCount;
    }

    public List<CartEntity> getCartShops() {
        return cartShops;
    }

    public void setCartShops(List<CartEntity> cartShops) {
        this.cartShops = cartShops;
    }

    private String allCartProductCount;
}
