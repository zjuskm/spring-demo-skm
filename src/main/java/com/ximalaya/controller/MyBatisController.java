package com.ximalaya.controller;

import com.ximalaya.model.User;
import com.ximalaya.service.MyBatisUserService;
import com.ximalaya.service.UserBatchService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zjuskm
 * 2019-09-22
 */
@RestController
@RequestMapping("/mybatis")
public class MyBatisController {
    private static org.apache.log4j.Logger log = Logger.getLogger(MyBatisController.class);
    @Autowired
    private MyBatisUserService myBatisUserService = null;

    @Autowired
    private UserBatchService userBatchService = null;

    @GetMapping("/getUser")
    public User getUser(@RequestParam(value = "id") Long id) {
        log.info("start MybatisController api");
        return myBatisUserService.getUser(id);
    }

    @PostMapping("/insertUser")
    public Map<String, Object> insertUser(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "note") String note) {
        log.info("start to insert user to db");
        User user = new User();
        user.setUserName(userName);
        user.setNote(note);
         myBatisUserService.insertUser(user);
        Map<String, Object> res = new HashMap<>();
//        res.put("success", update == 1);
        res.put("user", user);

        return res;
    }

    @PostMapping("/insertUsers")
    public Map<String, Object> insertUsers(
            @RequestParam(value = "userName1") String userName1,
            @RequestParam(value = "note1") String note1,
            @RequestParam(value = "userName2")String userName2,
            @RequestParam(value = "note2")String note2) {
        User user1 = new User();
        user1.setUserName(userName1);
        user1.setNote(note1);
        User user2 = new User();
        user2.setUserName(userName2);
        user2.setNote(note2);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        int inserts = userBatchService.insertUsers(userList);
        Map<String, Object> res = new HashMap<>();
        res.put("success", inserts > 0);
        res.put("user", userList);
        return res;
    }
}
