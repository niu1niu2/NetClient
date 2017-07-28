package com.guinong.net;

import com.google.gson.reflect.TypeToken;
import com.guinong.net.callback.IAsyncEmptyCallback;
import com.guinong.net.callback.IAsyncResultCallback;
import com.guinong.net.request.IAsyncRequestState;
import com.guinong.net.test.model.HomeRequest;
import com.guinong.net.test.model.bean.ResultBean2;

import java.util.List;

/**
 * @author csn
 * @date 2017/7/26 0026 15:43
 * @content
 */
public class TestClient extends RequestClient {


    public static final String SERVER_URL = "http://dev.guinong.com:8810/";


    public TestClient() {
        super(null);
        this.setUnitTest(true);
    }


    /**
     * 这是对象型  也就是result中的数据是list类型
     *
     * @param request
     * @param callback
     * @param userState
     * @return
     */
    public IAsyncRequestState homeData(HomeRequest request, IAsyncResultCallback<List<ResultBean2>> callback, Object userState) {
        return apiPostRequest(new TypeToken<List<ResultBean2>>() {}.getType(), SERVER_URL + "api/AppSettingManager/GetPageData", request, callback, userState);
    }

    /**
     * 这是对象型  也就是result中的数据是对象型
     *
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
