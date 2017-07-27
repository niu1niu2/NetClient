package com.guinong.net.verify.check;

import com.guinong.net.BaseUtils;
import com.guinong.net.StringUtils;
import com.guinong.net.verify.MobilePhoneFormat;
import com.guinong.net.verify.StringLength;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author wangyu
 * @time 2017/7/27 0027 on 上午 11:36
 * @desc
 */
public class MobilePhoneCkeck  extends ValueCheck{


    @Override
    public void validate(Field field, Annotation annotation, Object value) {
        if (value == null) {
            return;
        }
        MobilePhoneFormat mobilePhoneFormat = (MobilePhoneFormat) annotation;
        String msg = "";
        int mLenth = mobilePhoneFormat.Length();
        String name = mobilePhoneFormat.friendlyName();
        if (StringUtils.isEmptyOrBlank(name)) {
            name = field.getName();
        }
        msg = name + "不能为空";
        if (value == null) {
            this.throwValidateException(field, msg);
        } else {
            String var = (String) value;
            if(var.length() != mLenth){
                this.throwValidateException(field, name + "长度不等于" + mLenth);
            }
            if(!BaseUtils.isBasePhone(var)){
                this.throwValidateException(field, name + "不合法,请确认后输入");
            }
        }
    }
}
