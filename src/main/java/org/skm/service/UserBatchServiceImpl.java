package org.skm.service;

import org.skm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zjuskm
 * 2019-09-24
 */
@Service
public class UserBatchServiceImpl implements UserBatchService {
    @Autowired
    private MyBatisUserService myBatisUserService = null;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.NOT_SUPPORTED)
    public int insertUsers(List<User> userList) {
        int count = 0;
        for (User user : userList) {
            myBatisUserService.insertUser(user);
            count += 1;
        }
        return count;
    }
}
