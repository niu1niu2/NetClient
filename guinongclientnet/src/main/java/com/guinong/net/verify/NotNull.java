package com.guinong.net.verify;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author csn
 * @date 2017/7/26 0026 9:29
 * @content
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {

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

}
