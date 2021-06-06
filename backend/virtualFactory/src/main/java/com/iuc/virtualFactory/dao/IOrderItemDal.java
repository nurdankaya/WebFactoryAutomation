package com.iuc.virtualFactory.dao;

import java.util.List;

import com.iuc.virtualFactory.model.OrderItem;

public interface IOrderItemDal {
	public void saveOrderItem(OrderItem orderItem);
	
	public List<OrderItem> getOrderItems();

	public List<OrderItem> getOrderItemsByOrderId(int orderId);
}
