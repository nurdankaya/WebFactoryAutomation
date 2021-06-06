package com.iuc.virtualFactory.service;

import org.springframework.stereotype.Repository;
import com.iuc.virtualFactory.model.User;

@Repository
public interface IUserService {
	User getUserById(int userId);
	User getUserByName(String userName);
}
