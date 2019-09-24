package com.skm.aop;

import java.lang.reflect.InvocationTargetException;

/**
 * 拦截器接口
 * Created by zjuskm
 * 2019-09-22
 */
public interface Interceptor {
    // 事前方法
    boolean before();

    // 事后方法
    void after();

    /**
     * 取代原有事件方法
     * @param invocation 毁掉参数，通过她的proceed方法，回调原有事件
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    // 是否返回方法，事件没有发生异常执行
    void afterRetruning();

    // 事后异常方法，当事件发生异常后执行
    void afterThrowing();

    // 是否使用around方法取代原有方法
    boolean useAround();

}
