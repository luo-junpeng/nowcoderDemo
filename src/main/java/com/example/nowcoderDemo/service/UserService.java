package com.example.nowcoderDemo.service;

import com.example.nowcoderDemo.dao.UserMapper;
import com.example.nowcoderDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: ljp
 * @Time: 2022-04-30 19:17
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
