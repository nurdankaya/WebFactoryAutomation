package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.Planning;


@Repository
public class HibernatePlanningDal implements IPlanningDal {
	
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public void savePlanning(Planning plan) {
		Session session = entityManager.unwrap(Session.class);
		session.save(plan);
	}

	@Override
	public List<Planning> getPlanning() {
		Session session = entityManager.unwrap(Session.class);
		List<Planning> plan = session.createQuery("from Planning" , Planning.class).getResultList();
		return plan;
	}

}
