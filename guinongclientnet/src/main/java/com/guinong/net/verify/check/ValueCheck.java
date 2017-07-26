package com.guinong.net.verify.check;

import com.guinong.net.ValidateException;

import java.lang.reflect.Field;

/**
 * @author csn
 * @date 2017/7/26 0026 11:06
 * @content
 */
public abstract class ValueCheck implements IValueCheck {

    /**
     *
     * @param field
     * @param message
     */
    protected void throwValidateException(Field field,String message){
        throw new ValidateException(field,message);
    }

}
