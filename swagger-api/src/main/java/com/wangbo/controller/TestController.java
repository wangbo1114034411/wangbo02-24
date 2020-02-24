package com.wangbo.controller;


import com.wangbo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "swagger 测试",description = "swagger 测试,用户操作接口")
@RestController
public class TestController {


    @ApiOperation(value = "swagger测试",httpMethod = "GET")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "name",value = "姓名",required=true,paramType="path",dataType="String"),
//            @ApiImplicitParam(name = "password",value = "密码",required=true,paramType="path",dataType="String")
//    })
    @ApiImplicitParam(name = "name",value = "姓名",required=true,paramType="query",dataType="String")
    @GetMapping("/test")
    public User test01(String name){

        return  new User(1,name,"123");
    }



    @ApiOperation("新增页面")
    @PostMapping("postTest")
    public User postTest(@RequestBody  User user){

        return user;
    }
}
