package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.Customer;

@Repository
public class HibernateCustomerDal implements ICustomerDal {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public Customer getCustomerById(int customerId) {
		Session session = entityManager.unwrap(Session.class);
		Customer customer = session.createQuery("from Customer WHERE customer_id='"+customerId+"'" , Customer.class).getSingleResult();
		return customer;
	}
	
	
	@Transactional
	@Override
	public Customer getCustomerByName(String customerName) {
		Session session = entityManager.unwrap(Session.class);
		Customer customer = session.createQuery("from Customer WHERE name='"+customerName+"'" , Customer.class).getSingleResult();
		return customer;
	}

	@Transactional
	@Override
	public List<Customer> getCustomers() {
		Session session = entityManager.unwrap(Session.class);
		List<Customer> customers = session.createQuery("from Customer" , Customer.class).getResultList();
		return customers;
	}

}
