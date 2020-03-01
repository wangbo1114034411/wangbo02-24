package com.wangbo.ucenter.controller;


import com.wangbo.ucenter.ext.XcUserExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {

    @Autowired


    //根据账号查询用户信息
    @GetMapping("/ucenter/getuserext")
    public XcUserExt getUserext(@RequestParam("username") String username){


        return new XcUserExt();
    }
}
