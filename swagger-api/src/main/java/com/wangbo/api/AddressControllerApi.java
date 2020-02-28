package com.wangbo.api;

import com.wangbo.dto.in.AddressCreateInDTO;
import com.wangbo.dto.in.AddressUpdateInDTO;
import com.wangbo.dto.out.AddressListOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-26 16:09
 */
@RestController
@Api(value = "顾客查询表",description = "顾客查询")
public interface AddressControllerApi {


    @ApiOperation(value = "顾客查询",httpMethod = "GET")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId);




    @ApiOperation(value = "create",httpMethod = "GET")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO);

    @ApiOperation(value = "update",httpMethod = "GET")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO, @RequestAttribute Integer addressId);
}
