package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.Product;

@Repository
public class HibernateProductDal implements IProductDal {
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Product> getProducts() {
		Session session = entityManager.unwrap(Session.class);
		List<Product> products = session.createQuery("from Product" , Product.class).getResultList();
		return products;
	}
	@Transactional
	@Override
	public void saveProduct(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.save(product);
	}
}
