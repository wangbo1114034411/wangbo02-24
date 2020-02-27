package com.wangbo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@ApiModel(value = "用户对象模型")
public class Employee {


    private Integer employeeId;

    private String userName;
    private Integer age;
    private Integer graId;
    public interface Audit{};
    public interface Children{};

}