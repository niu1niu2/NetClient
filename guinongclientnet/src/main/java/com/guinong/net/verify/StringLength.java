package com.guinong.net.verify;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author csn
 * @date 2017/7/26 0026 9:36
 * @content
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringLength {

    /**
     * 友好的名称
     *
     * @return
     */
    String friendlyName() default "";

    /**
     * 错误消息
     * @return
     */
    String errorMessage() default "";

    int maxLength() default 0;

    int minLength() default 0;

}
