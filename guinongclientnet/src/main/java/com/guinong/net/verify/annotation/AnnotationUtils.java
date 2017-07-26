package com.guinong.net.verify.annotation;

import com.guinong.net.verify.EmailFormat;
import com.guinong.net.verify.MobilePhoneFormat;
import com.guinong.net.verify.NumberRange;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;

/**
 * @author csn
 * @date 2017/7/26 0026 10:32
 * @content
 */
public abstract class AnnotationUtils {

    private static Map<Class<?>, Set<Class<?>>> supports = new HashMap<>();

    static {
        Set<Class<?>> annSet = new HashSet<>();
        annSet.add(BigDecimal.class);
        annSet.add(short.class);
        supports.put(Short.class, annSet);
        annSet.add(byte.class);
        supports.put(Byte.class, annSet);
        annSet.add(int.class);
        supports.put(Integer.class, annSet);
        annSet.add(long.class);
        supports.put(Long.class, annSet);
        annSet.add(float.class);
        annSet.add(Float.class);
        annSet.add(double.class);
        annSet.add(Double.class);
        supports.put(NumberRange.class, annSet);

        annSet = new HashSet<>();
        annSet.add(String.class);
        supports.put(EmailFormat.class, annSet);

        annSet = new HashSet<>();
        annSet.add(String.class);
        supports.put(MobilePhoneFormat.class, annSet);
    }

    /**
     * @param field
     * @param annotation
     */
    public static void check(Field field, Annotation annotation) {
        Set<Class<?>> annSet = supports.get(annotation.getClass());
        if (annSet != null) {
            if (!annSet.contains(field.getType())) {
                String msg = "类[" + field.getDeclaringClass().getName() + "]的字段[" + field.getName() + "]类型为 " + field.getType().getName();
                throw new RuntimeException(msg + " 不支持注解类型 " + annotation.getClass().getName());
            }
        }
    }

}
