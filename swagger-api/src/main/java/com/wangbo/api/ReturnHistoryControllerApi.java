package com.wangbo.api;

import com.wangbo.dto.in.ReturnHistoryCreateInDTO;
import com.wangbo.dto.out.ReturnHistoryListOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-26 16:37
 */
@Api(value = "ReturnControllerApi",description = "用户查询添加，登录")
public interface ReturnHistoryControllerApi {


    @ApiOperation(value = "getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId);


    @ApiOperation(value = "create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO);
}
