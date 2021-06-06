package com.iuc.virtualFactory.dao;

import java.util.List;

import com.iuc.virtualFactory.model.Order;


public interface IOrderDal {

	public void saveOrder(Order order);
	
	public List<Order> getOrders();
	
}
