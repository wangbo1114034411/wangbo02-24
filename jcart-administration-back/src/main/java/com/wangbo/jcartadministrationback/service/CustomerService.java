package com.wangbo.jcartadministrationback.service;

import com.wangbo.dto.in.CustomerSearchInDTO;
import com.wangbo.dto.out.CustomerListOutDTO;
import com.wangbo.dto.out.CustomerShowOutDTO;
import com.wangbo.dto.out.PageOutDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangbo
 * @date 2020-02-27 17:46
 */
public interface CustomerService {

    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum);

    public CustomerShowOutDTO getById(@RequestParam Integer customerId);

    public void disable(@RequestParam Integer customerId);
}
