package com.wangbo.jcartadministrationback.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;


import com.wangbo.entity.OrderHistory;
import com.wangbo.jcartadministrationback.dao.OrderHistoryDao;
import com.wangbo.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;



/**
 * 服务层
 * 
 * @author Administrator
 *
 */
@Service
public class OrderHistoryService {

	@Autowired
	private OrderHistoryDao orderHistoryDao;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<OrderHistory> findAll() {
		return orderHistoryDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<OrderHistory> findSearch(Map whereMap, int page, int size) {
		Specification<OrderHistory> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return orderHistoryDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<OrderHistory> findSearch(Map whereMap) {
		Specification<OrderHistory> specification = createSpecification(whereMap);
		return orderHistoryDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public OrderHistory findById(String id) {
		return orderHistoryDao.findById(id).get();
	}

	/**
	 * 增加
	 * @param orderHistory
	 */
	public void add(OrderHistory orderHistory) {
		orderHistory.setId( idWorker.nextId()+"" );
		orderHistoryDao.save(orderHistory);
	}

	/**
	 * 修改
	 * @param orderHistory
	 */
	public void update(OrderHistory orderHistory) {
		orderHistoryDao.save(orderHistory);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id) {
		orderHistoryDao.deleteById(id);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<OrderHistory> createSpecification(Map searchMap) {

		return new Specification<OrderHistory>() {

			public Predicate toPredicate(Root<OrderHistory> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 
                if (searchMap.get("comment")!=null && !"".equals(searchMap.get("comment"))) {
                	predicateList.add(cb.like(root.get("comment").as(String.class), "%"+(String)searchMap.get("comment")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
