package com.java1234.entity;

/**
 * ������ϸʵ��
 * @author Administrator
 *
 */
public class OrderDetails {

	private Integer id; // ���
	private Order order; // ��������
	private String goodsName; // ��Ʒ����
	private int goodsNum; // ��Ʒ����
	private String unit; // ��λ
	private float price; // �۸�
	private float sum; // �ܽ��
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	
	
	
}
