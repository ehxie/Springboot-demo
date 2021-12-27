package com.ehxie.demo.mapper;

import com.ehxie.demo.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户信息
     * @return 用户信息列表
     */
    @Select("select * from user")
    List<User> selectAllUser();
}
