package com.guinong.net.verify;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author csn
 * @date 2017/7/26 0026 9:48
 * @content
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberRange {

    /**
     * 友好的名称
     * @return
     */
    String friendlyName() default "";

    /**
     * 错误消息
     * @return
     */
    String errorMessage() default "";

    /**
     *
     * @return
     */
    double maxValue() default Double.MAX_VALUE;

    /**
     *
     * @return
     */
    double minValue() default Double.MIN_VALUE;

}
