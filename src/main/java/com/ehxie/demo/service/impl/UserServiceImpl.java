package com.ehxie.demo.service.impl;

import com.ehxie.demo.mapper.UserMapper;
import com.ehxie.demo.model.User;
import com.ehxie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public int addUser(User user) {
        System.out.println(user);
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }
}
