package com.xxx.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.demo.entity.User;
import com.xxx.demo.mapper.UserMapper;
import com.xxx.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User selectUserByName(User user) throws Exception {
		
		return userMapper.selectUserByName(user);
	}
	@Override
	public void insertUser(User user) throws Exception {
		userMapper.insertUser(user);
	}

}
