package com.iuc.virtualFactory.dao;

import com.iuc.virtualFactory.model.User;

public interface IUserDal {
	User getUserById(int userId);

	User getUserByName(String userName);
}
