//package com.ximalaya.controller;
//
//import com.ximalaya.dao.JpaUserRepository;
//import com.ximalaya.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Created by zjuskm
// * 2019-09-22
// */
//@RestController
//@RequestMapping("/jpa")
//public class JpaController {
//    @Autowired
//    private JpaUserRepository jpaUserRepository = null;
//
//    @RequestMapping("/getUser")
//    public User getUser(Long id) {
//        User user = jpaUserRepository.findById(id).get();
//        return user;
//    }
//}
