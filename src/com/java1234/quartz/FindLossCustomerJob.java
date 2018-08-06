package com.java1234.quartz;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.java1234.service.CustomerService;

/**
 * ������ʧ�ͻ� ��ʱ����
 * @author Administrator
 *
 */
@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService; // �ͻ�Service
	
	/**
	 * ÿ���賿2�㶨��ִ��
	 */
	@Scheduled(cron="0 0 2 * * ?")
	public void work(){
		customerService.checkCustomerLoss();
	}
}
