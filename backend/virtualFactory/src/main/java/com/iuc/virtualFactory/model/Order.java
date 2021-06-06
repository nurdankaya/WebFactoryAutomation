package com.iuc.virtualFactory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

import javax.persistence.Column;

@Component
@Entity
@Table(name="orders", schema="public")
public class Order {
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)         // to generate id automatically
	int orderId;
	
	@Column(name="customer_id")
	int customerId;
	
	@Column(name="order_date")
	LocalDate orderDate;
	
	LocalDate deadline;

	
	Order(){}
	public Order(int orderId, int customerId, LocalDate orderDate, LocalDate deadline) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.deadline = deadline;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	
	
}
