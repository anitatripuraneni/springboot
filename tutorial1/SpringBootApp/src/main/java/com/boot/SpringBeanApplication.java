package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.boot.bean.User;
import com.boot.config.MyAppConfig;

//@ComponentScan("com.boot")
@SpringBootApplication
@EnableConfigurationProperties
public class SpringBeanApplication {
	@Bean
	public User user() {
		return new User("anita", "tripuraneni");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBeanApplication.class, args);
System.out.println(context.getBean("user").toString());

MyAppConfig appConfig = (MyAppConfig)context.getBean("myAppConfig");
System.out.println(appConfig.toString());
	}

}
