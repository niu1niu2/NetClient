package com.guinong.net;

/**
 * @author csn
 * @date 2017/7/26 0026 9:22
 * @content
 */
public abstract class ExceptionUtils {

    /**
     *
     * @param value
     * @param paramName
     * @param <T>
     * @return
     */
    public static <T> T checkNotNull(T value, String paramName) {
        if (value == null) {
            if (paramName == null) {
                paramName = "";
            }
            throw new NullPointerException("参数" + paramName + "不能为空");
        }
        return value;
    }


}
