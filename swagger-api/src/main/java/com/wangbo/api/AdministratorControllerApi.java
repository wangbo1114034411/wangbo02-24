package com.wangbo.api;

import com.wangbo.dto.in.*;
import com.wangbo.dto.out.AdministratorGetProfileOutDTO;
import com.wangbo.dto.out.AdministratorListOutDTO;
import com.wangbo.dto.out.AdministratorShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-26 16;15
 */
@Api(value = "用户表",description = "用户查询添加，登录")
public interface AdministratorControllerApi {

    @ApiOperation(value = "用户登录",httpMethod = "GET")
    public String login(AdministratorLoginInDTO administratorLoginInDTO);

    @ApiOperation(value = "用户查询",httpMethod = "GET")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId);

    @ApiOperation(value = "用户修改",httpMethod = "Post")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO);

    @ApiOperation(value = "获取用户密码",httpMethod = "GET")
    public String getPwdResetCode(@RequestParam String email);

    @ApiOperation(value = "修改密码",httpMethod = "Post")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO);

    @ApiOperation(value = "获取用户列表",httpMethod = "GET")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum);

    @ApiOperation(value = "根据id获取用户列表",httpMethod = "GET")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId);

    @ApiOperation(value = "删除用户数据",httpMethod = "Post")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO);

    @ApiOperation(value = "用户修改",httpMethod = "Post")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO);

    @ApiOperation(value = "用户删除",httpMethod = "Post")
    public void delete(@RequestBody Integer adminstratorId);

    public void batchDelete(@RequestBody List<Integer> administratorIds);
}
