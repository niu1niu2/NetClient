package com.guinong.shopcart;

import android.content.Context;

import com.google.gson.reflect.TypeToken;
import com.guinong.Constant;
import com.guinong.net.RequestClient;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.request.IAsyncRequestState;

import java.util.List;

/**
 * @author csn
 * @date 2017/7/27 0027 16:37
 * @content
 */
public class ShopCartClient extends RequestClient {
    public ShopCartClient(Context context) {
        super(context);
        this.setUnitTest(true);
    }

    public IAsyncRequestState shopCartData(ShopCartRequest request, IAsyncResultCallback<List<ShopCartRespon>> callback, Object userState) {
        return apiGetRequest(new TypeToken<List<ShopCartRespon>>() {
                }.getType(), Constant.SERVER_URL + Constant.SHOP_CART_DATA,
                request, callback, userState);
    }
}
