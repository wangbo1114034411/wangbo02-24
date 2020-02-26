package com.wangbo.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author wangbo
 * @date 2020-02-26 16:25
 */
@Api(value = "ImageControllerApi",description = "用户查询添加，登录")
public interface ImageControllerApi {


    @ApiOperation(value = "upload")
    public String upload(@RequestParam MultipartFile image)throws Exception;


}
