package com.iuc.virtualFactory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.Order;
import com.iuc.virtualFactory.service.IOrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	IOrderService orderService;
	
	@RequestMapping("/orders")
	public List<Order> getOrders(){
		return orderService.getOrders();
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public Order saveOrder(@RequestBody Order order) {
		 orderService.saveOrder(order);
		 return order;
	}
	
	
}
