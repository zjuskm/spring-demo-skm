package com.ximalaya.ioc.bean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by zjuskm
 * 2019-09-21
 */
public class DatabaseConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return env.containsProperty("spring.datasource.driverName")
                && env.containsProperty("spring.datasource.url")
                && env.containsProperty("spring.datasource.username")
                && env.containsProperty("spring.datasource.password");
    }
}
