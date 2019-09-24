//package com.ximalaya.model;
//
//import javax.persistence.AttributeConverter;
//
///**
// * 性别转换器
// * Created by zjuskm
// * 2019-09-22
// */
//public class SexConverter implements AttributeConverter<SexEnum, Integer> {
//    // 将枚举转换为数据库列
//    @Override
//    public Integer convertToDatabaseColumn(SexEnum sex) {
//        return sex.getId();
//    }
//
//    // 将数据库列转换为枚举
//    @Override
//    public SexEnum convertToEntityAttribute(Integer id) {
//        return SexEnum.getEnumById(id);
//    }
//}
