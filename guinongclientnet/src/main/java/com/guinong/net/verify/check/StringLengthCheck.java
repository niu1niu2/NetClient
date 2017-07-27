package com.guinong.net.verify.check;

import com.guinong.net.StringUtils;
import com.guinong.net.verify.StringLength;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author wangyu
 * @time 2017/7/27 0027 on 上午 9:31
 * @desc
 */
public class StringLengthCheck extends ValueCheck{

    @Override
    public void validate(Field field, Annotation annotation, Object value) {
        if (value == null) {
            return;
        }
        StringLength stringLength = (StringLength) annotation;
        String msg = "";
        int max = stringLength.maxLength();
        int min = stringLength.minLength();
        String name = stringLength.friendlyName();
        if (StringUtils.isEmptyOrBlank(name)) {
            name = field.getName();
        }
        msg = name + "不能为空";
        if (value == null) {
            this.throwValidateException(field, msg);
        } else {
            String var = (String) value;
           if(var.length() > max){
               this.throwValidateException(field, name + "长度不能大于" + max);
           }else if(var.length() < min){
               this.throwValidateException(field, name + "长度不能小于" + min);
           }
        }
    }
}
