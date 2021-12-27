package com.ehxie.demo.controller;

import com.alibaba.fastjson.JSON;
import com.ehxie.demo.model.User;
import com.ehxie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
