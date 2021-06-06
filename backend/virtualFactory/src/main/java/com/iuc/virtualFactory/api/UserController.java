package com.iuc.virtualFactory.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iuc.virtualFactory.model.User;
import com.iuc.virtualFactory.service.IUserService;


@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping("/user/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		return userService.getUserByName(userName);
	}
}
