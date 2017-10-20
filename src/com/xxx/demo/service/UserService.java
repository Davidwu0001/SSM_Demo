package com.xxx.demo.service;

import com.xxx.demo.entity.User;

public interface UserService {

	public User selectUserByName(User user)throws Exception;
	
	public void insertUser(User user)throws Exception;
}
