package io.cjf.jcartadministrationback.dao;


import com.wangbo.entity.OrderHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderHistoryMapper {
    int deleteByPrimaryKey(Long orderHistoryId);

    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);

    OrderHistory selectByPrimaryKey(Long orderHistoryId);

    int updateByPrimaryKeySelective(OrderHistory record);

    int updateByPrimaryKey(OrderHistory record);
}