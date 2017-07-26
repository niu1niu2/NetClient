package com.guinong.net.verify.check;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author csn
 * @date 2017/7/26 0026 10:53
 * @content
 */
public interface IValueCheck {

    /**
     * @param annotation
     * @param value
     */
    void validate(Field field, Annotation annotation, Object value);

}
