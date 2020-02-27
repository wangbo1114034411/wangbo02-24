package com.wangbo.jcartadministrationback.dao;


import com.wangbo.entity.Return;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);
}