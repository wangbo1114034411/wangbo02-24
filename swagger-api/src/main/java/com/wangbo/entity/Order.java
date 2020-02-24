package com.wangbo.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;

/**
 * @author wangbo
 * @date 2020-02-24 18:01
 */
@ApiModel(value = "订单表",description = "用于订单展示等")
@Data
@ToString
public class Order {
    private int id;
    private String Customer;
    private String orderStatus;
    private String email;
    private String telephone;
    private String address;
    private String paymentAddress;
    private String prductName;
    private String model;
    private String quantity;
    private double total;
    private String dateAdded;
    private String dateModified;
}
