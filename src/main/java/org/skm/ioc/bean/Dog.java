package org.skm.ioc.bean;

import org.springframework.stereotype.Component;

/**
 * Created by zjuskm
 * 2019-09-21
 */
@Component("dog")
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】看门用");
    }
}
