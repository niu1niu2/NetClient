package com.guinong.net;

import android.content.Context;
import android.test.AndroidTestCase;

/**
 * @author csn
 * @date 2017/7/27 0027 17:25
 * @content
 */
public class TestContext extends AndroidTestCase {
    public static Context context;

    public void setUp() throws Exception {
        super.setUp();

        context = getContext();

        assertNotNull(context);

    }

    public void testSomething() {

        assertEquals(false, true);
    }
}
