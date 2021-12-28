package com.ehxie.demo.controller;

import com.ehxie.demo.model.User;
import com.ehxie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

    @RequestMapping(value = "/addUser",method = {RequestMethod.POST})
    @ResponseBody
    public int addUser(@RequestBody User user) {
        System.out.println("addUser" + user);
        int result = userService.addUser(user);
        return result;
    }

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public String getUser(int id) {
        System.out.println("查询用户id为：" + id);
        User user  = userService.getUser(id);
        System.out.println("查询结果为：" + user);
        return "ok";
    }

    @RequestMapping(value = "/deleteUser")
    @ResponseBody
    public String deleteUser(int id) {
        System.out.println("删除用户id为：" + id);
        int result  = userService.deleteUser(id);
        System.out.println("删除结果为：" + result);
        return "ok";
    }

    @RequestMapping(value = "/updateUser",method = {RequestMethod.PUT})
    @ResponseBody
    public String updateUser(@RequestBody User user) {
        System.out.println("更新用户为：" + user);
        int result  = userService.updateUser(user);
        System.out.println("更新结果为：" + result);
        return "ok";
    }

    @RequestMapping(value = "/test", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String test(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }
}
