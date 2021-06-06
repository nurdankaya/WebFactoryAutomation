package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.IOrderDal;
import com.iuc.virtualFactory.model.Order;

@Service
public class OrderManager implements IOrderService {

	@Autowired 
	IOrderDal	orderDal;
	
	@Override
	public void saveOrder(Order order) {
		orderDal.saveOrder(order);
		
	}

	@Override
	public List<Order> getOrders() {
		return orderDal.getOrders();
	}

}
