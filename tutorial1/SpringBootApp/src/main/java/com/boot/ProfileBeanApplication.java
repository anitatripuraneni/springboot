package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfileBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProfileBeanApplication.class, args);
System.out.println(context.getBean("dataSource").toString());
	}

}
