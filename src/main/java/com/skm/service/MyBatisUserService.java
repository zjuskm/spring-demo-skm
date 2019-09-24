package com.skm.service;

import com.skm.model.User;

/**
 * Created by zjuskm
 * 2019-09-22
 */
public interface MyBatisUserService {
    User getUser(Long id);

    int insertUser(User user);
}
