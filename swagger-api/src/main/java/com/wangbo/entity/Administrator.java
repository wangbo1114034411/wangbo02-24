package com.wangbo.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;

/**
 * @author wangbo
 * @date 2020-02-24 17:54
 */
@ApiModel(value = "用户表",description = "用于用户展示等")
@Data
@ToString
public class Administrator {
    private int id;
    private String username;
    private String email;
    private long telephone;
    private String password;
    private String content;
}
