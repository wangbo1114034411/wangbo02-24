package com.wangbo.jcartadministrationback.controller;

import com.wangbo.api.AddressControllerApi;
import com.wangbo.dto.in.AddressCreateInDTO;
import com.wangbo.dto.in.AddressUpdateInDTO;
import com.wangbo.dto.out.AddressListOutDTO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController implements AddressControllerApi {

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }

    @Override
    public Integer create(AddressCreateInDTO addressCreateInDTO) {
        return null;
    }

    @Override
    public void update(AddressUpdateInDTO addressUpdateInDTO, Integer addressId) {

    }

}
