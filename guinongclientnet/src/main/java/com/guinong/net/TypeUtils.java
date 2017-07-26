package com.guinong.net;

/**
 * @author csn
 * @date 2017/7/26 0026 11:24
 * @content
 */
public abstract class TypeUtils {

    /**
     *
     * @param typeClass
     * @return
     */
    public static boolean isIntegerType(Class<?> typeClass){
        if(typeClass==null){
            return false;
        }
      return  typeClass.equals(byte.class) || typeClass.equals(Byte.class)
                || typeClass.equals(short.class) || typeClass.equals(Short.class)
                || typeClass.equals(int.class) || typeClass.equals(Integer.class)
                || typeClass.equals(long.class) || typeClass.equals(Long.class);
    }

}
