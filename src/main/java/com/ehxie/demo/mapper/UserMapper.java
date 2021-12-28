package com.ehxie.demo.mapper;

import com.ehxie.demo.model.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户信息
     * @return 用户信息列表
     */
    List<User> selectAllUser();

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
