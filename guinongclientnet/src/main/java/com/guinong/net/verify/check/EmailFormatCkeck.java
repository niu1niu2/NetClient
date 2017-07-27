package com.guinong.net.verify.check;

import com.guinong.net.BaseUtils;
import com.guinong.net.StringUtils;
import com.guinong.net.verify.EmailFormat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author wangyu
 * @time 2017/7/27 0027 on 下午 13:43
 * @desc
 */
public class EmailFormatCkeck extends ValueCheck{

    @Override
    public void validate(Field field, Annotation annotation, Object value) {
        if (value == null) {
            return;
        }
        EmailFormat emailFormat = (EmailFormat) annotation;
        String msg = "";
        String name = emailFormat.friendlyName();
        if (StringUtils.isEmptyOrBlank(name)) {
            name = field.getName();
        }
        msg = name + "不能为空";
        if (value == null) {
            this.throwValidateException(field, msg);
        } else {
            String var = (String) value;
            if(!BaseUtils.isEmail(var)){
                this.throwValidateException(field, name + "不合法,请确认后输入");
            }
        }
    }
}
