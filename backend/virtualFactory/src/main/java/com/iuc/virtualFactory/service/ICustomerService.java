package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.Customer;

@Repository
public interface ICustomerService {
	Customer getCustomerById(int customerId);
	Customer getCustomerByName(String customerName);
	List<Customer> getCustomers();
}
