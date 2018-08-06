package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Order;

/**
 * ����Service�ӿ�
 * @author Administrator
 *
 */
public interface OrderService {

	/**
	 * ��ѯ��������
	 * @param map
	 * @return
	 */
	public List<Order> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ͨ��Id����ʵ��
	 * @param id
	 * @return
	 */
	public Order findById(Integer id);
}
