package org.skm.aop;

/**
 * Created by zjuskm
 * 2019-09-22
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name==null || name.trim() =="") {
            throw new RuntimeException("Parameter is null!");
        }
        System.out.println("hello " + name);
    }
}
