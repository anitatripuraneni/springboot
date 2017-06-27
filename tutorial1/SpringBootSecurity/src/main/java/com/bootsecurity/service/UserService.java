package com.bootsecurity.service;

import com.bootsecurity.domain.User;

public interface UserService {
	
	public User findByEmail(String email);

}
