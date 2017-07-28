package com.guinong.api;

import android.content.Context;

import com.guinong.net.RequestClient;
import com.guinong.net.cookie.CookierManager;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;

/**
 * @author csn
 * @date 2017/7/28 0028 15:47
 * @content
 */
public class ApiClient extends RequestClient {

    protected static OkHttpClient mOkHttpClient = null;
    private static final int TIME_OUT = 35;

    public static void contextInit(Context context) {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.connectTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpClientBuilder.writeTimeout(TIME_OUT, TimeUnit.SECONDS);
        okHttpClientBuilder.readTimeout(TIME_OUT, TimeUnit.SECONDS);
        if (context != null) {
            okHttpClientBuilder.cookieJar(new CookierManager(context));
        }
        okHttpClientBuilder.followRedirects(true); //设置重定向 其实默认也是true
        okHttpClientBuilder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String s, SSLSession sslSession) {
                return true;
            }
        });
        mOkHttpClient = okHttpClientBuilder.build();
    }

    static {
        if (mOkHttpClient == null) {
            contextInit(null);
        }
    }

    public ApiClient() {

    }

    @Override
    protected OkHttpClient getHttpClient() {
        return mOkHttpClient;
    }
}
