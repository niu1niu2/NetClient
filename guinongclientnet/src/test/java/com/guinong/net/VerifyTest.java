package com.guinong.net;

import com.guinong.net.callback.IAsyncEmptyCallback;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.test.model.OrderInfo;
import com.guinong.net.test.model.HomeRequest;
import com.guinong.net.test.model.bean.ResultBean2;
import com.guinong.net.verify.VerifyManager;

import org.junit.Test;

import java.util.List;

/**
 * @author csn
 * @date 2017/7/26 0026 11:54
 * @content
 */
public class VerifyTest {
    public static final String HOST = "http://dev.guinong.com:8810/";

    @Test
    public void notNullTest() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setId("1234");
        orderInfo.setName("张三");
        VerifyManager.validate(orderInfo);
    }

    private void doSleep(){
        synchronized (this){
            try {
                Thread.sleep(1000);
                if(isWait){
                    doSleep();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isWait = false;

    /**
     * 这是result中的是list数据
     */
    @Test
    public void homeTestList() {
        HomeRequest pars = new HomeRequest();
        pars.setPageId(-1);
        TestClient test = new TestClient();
        isWait = true;
        test.homeData(pars, new IAsyncResultCallback<List<ResultBean2>>() {
            @Override
            public void onComplete(List<ResultBean2> items, Object userState) {
                if (items == null) {
                    isWait =false;
                }
            }

            @Override
            public void onError(NetworkException error, Object userState) {
                System.out.print(error.getMessage());
                if (error == null) {

                }
                isWait =false;
            }
        }, null);

        doSleep();

    }

    /**
     * result中是单个对象的
     */
    @Test
    public void homeTestMode() {
        HomeRequest pars = new HomeRequest();
        pars.setPageId(4);
        TestClient test = new TestClient();
        test.homeData2(pars, new IAsyncEmptyCallback() {

            @Override
            public void onError(NetworkException error, Object userState) {
                if (error == null) {

                }
            }

            @Override
            public void onComplete(Object userState) {
                if (userState != null) {

                }
            }
        }, 5896665);

        try {
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
