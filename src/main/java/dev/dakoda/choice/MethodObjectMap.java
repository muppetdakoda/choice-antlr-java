package dev.dakoda.choice;

import java.lang.reflect.Method;

public class MethodObjectMap extends TripleMap {

    public Method getMethod(String name) {
        return (Method) super.getValue1(name);
    }

    public Object getObject(String name) {
        return super.getValue2(name);
    }

    public void put(String name, Method method, Object object) {
        super.put(name, method, object);
    }

    public Object[] get(String name) {
        return super.get(name);
    }
}
