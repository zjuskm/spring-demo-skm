package com.ximalaya.service;

import com.ximalaya.model.User;

import java.util.List;

/**
 * Created by zjuskm
 * 2019-09-24
 */
public interface UserBatchService {
    public int insertUsers(List<User> userList);
}
