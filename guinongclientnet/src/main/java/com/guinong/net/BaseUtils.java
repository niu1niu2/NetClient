package com.guinong.net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wangyu
 * @time 2017/7/27 0027 on 上午 11:54
 * @desc
 */
public class BaseUtils {

    /**
     * 检测电话号码
     * @param mobile
     * @return
     */
    public static boolean isBasePhone(String mobile){
        Pattern p1 = Pattern
                .compile("^((13[0-9])|(15[^4,\\D])|(177)|(18[0,5-9]))\\d{8}$");
        Matcher m1 = p1.matcher(mobile);
        return m1.matches();
    }


    public static boolean isPhoneNum(String mobiles){
        Pattern p2 = Pattern.compile("^(\\+?86)\\d{11}$");
        Matcher m = p2.matcher(mobiles);
        if(mobiles.length()==11){
            return isBasePhone(mobiles);

        }else if(mobiles.length()>11 && m.matches()){
            String mobile=mobiles.substring(3);
            return isBasePhone(mobile);
        }
        return false;

    }

    /**
     * 检测email
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String str = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
