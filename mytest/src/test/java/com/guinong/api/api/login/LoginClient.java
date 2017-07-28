package com.guinong.api.api.login;

import com.google.gson.reflect.TypeToken;
import com.guinong.net.RequestClient;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.request.IAsyncRequestState;
import com.guinong.net.test.model.api.Constant;
import com.guinong.net.test.model.api.login.LoginImageCodeRequest;
import com.guinong.net.test.model.api.login.LoginRequest;
import com.guinong.net.test.model.api.login.LoginRespon;

/**
 * @author csn
 * @date 2017/7/27 0027 10:31
 * @content
 */
public class LoginClient extends RequestClient {
    public LoginClient() {
        this.setUnitTest(true);
    }

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
