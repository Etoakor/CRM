package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CusDevPlan;

/**
 * �ͻ������ƻ�Service�ӿ�
 * @author Administrator
 *
 */
public interface CusDevPlanService {

	
	/**
	 * ��ѯ�ͻ������ƻ�����
	 * @param map
	 * @return
	 */
	public List<CusDevPlan> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸Ŀͻ������ƻ�
	 * @param cusDevPlan
	 * @return
	 */
	public int update(CusDevPlan cusDevPlan);
	
	/**
	 * ��ӿͻ������ƻ�
	 * @param cusDevPlan
	 * @return
	 */
	public int add(CusDevPlan cusDevPlan);
	
	/**
	 * ɾ���ͻ������ƻ�
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
