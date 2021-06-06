package com.iuc.virtualFactory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="users", schema="public")
public class User {
	@Id
	@Column(name="user_id")
	int userId;
	String name;
	String password;
	
	public User() {}
	
	public User(int userId, String name, String password) {
		this.userId = userId;
		this.name = name;
		this.password = password;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
