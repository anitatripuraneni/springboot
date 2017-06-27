package com.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Value("${spring.profiles.active}")
	private String env;
	@Value("${msg}")
	private String msg;
	
	@RequestMapping("/")
	public String profileTest(){
		return env;
	}
	@RequestMapping("/msg")
	public String profileMsg(){
		return msg;
	}

}
