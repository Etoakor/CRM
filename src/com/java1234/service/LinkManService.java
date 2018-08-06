package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.LinkMan;

/**
 * ��ϵ��Service�ӿ�
 * @author Administrator
 *
 */
public interface LinkManService {

	
	/**
	 * ��ѯ��ϵ�˼���
	 * @param map
	 * @return
	 */
	public List<LinkMan> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸���ϵ��
	 * @param linkMan
	 * @return
	 */
	public int update(LinkMan linkMan);
	
	/**
	 * �����ϵ��
	 * @param linkMan
	 * @return
	 */
	public int add(LinkMan linkMan);
	
	/**
	 * ɾ����ϵ��
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
