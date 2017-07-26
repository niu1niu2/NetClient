package com.guinong.net;

import com.google.gson.reflect.TypeToken;
import com.guinong.net.callback.IAsyncEmptyCallback;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.request.IAsyncRequestState;
import com.guinong.net.test.model.HomeRequest;
import com.guinong.net.test.model.bean.HomeBean;
import com.guinong.net.test.model.bean.ResultBean2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;

/**
 * @author csn
 * @date 2017/7/26 0026 15:43
 * @content
 */
public class TestClient extends RequestClient {
    private static OkHttpClient mOkHttpClient = null;
    private static final int TIME_OUT = 35;

    static {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.connectTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpClientBuilder.writeTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpClientBuilder.readTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpClientBuilder.followRedirects(true); //设置重定向 其实默认也是true
        okHttpClientBuilder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslSession) {
                return true;
            }
        });
        //  okHttpClientBuilder.sslSocketFactory(HttpsUtils.initSSLSocketFactory(), HttpsUtils.initTrustManager());
        mOkHttpClient = okHttpClientBuilder.build();
    }

    public static final String SERVER_URL = "http://dev.guinong.com:8810/";

    @Override
    protected OkHttpClient getHttpClient() {
        return mOkHttpClient;
    }

    /**
     * @param request
     * @param callback
     * @param userState
     * @return
     */
    public IAsyncRequestState homeData(HomeRequest request, IAsyncResultCallback<List<ResultBean2>> callback, Object userState) {
        return apiPostRequest(new TypeToken<List<ResultBean2>>() {
                }.getType(), SERVER_URL + "api/AppSettingManager/GetPageData",
                request, callback, userState);
    }

    /**
     * @param request
     * @param callback
     * @param userState
     * @return
     */
    public IAsyncRequestState homeData2(HomeRequest request, IAsyncEmptyCallback callback, Object userState) {
        return apiPostRequest(SERVER_URL + "api/AppSettingManager/GetPageData",
                request, callback, userState);
    }

}
