package com.wangbo.api;

import com.wangbo.dto.out.AddressListOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-26 16:09
 */
@Api(value = "顾客查询表",description = "顾客查询")
public interface AddressControllerApi {


    @ApiOperation(value = "顾客查询",httpMethod = "GET")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId);
}
