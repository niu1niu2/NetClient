package com.guinong.net.verify.check;

import com.guinong.net.StringUtils;
import com.guinong.net.verify.NumberRange;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author csn
 * @date 2017/7/26 0026 11:13
 * @content
 */
public class NumberRangeCheck extends ValueCheck {

    @Override
    public void validate(Field field, Annotation annotation, Object value) {
        if (value == null) {
            return;
        }
        NumberRange numberRange = (NumberRange) annotation;
        String name = numberRange.friendlyName();
        if (StringUtils.isEmptyOrBlank(name)) {
            name = field.getName();
        }
        Double fieldValue;
        if (value instanceof Double) {
            fieldValue = (Double) value;
        } else {
            fieldValue = Double.parseDouble(value.toString());
        }
        validate(field, name, numberRange, fieldValue);
    }

    public void validate(Field field, String name, NumberRange annotation, double value) {
        if (value > annotation.maxValue()) {
            if (StringUtils.isEmptyOrBlank(annotation.errorMessage())) {
                this.throwValidateException(field, name + "的值不能大于" + annotation.maxValue());
            } else {
                this.throwValidateException(field, annotation.errorMessage());
            }
        }
        if (value < annotation.minValue()) {
            if (StringUtils.isEmptyOrBlank(annotation.errorMessage())) {
                this.throwValidateException(field, name + "的值不能小于" + annotation.minValue());
            } else {
                this.throwValidateException(field, annotation.errorMessage());
            }
        }
    }
}
