package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.SaleChance;

/**
 * ���ۻ���Service�ӿ�
 * @author Administrator
 *
 */
public interface SaleChanceService {

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
