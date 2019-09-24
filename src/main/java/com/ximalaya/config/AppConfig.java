package com.ximalaya.config;

import com.ximalaya.model.User;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zjuskm
 * 2019-09-21
 */
@Configuration
@ComponentScan(basePackages = "com.ximalaya.model", lazyInit = true)
public class AppConfig {
    private static Logger log = Logger.getLogger(AppConfig.class);

    @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(2l);
        user.setUserName("user_name_2");
        user.setNote("note_2");
        return user;
    }


}
