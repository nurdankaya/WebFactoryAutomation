package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.Order;

@Repository
public interface IOrderService {
	public void saveOrder(Order order);
	
	public List<Order> getOrders();
	
}
