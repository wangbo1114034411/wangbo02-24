package com.wangbo.controller;

import com.wangbo.api.OrderControllerApi;
import com.wangbo.entity.Order;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbo
 * @date 2020-02-25 17:56
 */
@RestController
public class OrderController implements OrderControllerApi
{
    @Override
    public Order orderListXiangxi(String orderID) {
        return null;
    }

    @Override
    public Order orderListHistory(String orderID) {
        return null;
    }
}
