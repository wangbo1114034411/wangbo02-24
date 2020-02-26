package com.wangbo.api;

import com.wangbo.dto.in.OrderSearchInDTO;
import com.wangbo.dto.out.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangbo
 * @date 2020-02-26 16:28
 */
@Api(value = "OrderControllerApi",description = "用户查询添加，登录")
public interface OrderControllerApi {
    @ApiOperation(value = "search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum);

    @ApiOperation(value = "getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId);

    @ApiOperation(value = "getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId);

    @ApiOperation(value = "getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId);
}
