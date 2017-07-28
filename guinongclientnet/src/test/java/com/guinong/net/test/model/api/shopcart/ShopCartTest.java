package com.guinong.net.test.model.api.shopcart;

import com.guinong.net.NetworkException;
import com.guinong.net.callback.IAsyncResultCallback;

import org.junit.Test;

import java.util.List;

/**
 * @author csn
 * @date 2017/7/27 0027 9:29
 * @content 这是测试购物车
 */
public class ShopCartTest {

    @Test
    public void getShopCartData() {
        ShopCartClient cartClient = new ShopCartClient();
        cartClient.shopCartData(new ShopCartRequest(),new IAsyncResultCallback<List<ShopCartRespon>>() {
            @Override
            public void onComplete(List<ShopCartRespon> shopCartRespons, Object userState) {
                if (shopCartRespons != null) {

                }
            }

            @Override
            public void onError(NetworkException error, Object userState) {
                error.getDetail();
            }
        }, "3");
        try {
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
