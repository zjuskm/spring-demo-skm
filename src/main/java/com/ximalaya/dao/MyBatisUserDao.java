package com.ximalaya.dao;

import com.ximalaya.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zjuskm
 * 2019-09-22
 */
@Repository
public interface MyBatisUserDao {
    User getUser(Long id);

    int insertUser(User user);
}
