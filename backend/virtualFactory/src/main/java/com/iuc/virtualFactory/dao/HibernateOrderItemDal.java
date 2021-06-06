package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.OrderItem;

@Repository
public class HibernateOrderItemDal implements IOrderItemDal {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public void saveOrderItem(OrderItem orderItem) {
		Session session = entityManager.unwrap(Session.class);
		session.save(orderItem);

	}

	@Transactional
	@Override
	public List<OrderItem> getOrderItems() {
		Session session = entityManager.unwrap(Session.class);
		List<OrderItem> orderItems = session.createQuery("from OrderItem", OrderItem.class).getResultList();
		return orderItems;
	}

	@Override
	public List<OrderItem> getOrderItemsByOrderId(int orderId) {
		Session session = entityManager.unwrap(Session.class);
		List<OrderItem> orderItems = session.createQuery("from OrderItem WHERE orderId='"+orderId+"'", OrderItem.class).getResultList();
		return orderItems;
	}

}
