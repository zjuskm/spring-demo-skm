package com.skm.service;

import com.skm.dao.UserDao;
import com.skm.model.User;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by zjuskm
 * 2019-09-21
 */
@Service
public class UserService {
    public void printUser(User user) {
        System.out.println("编号：" + user.getId());
        System.out.println("用户名字：" + user.getUserName());
        System.out.println("备注：" + user.getNote());
    }

    public int insertUser() {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setNote("note_1");
        user.setUserName("user_name_1");
        Connection conn = null;
        int result = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.3.220:3306/recsys?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true");
            conn.setAutoCommit(false);
            result = userDao.insertUser(conn,user);
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }


}
