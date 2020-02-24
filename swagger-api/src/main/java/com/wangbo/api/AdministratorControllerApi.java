package com.wangbo.api;

import com.wangbo.entity.Administrator;
import com.wangbo.entity.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author wangbo
 * @date 2020-02-24 17:56
 */
@Api(value="用户管理接口",description = "用户管理接口，提供数据模型注册，登录")
public interface AdministratorControllerApi {


    @ApiOperation("后台客户列表")
    public Administrator customerHoulist(String customerName, String email, String customerGroup);



    @ApiOperation("前端用户注册")
    public String addCustomer(Administrator administrator);


    @ApiOperation("前端用户修改")
    public String updateCustomer(Administrator administrator);



    @ApiOperation("地址添加")
    public String addAddress(Administrator administrator);


    @ApiOperation("地址修改")
    public String updateAddress(Administrator administrator);


}
