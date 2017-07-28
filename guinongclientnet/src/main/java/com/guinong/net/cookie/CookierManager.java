package com.guinong.net.cookie;

import android.content.Context;
import android.test.mock.MockContext;


import com.guinong.net.TestContext;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * @author csn
 * @date 2017/7/6 0006 9:55
 * @content
 */
public class CookierManager implements CookieJar {
    private final PersistentCookieStore cookieStore ;

    public CookierManager(Context context) {
        cookieStore = new PersistentCookieStore(context);
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        if (cookies != null && cookies.size() > 0) {
            for (Cookie item : cookies) {
                cookieStore.add(url, item);
            }
        }
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> cookies = cookieStore.get(url);
        return cookies;
    }
}
