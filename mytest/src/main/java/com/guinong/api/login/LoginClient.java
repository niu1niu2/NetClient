package com.guinong.api.login;

import android.content.Context;

import com.google.gson.reflect.TypeToken;
import com.guinong.api.ApiClient;
import com.guinong.api.Constant;
import com.guinong.net.RequestClient;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.request.IAsyncRequestState;


/**
 * @author csn
 * @date 2017/7/27 0027 10:31
 * @content
 */
public class LoginClient extends ApiClient {

    public IAsyncRequestState loginRequest(LoginRequest request, IAsyncResultCallback<LoginRespon> callback, Object userState) {
        return apiGetRequest(new TypeToken<LoginRespon>() {
                }.getType(), Constant.SERVER_URL + Constant.LOGIN,
                request, callback, userState);
    }

    /**
     * 登录验证码
     * @param request
     * @param callback
     * @param userState
     * @return
     */
    public IAsyncRequestState loginImageCodeRequest(LoginImageCodeRequest request, IAsyncResultCallback<LoginRespon> callback, Object userState) {
        return apiGetRequest(new TypeToken<LoginRespon>() {
                }.getType(), Constant.SERVER_URL + Constant.LOGIN_IMAGE_CODE,
                request, callback, userState);
    }

}
