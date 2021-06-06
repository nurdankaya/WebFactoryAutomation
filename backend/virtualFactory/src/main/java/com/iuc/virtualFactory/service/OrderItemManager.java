package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuc.virtualFactory.dao.IOrderItemDal;
import com.iuc.virtualFactory.model.OrderItem;

@Service
public class OrderItemManager implements IOrderItemService {

	@Autowired
	IOrderItemDal orderItemDal;
	
	@Override
	public void saveOrderItem(OrderItem orderItem) {
		orderItemDal.saveOrderItem(orderItem);
	}

	@Override
	public List<OrderItem> getOrderItems() {
		return orderItemDal.getOrderItems();
	}

	@Override
	public List<OrderItem> getOrderItemsByOrderId(int orderId) {
		return orderItemDal.getOrderItemsByOrderId(orderId);
	}

}
