package com.guinong.net.verify;

import com.guinong.net.ExceptionUtils;
import com.guinong.net.verify.check.IModelCheck;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author csn
 * @date 2017/7/26 0026 9:53
 * @content
 */
public class VerifyManager {

    private static Map<Class<?>, Set<VerifyElement>> verifyElements = new HashMap<>();

    /**
     * 获取注解集
     *
     * @param objectClass
     * @return
     */
    public static Set<VerifyElement> annotationSet(Class<?> objectClass) {
        ExceptionUtils.checkNotNull(objectClass, "objectClass");
        synchronized (verifyElements) {
            Set<VerifyElement> set = verifyElements.get(objectClass);
            if (set != null) {
                return set;
            }
            set = readVerifyElementSet(objectClass);
            verifyElements.put(objectClass, set);
            return set;
        }
    }


    /**
     * 验证
     *
     * @param model
     */
    public static void validate(Object model) {
        ExceptionUtils.checkNotNull(model, "model");
        Set<VerifyElement> elSet = annotationSet(model.getClass());
        for (VerifyElement el : elSet) {
            el.verify(model);
        }
        if(model instanceof IModelCheck){
            ((IModelCheck)model).validate();
        }
    }

    private static Set<VerifyElement> readVerifyElementSet(Class<?> objectClass) {
        Set<VerifyElement> elSet = new HashSet<>();
        Class<?> typeClass = objectClass;
        while (typeClass != null) {
            Field[] fields = typeClass.getDeclaredFields();
            for (Field field : fields) {
                elSet.add(new VerifyElement(field, field.getAnnotations()));
            }
            typeClass = typeClass.getSuperclass();
        }
        return elSet;
    }


}
