package com.wangbo.jcartadministrationback.dao;


import com.wangbo.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKeyWithBLOBs(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}