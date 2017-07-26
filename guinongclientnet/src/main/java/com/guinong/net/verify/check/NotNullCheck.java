package com.guinong.net.verify.check;

import com.guinong.net.StringUtils;
import com.guinong.net.verify.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author csn
 * @date 2017/7/26 0026 10:56
 * @content
 */
public class NotNullCheck extends ValueCheck {

    @Override
    public void validate(Field field, Annotation annotation, Object value) {
        NotNull notNull = (NotNull) annotation;
        String msg = notNull.errorMessage();
        if (StringUtils.isEmptyOrBlank(msg)) {
            String name = notNull.friendlyName();
            if (StringUtils.isEmptyOrBlank(name)) {
                name = field.getName();
            }
            msg = name + "不能为空";
        }
        if (value == null) {
            this.throwValidateException(field, msg);
        } else {
            if (field.getType().equals(String.class)) {
                if (value.toString().trim().length() == 0) {
                    this.throwValidateException(field, msg);
                }
            }
        }
    }
}
