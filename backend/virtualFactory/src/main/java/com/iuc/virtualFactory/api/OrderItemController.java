package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.OrderItem;
import com.iuc.virtualFactory.service.IOrderItemService;

@RestController
@RequestMapping("/api")
public class OrderItemController {

	@Autowired
	IOrderItemService orderItemService;
	
	@RequestMapping("/orderItems")
	public List<OrderItem> getOrderItems(){
		return orderItemService.getOrderItems();
	}
	
	@RequestMapping(value = "/orderItem", method = RequestMethod.POST)
	public OrderItem saveOrderItem(@RequestBody OrderItem orderItem){
		 orderItemService.saveOrderItem(orderItem);
		 return orderItem;
	}
	
	@RequestMapping("/orderItems/{orderId}")
	public List<OrderItem> getOrderItemsByOrderId(@PathVariable("orderId") int orderId){
		return orderItemService.getOrderItemsByOrderId(orderId);
	}
}
