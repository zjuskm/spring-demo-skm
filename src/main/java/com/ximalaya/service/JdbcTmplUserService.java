package com.ximalaya.service;

import com.ximalaya.model.User;

import java.util.List;

/**
 * Created by zjuskm
 * 2019-09-22
 */
public interface JdbcTmplUserService {
    public User getUser(Long id);

    public List<User> findUsers(String userName, String note);

    public int insertUser(User user);

    public int updateUser(User user);

    int deleteUser(Long id);
}
