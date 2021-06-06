package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.WorkCenter;

@Repository
public class HibernateWorkCenterDal implements IWorkCenterDal {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public List<WorkCenter>  getWorkCenters() {
		Session session = entityManager.unwrap(Session.class);
		List<WorkCenter> workCenter = session.createQuery("from WorkCenter",WorkCenter.class).getResultList();
		return workCenter;
	}

}
