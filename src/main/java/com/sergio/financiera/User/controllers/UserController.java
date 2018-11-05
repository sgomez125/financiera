package com.sergio.financiera.User.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sergio.financiera.User.models.entities.User;
import com.sergio.financiera.User.services.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<User> findAll() {
		return userService.listUsers();
	}
}
