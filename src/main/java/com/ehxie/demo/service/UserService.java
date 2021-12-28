package com.ehxie.demo.service;

import com.ehxie.demo.model.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();
    /**
     * 新增用户
     * @return 影响行数
     */
    int addUser(User user);

    /**
     * 修改用户
     * @return 影响行数
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @return 影响行数
     */
    int deleteUser(int id);

    /**
     * 查询用户
     * @return 影响行数
     */
    User getUser(int id);
}
