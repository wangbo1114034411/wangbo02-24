package com.wangbo.api;


import com.wangbo.model.response.ResponseResult;
import com.wangbo.ucenter.request.LoginRequest;
import com.wangbo.ucenter.response.JwtResult;
import com.wangbo.ucenter.response.LoginResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Administrator.
 */
@Api(value = "用户认证",description = "用户认证接口")
public interface AuthControllerApi {
    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest);

    @ApiOperation("退出")
    public ResponseResult logout();

    @ApiOperation("查询用户jwt令牌")
    public JwtResult userjwt();
}
