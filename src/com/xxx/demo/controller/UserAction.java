package com.xxx.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxx.demo.entity.User;
import com.xxx.demo.service.UserService;


@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/register")
	public String userRegister(User user, HttpSession session, HttpServletRequest request)throws Exception{
		try {
			userService.insertUser(user);
			session.setAttribute("currentUser", user);
			return "redirect:/success.jsp";
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("errorMsg", "用户注册失败！");
		return "index";
	}

	@RequestMapping("/login")
	public String userLogin(User user,HttpSession session, HttpServletRequest request)throws Exception{
		User currentUser = userService.selectUserByName(user);
		if(currentUser != null){
			session.setAttribute("currentUser", currentUser);
			return "redirect:/success.jsp";
		}
		request.setAttribute("errorMsg", "用户名或者密码错误！");
		return "index";
	}
}