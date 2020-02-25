package com.wangbo.controller;

import com.wangbo.api.AdministratorControllerApi;
import com.wangbo.entity.Administrator;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbo
 * @date 2020-02-25 17:56
 */
@RestController
public class AdministratorController implements AdministratorControllerApi {
    @Override
    public Administrator customerHoulist(String customerName, String email, String customerGroup) {
        return null;
    }

    @Override
    public String loginAdmin(String username, String passwod) {
        return null;
    }

    @Override
    public String addCustomer(Administrator administrator) {
        return null;
    }

    @Override
    public String updateCustomer(Administrator administrator) {
        return null;
    }

    @Override
    public String addAddress(Administrator administrator) {
        return null;
    }

    @Override
    public String updateAddress(Administrator administrator) {
        return null;
    }
}
