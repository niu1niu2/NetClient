package com.guinong.net.test.model.api.login;

import com.google.gson.reflect.TypeToken;
import com.guinong.net.RequestClient;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.request.IAsyncRequestState;
import com.guinong.net.test.model.api.Constant;
import com.guinong.net.test.model.bean.ResultBean2;

import java.util.List;

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
        return apiGetRequest(new TypeToken<List<ResultBean2>>() {
                }.getType(), Constant.SERVER_URL + Constant.LOGIN,
                request, callback, userState);
    }

}
