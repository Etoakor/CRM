package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Contact;

/**
 * ������¼Dao�ӿ�
 * @author Administrator
 *
 */
public interface ContactDao {

	
	/**
	 * ��ѯ������¼����
	 * @param map
	 * @return
	 */
	public List<Contact> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ľ�����¼
	 * @param contact
	 * @return
	 */
	public int update(Contact contact);
	
	/**
	 * ��ӽ�����¼
	 * @param contact
	 * @return
	 */
	public int add(Contact contact);
	
	/**
	 * ɾ��������¼
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
