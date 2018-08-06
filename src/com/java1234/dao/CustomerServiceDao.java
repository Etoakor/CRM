package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerService;

/**
 * �ͻ�����Dao�ӿ�
 * @author Administrator
 *
 */
public interface CustomerServiceDao {

	/**
	 * ��ӿͻ�����
	 * @param customerService
	 * @return
	 */
	public int add(CustomerService customerService);
	
	/**
	 * ��ѯ�ͻ�����
	 * @param map
	 * @return
	 */
	public List<CustomerService> find(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ������¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ŀͻ�����
	 * @param customerService
	 * @return
	 */
	public int update(CustomerService customerService);
}
