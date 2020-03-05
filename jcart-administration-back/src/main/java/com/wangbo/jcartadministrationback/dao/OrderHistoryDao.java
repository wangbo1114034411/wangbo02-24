package com.wangbo.jcartadministrationback.dao;


import com.wangbo.entity.OrderHistory;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface OrderHistoryDao extends JpaRepository<OrderHistory,String>,JpaSpecificationExecutor<OrderHistory>{
	
}
