package com.iuc.virtualFactory.dao;

import java.util.List;

import com.iuc.virtualFactory.model.Customer;

public interface ICustomerDal {
	Customer getCustomerById(int customerId);

	List<Customer> getCustomers();

	Customer getCustomerByName(String customerName);
}
