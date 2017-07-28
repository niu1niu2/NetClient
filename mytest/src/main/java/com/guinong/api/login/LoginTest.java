package com.guinong.api.login;

import com.guinong.AppLication;
import com.guinong.net.NetworkException;
import com.guinong.net.callback.IAsyncResultCallback;


/**
 * @author csn
 * @date 2017/7/27 0027 10:30
 * @content
 */
public class LoginTest {
    LoginClient client = new LoginClient(AppLication.context);


    /**
     * 测试登录
     */

    public void login() {

        LoginRequest request = new LoginRequest();
        request.setUserName("18089697084");
        request.setPassword("wy235479");
        request.setImgcode("4630");
        client.loginRequest(request, new IAsyncResultCallback<LoginRespon>() {
            @Override
            public void onComplete(LoginRespon loginRespon, Object userState) {
                if (loginRespon != null) {

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


    public void loginImageCode() {
        LoginImageCodeRequest phone = new LoginImageCodeRequest();
        phone.setPhone("18089697084");
        client.loginImageCodeRequest(phone, new IAsyncResultCallback<LoginRespon>() {
            @Override
            public void onComplete(LoginRespon loginRespon, Object userState) {
                if (loginRespon != null) {

                }
            }

            @Override
            public void onError(NetworkException error, Object userState) {
                error.getDetail();
            }
        }, "2");
        try {
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
