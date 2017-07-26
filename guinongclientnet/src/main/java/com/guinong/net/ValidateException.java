package com.guinong.net;

import java.lang.reflect.Field;

/**
 * @author csn
 * @date 2017/7/26 0026 11:01
 * @content
 */
public class ValidateException extends RuntimeException {
   private Field field;

    /**
     *
     * @param field
     * @param message
     */
    public ValidateException(String message) {
        super(message);
        this.field = null;
    }

    /**
     *
     * @param field
     * @param message
     */
    public ValidateException(Field field, String message) {
        super(message);
        this.field = field;
    }

    /**
     *
     * @return
     */
    public Field getField() {
        return field;
    }
}
