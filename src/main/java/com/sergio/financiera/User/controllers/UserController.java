package com.sergio.financiera.User.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addUser(@RequestParam("username")String username){
		User user = new User();
		user.setUserName(username);
		userService.saveUser(user);
	}
}
