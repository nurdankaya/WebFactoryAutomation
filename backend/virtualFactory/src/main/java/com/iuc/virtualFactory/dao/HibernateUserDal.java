package com.iuc.virtualFactory.dao;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iuc.virtualFactory.model.User;

@Repository
public class HibernateUserDal implements IUserDal {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public User getUserById(int userId) {
		Session session = entityManager.unwrap(Session.class);
		User user = session.createQuery("from User WHERE user_id='"+userId+"'" , User.class).getSingleResult();
		return user;
	}

	@Transactional
	@Override
	public User getUserByName(String userName) {
		Session session = entityManager.unwrap(Session.class);
		User user = session.createQuery("from User WHERE name='"+userName+"'" , User.class).getSingleResult();
		return user;
	}

}
