package com.guinong;

import android.app.Application;
import android.content.Context;

import com.guinong.api.ApiClient;

/**
 * @author csn
 * @date 2017/7/28 0028 10:04
 * @content
 */
public class AppLication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();
        ApiClient.contextInit(context);
    }
}
