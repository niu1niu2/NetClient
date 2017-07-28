package com.guinong.shopcart;

import java.io.Serializable;
import java.util.List;

/**
 * @author csn
 * @date 2017/7/27 0027 16:38
 * @content
 */
public class ShopCartRespon implements Serializable {


    /**
     * allCartProductCount : 0
     * cartShops : [{"shopId":"string","shopLogo":"string","shopName":"string","vShopId":"string","products":[{"cartItemId":"string","color":"string","count":"string","id":"string","imgUrl":"string","name":"string","price":"string","size":"string","skuId":"string","status":0,"url":"string","version":"string","csvDesc":"string","isFavorite":true}]}]
     */

    private int allCartProductCount;
    private List<CartShopsBean> cartShops;

    public int getAllCartProductCount() {
        return allCartProductCount;
    }

    public void setAllCartProductCount(int allCartProductCount) {
        this.allCartProductCount = allCartProductCount;
    }

    public List<CartShopsBean> getCartShops() {
        return cartShops;
    }

    public void setCartShops(List<CartShopsBean> cartShops) {
        this.cartShops = cartShops;
    }

    public static class CartShopsBean {
        /**
         * shopId : string
         * shopLogo : string
         * shopName : string
         * vShopId : string
         * products : [{"cartItemId":"string","color":"string","count":"string","id":"string","imgUrl":"string","name":"string","price":"string","size":"string","skuId":"string","status":0,"url":"string","version":"string","csvDesc":"string","isFavorite":true}]
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
             * cartItemId : string
             * color : string
             * count : string
             * id : string
             * imgUrl : string
             * name : string
             * price : string
             * size : string
             * skuId : string
             * status : 0
             * url : string
             * version : string
             * csvDesc : string
             * isFavorite : true
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
}
