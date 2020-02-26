package com.wangbo.api;

import com.wangbo.dto.in.ReturnSearchInDTO;
import com.wangbo.dto.in.ReturnUpdateActionInDTO;
import com.wangbo.dto.out.PageOutDTO;
import com.wangbo.dto.out.ReturnListOutDTO;
import com.wangbo.dto.out.ReturnShowOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangbo
 * @date 2020-02-26 16:36
 */
@Api(value = "ReturnControllerApi",description = "用户查询添加，登录")
public interface ReturnControllerApi {
    @ApiOperation(value = "search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum);

    @ApiOperation(value = "getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId);

    @ApiOperation(value = "updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO);
}
