package com.guinong.net.test.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class CartEntity implements Serializable {

    /**
     * shopId : 20
     * shopLogo :
     * shopName : 长顺馆
     * vShopId : 0
     */

    private String shopId;
    private String shopLogo;
    private String shopName;
    private String vShopId;

    public String getvShopId() {
        return vShopId;
    }

    public void setvShopId(String vShopId) {
        this.vShopId = vShopId;
    }

    private List<CartGoodsEntity> products;

    public List<CartGoodsEntity> getProducts() {
        return products;
    }

    public void setProducts(List<CartGoodsEntity> products) {
        this.products = products;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


}
