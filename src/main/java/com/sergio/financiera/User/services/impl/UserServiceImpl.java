package com.sergio.financiera.User.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.financiera.User.models.entities.User;
import com.sergio.financiera.User.repositories.UserRepository;
import com.sergio.financiera.User.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> listUsers() {
		return repository.findAll();
	}

}
