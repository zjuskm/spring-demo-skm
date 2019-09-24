package com.ximalaya.ioc.bean;

import org.springframework.stereotype.Component;

/**
 * Created by zjuskm
 * 2019-09-21
 */
@Component("cat")
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【"+ Cat.class.getSimpleName() +"】抓老鼠");
    }
}
