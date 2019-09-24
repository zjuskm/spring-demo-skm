package com.skm.service;

import com.skm.model.User;

import java.util.List;

/**
 * Created by zjuskm
 * 2019-09-24
 */
public interface UserBatchService {
    public int insertUsers(List<User> userList);
}
