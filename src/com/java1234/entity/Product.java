package com.java1234.entity;

/**
 * ��Ʒʵ��
 * @author Administrator
 *
 */
public class Product {

	private Integer id; // ���
	private String productName; // ��Ʒ����
	private String model; // �ͺ�
	private String unit; // ��λ
	private Float price; // �۸�
	private Integer store; // ���
	private String remark; // ��ע
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getStore() {
		return store;
	}
	public void setStore(Integer store) {
		this.store = store;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
