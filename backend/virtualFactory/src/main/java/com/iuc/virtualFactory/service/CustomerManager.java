package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.dao.ICustomerDal;
import com.iuc.virtualFactory.model.Customer;

@Service
public class CustomerManager implements ICustomerService{

	@Autowired
	ICustomerDal customerDal;
	
	@Transactional	
	@Override
	public Customer getCustomerById(int customerId) {
		return customerDal.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDal.getCustomers();
	}

	@Override
	public Customer getCustomerByName(String customerName) {
		return customerDal.getCustomerByName(customerName);
	}

}
