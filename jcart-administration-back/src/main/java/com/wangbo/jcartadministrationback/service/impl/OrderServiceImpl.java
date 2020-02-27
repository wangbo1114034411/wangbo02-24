package com.wangbo.jcartadministrationback.service.impl;

import com.wangbo.dto.in.OrderHistoryCreateInDTO;
import com.wangbo.dto.in.OrderSearchInDTO;
import com.wangbo.dto.out.*;
import com.wangbo.jcartadministrationback.dao.OrderMapper;
import com.wangbo.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-27 17:50
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum) {
        return null;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        return null;
    }

    @Override
    public OrderInvoiceShowOutDTO getInvoiceInfo(Long orderId) {
        return null;
    }

    @Override
    public OrderShipShowOutDTO getShipInfo(Long orderId) {
        return null;
    }

    @Override
    public List<OrderHistoryListOutDTO> getListByOrderId(Long orderId) {
        return null;
    }

    @Override
    public Integer create(OrderHistoryCreateInDTO orderHistoryCreateInDTO) {
        return null;
    }
}
