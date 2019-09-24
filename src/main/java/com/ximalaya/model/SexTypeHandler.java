package com.ximalaya.model;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zjuskm
 * 2019-09-22
 */
// 声明JdbcType为整型
@MappedJdbcTypes(JdbcType.INTEGER)
// 声明JavaType为SexEnum
@MappedTypes(value = SexEnum.class)
public class SexTypeHandler implements TypeHandler<SexEnum> {

    @Override
    public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        //设置第i个参数的值为传入sex的code值，preparedStatement为执行数据库操纵的对象
        //传值的时候是一个sex对象，但是当进行映射插入的时候就会转化为sex的code值进行存储
        ps.setInt(i, parameter.getId());
    }

    @Override
    public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
        int sex = rs.getInt(columnName);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    @Override
    public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        int sex = rs.getInt(columnIndex);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }

    @Override
    public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        int sex = cs.getInt(columnIndex);
        if (sex != 1 && sex != 2) {
            return null;
        }
        return SexEnum.getEnumById(sex);
    }
}
