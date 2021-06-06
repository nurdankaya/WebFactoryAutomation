package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.Customer;
import com.iuc.virtualFactory.service.ICustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@RequestMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int customerId) {
		return customerService.getCustomerById(customerId);
	}
	
	@RequestMapping("/customers")
	public List<Customer> getCustomer() {
		return customerService.getCustomers();
	}
	
	@RequestMapping("/customer/{customerName}")
	public Customer getCustomer(@PathVariable("customerName") String customerName) {
		return customerService.getCustomerByName(customerName);
	}
}
