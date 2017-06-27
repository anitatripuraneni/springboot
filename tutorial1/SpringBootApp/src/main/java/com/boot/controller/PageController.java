package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.service.NotificationService;

@RestController
public class PageController {
	@Autowired
	private NotificationService notificationService;
	@Value("${pageController.message}")
	private String pageControllermsg;
	@Value("${my.number}")
	private String mynumber;
	@Value("${app.desc}")
	private String appDesc;
	
	@RequestMapping("/page")
	public String home() {
		return appDesc;
	}
}
