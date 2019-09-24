package com.ximalaya.dao;

import com.ximalaya.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by zjuskm
 * 2019-09-22
 */
public class UserDao {
    public int insertUser(Connection conn, User user) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into t_user(use_name, note) values (?, ?)");
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getNote());
            return ps.executeUpdate();
        } finally {
            ps.close();
        }
    }
}
