package com.xxx.demo.mapper;

import com.xxx.demo.entity.User;



public interface UserMapper {
	
	public User selectUserByName(User user)throws Exception;
	
	public void insertUser(User user)throws Exception;
}