package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.DataDic;

/**
 * �����ֵ�Dao�ӿ�
 * @author Administrator
 *
 */
public interface DataDicDao {

	
	/**
	 * ��ѯ�����ֵ伯��
	 * @param map
	 * @return
	 */
	public List<DataDic> find(Map<String,Object> map);
	
	/**
	 * ��ѯ���е������ֵ����Ƽ���
	 * @return
	 */
	public List<DataDic> findAll();
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸������ֵ�
	 * @param dataDic
	 * @return
	 */
	public int update(DataDic dataDic);
	
	/**
	 * ��������ֵ�
	 * @param dataDic
	 * @return
	 */
	public int add(DataDic dataDic);
	
	/**
	 * ɾ�������ֵ�
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
