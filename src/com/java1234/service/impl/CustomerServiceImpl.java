package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.CustomerDao;
import com.java1234.dao.CustomerLossDao;
import com.java1234.dao.OrderDao;
import com.java1234.entity.Customer;
import com.java1234.entity.CustomerFw;
import com.java1234.entity.CustomerGc;
import com.java1234.entity.CustomerGx;
import com.java1234.entity.CustomerLoss;
import com.java1234.entity.Order;
import com.java1234.service.CustomerService;

/**
 * �ͻ�Service�ӿ�
 * @author Administrator
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Resource
	private CustomerDao customerDao;
	
	@Resource
	private CustomerLossDao customerLossDao;
	
	@Resource
	private OrderDao orderDao;
	
	@Override
	public List<Customer> find(Map<String, Object> map) {
		return customerDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerDao.getTotal(map);
	}

	@Override
	public int add(Customer customer) {
		return customerDao.add(customer);
	}

	@Override
	public int update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public int delete(Integer id) {
		return customerDao.delete(id);
	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public void checkCustomerLoss() {
		List<Customer> customerList=customerDao.findLossCustomer(); // ������ʧ�ͻ�
		for(Customer c:customerList){
			CustomerLoss customerLoss=new CustomerLoss(); // ʵ�����ͻ���ʧʵ��
			customerLoss.setCusNo(c.getKhno()); // �ͻ����
			customerLoss.setCusName(c.getName()); // �ͻ�����
			customerLoss.setCusManager(c.getCusManager()); // �ͻ�����
			Order order=orderDao.findLastOrderByCusId(c.getId()); // ����ָ���ͻ�����Ķ���
			if(order==null){
				customerLoss.setLastOrderTime(null);
			}else{
				customerLoss.setLastOrderTime(order.getOrderDate()); // ����������µ�����				
			}
			customerLossDao.add(customerLoss); // ��ӵ��ͻ���ʧ��
			c.setState(1); // �ͻ�״̬�޸ĳ�1 ��ʧ״̬
			customerDao.update(c); 
		}
	}

	@Override
	public List<CustomerGx> findCustomerGx(Map<String, Object> map) {
		return customerDao.findCustomerGx(map);
	}

	@Override
	public Long getTotalCustomerGx(Map<String, Object> map) {
		return customerDao.getTotalCustomerGx(map);
	}

	@Override
	public List<CustomerGc> findCustomerGc() {
		return customerDao.findCustomerGc();
	}

	@Override
	public List<CustomerFw> findCustomerFw() {
		return customerDao.findCustomerFw();
	}

}
