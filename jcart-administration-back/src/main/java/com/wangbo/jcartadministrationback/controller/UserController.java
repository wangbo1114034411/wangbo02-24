package com.wangbo.jcartadministrationback.controller;


import com.wangbo.entity.User;
import com.wangbo.jcartadministrationback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
、
 */
@Controller
public class UserController {


    @Autowired
    UserService userService;



    //查询是否存在用户名
    @RequestMapping("/selectByName")
    @ResponseBody
    public boolean selectByName(String name1){
        boolean flag = userService.selectByName(name1);

        return flag;
    }


    //登录
    @PostMapping("/loginUser")
    @ResponseBody
    public int loginUser(User user, HttpSession session){
        System.out.println(user);
        int num = userService.loginUser(user,session);

        return num;
    }

    //注册
    @RequestMapping("/addUser")
    @ResponseBody
    public boolean addUser(User user){
        boolean flag = userService.addUser(user);

        return flag;
    }
}

