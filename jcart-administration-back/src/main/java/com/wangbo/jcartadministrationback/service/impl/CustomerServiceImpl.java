package com.wangbo.jcartadministrationback.service.impl;

import com.wangbo.dto.in.CustomerSearchInDTO;
import com.wangbo.dto.out.CustomerListOutDTO;
import com.wangbo.dto.out.CustomerShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import com.wangbo.entity.Customer;
import com.wangbo.jcartadministrationback.dao.CustomerMapper;
import com.wangbo.jcartadministrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangbo
 * @date 2020-02-27 17:47
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum) {
        return null;
    }

    @Override
    public CustomerShowOutDTO getById(Integer customerId) {
        return null;
    }

    @Override
    public void disable(Integer customerId) {

    }
}
