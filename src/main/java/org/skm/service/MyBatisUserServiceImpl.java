package org.skm.service;

import org.skm.dao.MyBatisUserDao;
import org.skm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zjuskm
 * 2019-09-22
 */
@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {
    @Autowired
    private MyBatisUserDao myBatisUserDao = null;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 3)
    public User getUser(Long id) {
        return myBatisUserDao.getUser(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 3)
    public int insertUser(User user) {
        return myBatisUserDao.insertUser(user);
    }

}
