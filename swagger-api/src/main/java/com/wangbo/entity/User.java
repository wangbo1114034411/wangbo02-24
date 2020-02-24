package com.wangbo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@ApiModel(value = "用户表",description = "用于接收测试数据")
@Data
@ToString
public class User {

    @ApiModelProperty(value = "用户ID",hidden = true)
    private Integer id;
    @ApiModelProperty(value = "用户名称",name = "name",example = "张三",required = true)
    private String name;
    @ApiModelProperty(value = "用户密码",name = "password",example = "123456",required = true)
    private String password;

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
