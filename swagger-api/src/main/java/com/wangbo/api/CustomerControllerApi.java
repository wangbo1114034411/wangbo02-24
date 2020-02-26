package com.wangbo.api;

import com.wangbo.dto.in.CustomerSearchInDTO;
import com.wangbo.dto.out.CustomerListOutDTO;
import com.wangbo.dto.out.CustomerShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangbo
 * @date 2020-02-26 16:22
 */
@Api(value = "CustomerControllerApi表",description = "用户查询添加，登录")
public interface CustomerControllerApi {


    @ApiOperation(value = "search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum);

    @ApiOperation(value = "getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId);

    @ApiOperation(value = "disable")
    public void disable(@RequestParam Integer customerId);
}
