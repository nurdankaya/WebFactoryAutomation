package com.iuc.virtualFactory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iuc.virtualFactory.model.OrderItem;

@Repository
public interface IOrderItemService {
	public void saveOrderItem(OrderItem orderItem);

	public List<OrderItem> getOrderItems();

	public List<OrderItem> getOrderItemsByOrderId(int orderId);
}
