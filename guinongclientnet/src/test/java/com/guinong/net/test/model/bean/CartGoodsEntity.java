package com.guinong.net.test.model.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class CartGoodsEntity implements Serializable {

    /**
     * cartItemId : 21
     * color :
     * count : 1
     * id : 734
     * imgUrl : http://dev.guinong.com:8080//Storage/Shop/20/Products/734/1_150.png
     * name : 【三斤装包邮】甜嫩新鲜荷兰豆 荷仁豆 剪豆扁豆农家现摘绿色蔬菜
     * price : 46.90
     * size :
     * skuId : 734_0_0_164
     * status : 1
     * url : http://dev.guinong.com:8080//m-IOS/product/detail//1.png734
     * version : 3斤/份
     */
    private String vShopId;

    public String getvShopId() {
        return vShopId;
    }

    public void setvShopId(String vShopId) {
        this.vShopId = vShopId;
    }

    private int cartItemId;
    private String color;
    private int count;
    private String id;
    private String imgUrl;
    private String name;
    private String price;
    private String size;
    private String skuId;
    private int status;
    private String url;
    private String version;
    //每件商品是否被选中
    private boolean isGoodsSelect = true;
    //商品是否处于每间商铺的第一个位置 是返回1 不是返回2
    private int isFirst = 2;
    //这个需要服务器添加吧
    //每间商铺是否陪选中
    private boolean isShopSelect = true;
    private String shopId;
    private String shopName;
    //进行商品是否删除选中
    private Boolean isDelete;
    private String csvDesc;
    private Boolean isFavorite;
    //删除和收藏是否显示出来 默认是不显示的
    private Boolean isDeCoShow;

    public boolean isGoodsSelect() {
        return isGoodsSelect;
    }

    public void setGoodsSelect(boolean goodsSelect) {
        isGoodsSelect = goodsSelect;
    }

    public Boolean getDeCoShow() {
        return isDeCoShow;
    }

    public void setDeCoShow(Boolean deCoShow) {
        isDeCoShow = deCoShow;
    }

    public String getCsvDesc() {
        return csvDesc;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public void setCsvDesc(String csvDesc) {
        this.csvDesc = csvDesc;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }



    public int getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(int isFirst) {
        this.isFirst = isFirst;
    }

    public boolean isShopSelect() {
        return isShopSelect;
    }

    public void setShopSelect(boolean shopSelect) {
        isShopSelect = shopSelect;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
