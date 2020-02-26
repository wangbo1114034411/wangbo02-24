package io.cjf.jcartadministrationback.dao;


import com.wangbo.entity.ReturnHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReturnHistoryMapper {
    int deleteByPrimaryKey(Long returnHistoryId);

    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);

    ReturnHistory selectByPrimaryKey(Long returnHistoryId);

    int updateByPrimaryKeySelective(ReturnHistory record);

    int updateByPrimaryKey(ReturnHistory record);
}