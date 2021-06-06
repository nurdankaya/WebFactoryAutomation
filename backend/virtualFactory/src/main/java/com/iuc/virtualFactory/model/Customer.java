package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="customers", schema="public")
public class Customer {

	@Id
	@Column(name="customer_id")
	int customerId;
	String name;
	String password;
	
	public Customer() {}
	
	public Customer(int customerId, String name, String password) {
		this.customerId = customerId;
		this.name = name;
		this.password = password;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
