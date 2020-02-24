package com.wangbo.entity;

/**
 * @author wangbo
 * @date 2020-02-24 17:05
 */

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;

@ApiModel(value = "产品表",description = "用于产品展示等")
@Data
@ToString
public class Product {

    private int id;
    private String image;
    private String productname;
    private String model;
    private String productAbstract;
    private double price;
    private int quantity;
    private int status;


}
