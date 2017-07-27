package com.guinong.net.test.model.api.login;

import com.guinong.net.NetworkException;
import com.guinong.net.callback.IAsyncResultCallback;

import org.junit.Test;

/**
 * @author csn
 * @date 2017/7/27 0027 10:30
 * @content
 */
public class LoginTest {
    /**
     * 测试登录
     */
    @Test
    public void login() {
        LoginRequest request = new LoginRequest();
        request.setUserName("18786712371");
        request.setPassword("xh123456");
        LoginClient client = new LoginClient();
        client.loginRequest(request, new IAsyncResultCallback<LoginRespon>() {
            @Override
            public void onComplete(LoginRespon loginRespon, Object userState) {
                if (loginRespon!=null){

                }
            }

            @Override
            public void onError(NetworkException error, Object userState) {
                error.getDetail();
            }
        }, 1);
        try {
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
