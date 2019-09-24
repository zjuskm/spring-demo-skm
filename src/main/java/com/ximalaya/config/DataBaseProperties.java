//package com.ximalaya.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
///**
// * Created by zjuskm
// * 2019-09-21
// */
//@Component
//@ConfigurationProperties("spring.datasource")
//public class DataBaseProperties {
//    @Value("${spring.datasource.driverName}")
//    private String driverName = null;
//
//    @Value("${spring.datasource.url}")
//    private String url = null;
//
//    private String username = null;
//
//    private String password = null;
//
//    public void setDriverName(String driverName) {
//        System.out.println(driverName);
//        this.driverName = driverName;
//    }
//
//    public void setUrl(String url) {
//        System.out.println(url);
//        this.url = url;
//    }
//
//    @Value("${spring.datasource.username}")
//    public void setUsername(String username) {
//        System.out.println(username);
//        this.username = username;
//    }
//
//    @Value("${spring.datasource.password}")
//    public void setPassword(String password) {
//        System.out.println(password);
//        this.password = password;
//    }
//
//    public String getDriverName() {
//        return driverName;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//}
