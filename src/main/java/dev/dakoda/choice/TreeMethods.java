package dev.dakoda.choice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TreeMethods {

    private static MethodObjectMap methods = new MethodObjectMap();

    public static void register(String methodName, Object object) {
        try {
            methods.put(methodName, object.getClass().getMethod(methodName), object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void invoke(String name) {
        try {
            Method method = methods.getMethod(name);
            if (method != null) {
                method.invoke(methods.getObject(name));
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}