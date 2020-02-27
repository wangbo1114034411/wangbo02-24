package com.wangbo.jcartadministrationback.service;

import com.wangbo.dto.in.OrderHistoryCreateInDTO;
import com.wangbo.dto.in.OrderSearchInDTO;
import com.wangbo.dto.out.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangbo
 * @date 2020-02-27 17:49
 */
public interface OrderService {
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum);

    public OrderShowOutDTO getById(@RequestParam Long orderId);

    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId);

    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId);

    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId);

    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO);
}
