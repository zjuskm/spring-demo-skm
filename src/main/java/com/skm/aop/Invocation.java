package com.skm.aop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zjuskm
 * 2019-09-22
 */
public class Invocation {
    private  Object[] params;

    private Method method;

    private Object target;

    public Invocation(Object target, Method method, Object[] params) {
        this.params = params;
        this.target = target;
        this.method = method;
    }

    // 以反射的形式调用原有的方法
    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target,params);
    }
}
