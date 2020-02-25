package com.wangbo.controller;

import com.wangbo.api.ProductControllerApi;
import com.wangbo.entity.Product;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangbo
 * @date 2020-02-25 17:57
 */
@RestController
class ProductController implements ProductControllerApi {
    @Override
    public Product pruductlist(String productname, String model, double price, int quantity) {
        return null;
    }

    @Override
    public String addpruduct(Product product) {
        return null;
    }

    @Override
    public String qianPruductlist() {
        return null;
    }
}
