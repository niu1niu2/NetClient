package com.guinong.net;

/**
 * @author csn
 * @date 2017/7/26 0026 13:44
 * @content
 */
public abstract class StringUtils {

    /**
     * 是否为 null 或空白值
     * @param value
     * @return
     */
    public static boolean isEmptyOrBlank(String value){
       return value==null || value.trim().length()==0;
    }

}
