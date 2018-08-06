package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.SaleChance;

/**
 * ���ۻ���Dao�ӿ�
 * @author Administrator
 *
 */
public interface SaleChanceDao {

	
	/**
	 * ��ѯ���ۻ��Ἧ��
	 * @param map
	 * @return
	 */
	public List<SaleChance> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ������ۻ���
	 * @param saleChance
	 * @return
	 */
	public int add(SaleChance saleChance);
	
	/**
	 * �޸����ۻ���
	 * @param saleChance
	 * @return
	 */
	public int update(SaleChance saleChance);

	/**
	 * ɾ�����ۻ���
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public SaleChance findById(Integer id);
}
