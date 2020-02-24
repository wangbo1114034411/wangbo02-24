package com.wangbo.api;

import com.wangbo.entity.Administrator;
import com.wangbo.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author wangbo
 * @date 2020-02-24 18:03
 */
@Api(value="订单管理接口",description = "订单接口")
public interface OrderControllerApi {

    @ApiOperation("后台订单详细列表")
    public Order orderListXiangxi(String orderID);



    @ApiOperation("后台订单历史列表")
    public Order orderListHistory(String orderID);

}
