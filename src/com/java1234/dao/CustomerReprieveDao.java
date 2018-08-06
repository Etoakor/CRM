package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerReprieve;

/**
 * �ͻ���ʧ�ݻ���ʩDao�ӿ�
 * @author Administrator
 *
 */
public interface CustomerReprieveDao {

	
	/**
	 * ��ѯ�ͻ���ʧ�ݻ���ʩ����
	 * @param map
	 * @return
	 */
	public List<CustomerReprieve> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ŀͻ���ʧ�ݻ���ʩ
	 * @param customerReprieve
	 * @return
	 */
	public int update(CustomerReprieve customerReprieve);
	
	/**
	 * ��ӿͻ���ʧ�ݻ���ʩ
	 * @param customerReprieve
	 * @return
	 */
	public int add(CustomerReprieve customerReprieve);
	
	/**
	 * ɾ���ͻ���ʧ�ݻ���ʩ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
