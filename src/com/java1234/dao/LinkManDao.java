package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.LinkMan;

/**
 * ��ϵ��Dao�ӿ�
 * @author Administrator
 *
 */
public interface LinkManDao {

	
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
