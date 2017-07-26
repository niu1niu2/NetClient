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
        boolean isCheckMax = Math.abs(numberRange.maxValue() - Double.MAX_VALUE) <= 0.01;
        boolean isCheckMin = Math.abs(numberRange.minValue() - Double.MIN_VALUE) <= 0.01;
        if (!isCheckMax && !isCheckMin) {
            return;
        }
        String name = numberRange.friendlyName();
        if (StringUtils.isEmptyOrBlank(name)) {
            name = field.getName();
        }
        validate(field, name, numberRange, (double) value, isCheckMax, isCheckMin);
    }

    public void validate(Field field, String name, NumberRange annotation, double value, boolean isCheckMax, boolean isCheckMin) {
        if (isCheckMax) {
            if (value > annotation.maxValue()) {
                if (StringUtils.isEmptyOrBlank(annotation.errorMessage())) {
                    this.throwValidateException(field, name + "的值不能大于" + annotation.maxValue());
                } else {
                    this.throwValidateException(field, annotation.errorMessage());
                }
            }
        }
        if (isCheckMin) {
            if (value < annotation.minValue()) {
                if (StringUtils.isEmptyOrBlank(annotation.errorMessage())) {
                    this.throwValidateException(field, name + "的值不能小于" + annotation.minValue());
                } else {
                    this.throwValidateException(field, annotation.errorMessage());
                }
            }
        }
    }
}
