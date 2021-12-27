package com.ehxie.demo.service;

import com.ehxie.demo.model.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();
}
