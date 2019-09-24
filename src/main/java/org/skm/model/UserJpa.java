//package com.ximalaya.model;
//
//import javax.persistence.*;
//
///**
// * Created by zjuskm
// * 2019-09-22
// */
//@Entity(name = "user")
//@Table(name = "t_user")
//public class UserJpa {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name="user_name")
//    private String userName;
//
//    @Column(name = "note")
//    private String note;
//
//    @Convert(converter = SexConverter.class)
//    private SexEnum sex = null;
//}
