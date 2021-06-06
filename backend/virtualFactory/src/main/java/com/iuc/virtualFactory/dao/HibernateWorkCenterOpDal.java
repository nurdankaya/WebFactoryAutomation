package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.WorkCenterOp;

@Repository
public class HibernateWorkCenterOpDal implements IWorkCenterOperationDal {
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public List<WorkCenterOp> getWcOperations() {
		Session session = entityManager.unwrap(Session.class);
		List<WorkCenterOp> wcOperation = session.createQuery("from WorkCenterOp",WorkCenterOp.class).getResultList();
		return wcOperation;
	}
	@Transactional
	@Override
	public List<WorkCenterOp> getWcOperationsByWcId(int workCenterId) {
		Session session = entityManager.unwrap(Session.class);
		List<WorkCenterOp> wcOperation = session.createQuery("from WorkCenterOp WHERE wcID='"+workCenterId+"'",WorkCenterOp.class).getResultList();
		return wcOperation;
	}
	@Transactional
	@Override
	public List<WorkCenterOp> getWcOperationsByOpId(int operationId) {
		Session session = entityManager.unwrap(Session.class);
		List<WorkCenterOp> wcOperation = session.createQuery("from WorkCenterOp WHERE operationId='"+operationId+"'",WorkCenterOp.class).getResultList();
		return wcOperation;
	}

}
