package com.bootsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootsecurity.dao.UserRepository;
import com.bootsecurity.domain.User;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		
		return null;
	}

}
