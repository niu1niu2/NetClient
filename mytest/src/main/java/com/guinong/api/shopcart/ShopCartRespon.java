package com.guinong.api.shopcart;

import java.io.Serializable;
import java.util.List;

/**
 * @author csn
 * @date 2017/7/27 0027 16:38
 * @content
 */
public class ShopCartRespon implements Serializable {

    /**
     * shopId : 88
     * shopLogo :
     * shopName : 太朴有机会旗舰店
     * vShopId : 0
     * products : [{"cartItemId":"12","color":"","count":"4","id":"1169","imgUrl":"http://img.guinong.com//Storage/Shop/88/Products/1169/1.png","name":"太朴有机会新货现磨纯玉米面棒子面苞米面非转基因玉米粉粗杂粮","price":"12.00","size":"","skuId":"1169_0_0_137","status":1,"url":"http://img.guinong.com/m-IOS/product/detail//1.png1169","version":"1包（420g）","csvDesc":"版本:1包（420g）","isFavorite":false}]
     */

    private String shopId;
    private String shopLogo;
    private String shopName;
    private String vShopId;
    private List<ProductsBean> products;

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

    public String getVShopId() {
        return vShopId;
    }

    public void setVShopId(String vShopId) {
        this.vShopId = vShopId;
    }

    public List<ProductsBean> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsBean> products) {
        this.products = products;
    }

    public static class ProductsBean {
        /**
         * cartItemId : 12
         * color :
         * count : 4
         * id : 1169
         * imgUrl : http://img.guinong.com//Storage/Shop/88/Products/1169/1.png
         * name : 太朴有机会新货现磨纯玉米面棒子面苞米面非转基因玉米粉粗杂粮
         * price : 12.00
         * size :
         * skuId : 1169_0_0_137
         * status : 1
         * url : http://img.guinong.com/m-IOS/product/detail//1.png1169
         * version : 1包（420g）
         * csvDesc : 版本:1包（420g）
         * isFavorite : false
         */

        private String cartItemId;
        private String color;
        private String count;
        private String id;
        private String imgUrl;
        private String name;
        private String price;
        private String size;
        private String skuId;
        private int status;
        private String url;
        private String version;
        private String csvDesc;
        private boolean isFavorite;

        public String getCartItemId() {
            return cartItemId;
        }

        public void setCartItemId(String cartItemId) {
            this.cartItemId = cartItemId;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
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

        public String getCsvDesc() {
            return csvDesc;
        }

        public void setCsvDesc(String csvDesc) {
            this.csvDesc = csvDesc;
        }

        public boolean isIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(boolean isFavorite) {
            this.isFavorite = isFavorite;
        }
    }
}
