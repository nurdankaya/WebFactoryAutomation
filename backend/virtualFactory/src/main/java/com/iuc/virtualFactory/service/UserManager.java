package com.iuc.virtualFactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.iuc.virtualFactory.dao.IUserDal;
import com.iuc.virtualFactory.model.User;

@Service
public class UserManager implements IUserService{

	@Autowired
	IUserDal userDal;
	
	@Transactional
	@Override
	public User getUserById(int userId) {
		return userDal.getUserById(userId);
	}

	@Override
	public User getUserByName(String userName) {
		return userDal.getUserByName(userName);
	}
}
