package com.iuc.virtualFactory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.SubProductTree;

@Repository
public class HibernateSubProductTree implements ISubProductTreeDal {
	
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public List<SubProductTree> getSubProductTree() {
		Session session = entityManager.unwrap(Session.class);
		List<SubProductTree> subProductTree = session.createQuery("from SubProductTree" , SubProductTree.class).getResultList();
		return subProductTree;
	}
	
	@Transactional
	@Override
	public List<SubProductTree> getSubProductTreeByProductId(String productId) {
		Session session = entityManager.unwrap(Session.class);
		List<SubProductTree> subProductTree = session.createQuery("from SubProductTree WHERE productId='"+productId+"'" , SubProductTree.class).getResultList();
		return subProductTree;
	}

}
