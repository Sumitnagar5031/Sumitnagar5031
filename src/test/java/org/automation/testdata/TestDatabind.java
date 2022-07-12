package org.automation.testdata;

import com.automation.pojo.CustomerInfo;

public class TestDatabind {

	
	public CustomerInfo customerInfomation(String name , String job) {
		CustomerInfo customer = new CustomerInfo();
		customer.setCustomername(name);
		customer.setJob(job);	
		return customer;
	}
	
}
