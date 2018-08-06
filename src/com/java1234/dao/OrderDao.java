package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Order;

/**
 * ����Dao�ӿ�
 * @author Administrator
 *
 */
public interface OrderDao {

	
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
	
	/**
	 * ����ָ���ͻ�������Ķ���
	 * @param cusId
	 * @return
	 */
	public Order findLastOrderByCusId(int cusId);
}
