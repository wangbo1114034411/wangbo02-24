package com.wangbo.api;

import com.wangbo.dto.in.OrderHistoryCreateInDTO;
import com.wangbo.dto.out.OrderHistoryListOutDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-26 16:29
 */
@Api(value = "OrderHistoryControllerApi",description = "用户查询添加，登录")
public interface OrderHistoryControllerApi {

    @ApiOperation(value = "getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId);

    @ApiOperation(value = "create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO);
}
