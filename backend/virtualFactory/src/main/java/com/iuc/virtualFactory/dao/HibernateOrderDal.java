package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.Order;



@Repository
public class HibernateOrderDal implements IOrderDal{

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public void saveOrder(Order order) {
		Session session = entityManager.unwrap(Session.class);
		session.save(order);
	}

	@Transactional
	@Override
	public List<Order> getOrders() {
		Session session = entityManager.unwrap(Session.class);
		List<Order> orders = session.createQuery("from Order", Order.class).getResultList();
		return orders;
	}


	

}
