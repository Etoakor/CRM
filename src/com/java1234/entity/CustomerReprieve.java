package com.java1234.entity;

/**
 * �ͻ���ʧ�ݻ���ʩʵ����
 * @author Administrator
 *
 */
public class CustomerReprieve {

	private Integer id; // ���
	private CustomerLoss customerLoss; // �ͻ���ʧ
	private String measure; // �ݻ���ʩ
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public CustomerLoss getCustomerLoss() {
		return customerLoss;
	}
	public void setCustomerLoss(CustomerLoss customerLoss) {
		this.customerLoss = customerLoss;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	
	
}
