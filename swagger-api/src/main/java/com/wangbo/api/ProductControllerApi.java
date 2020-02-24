package com.wangbo.api;

import com.wangbo.entity.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author wangbo
 * @date 2020-02-24 17:11
 */
@Api(value="产品管理接口",description = "产品管理接口，提供数据模型的管理、查询接口")
public interface ProductControllerApi {

    @ApiOperation("商品后端")
    public Product pruductlist(String productname,String model,double price,int quantity);


    @ApiOperation("商品添加")
    public String addpruduct(@RequestBody Product product);

    @ApiOperation("商品列表展示")
    public String qianPruductlist();
}
