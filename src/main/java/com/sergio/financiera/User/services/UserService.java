package com.sergio.financiera.User.services;

import java.util.List;

import com.sergio.financiera.User.models.entities.User;

public interface UserService {
	public User saveUser(User user);
	public List<User> listUsers();
}
