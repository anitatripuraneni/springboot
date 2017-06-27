package com.springbootdao;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootdao.bean.Author;
import com.springbootdao.bean.Employee;
import com.springbootdao.bean.Post;
import com.springbootdao.repository.EmployeeRepository;
import com.springbootdao.repository.PostRepository;
import com.springbootdao.service.DataLoaderService;

@SpringBootApplication
public class SpringBootDaoApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootDaoApplication.class);
	@Autowired
	PostRepository postRepository;

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DataLoaderService dataLoaderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDaoApplication.class, args);
	}

	@PostConstruct
	void seePost() {
		logger.info("Executing seePost method");
		for (Post emp : postRepository.findAll()) {
			logger.info(emp.toString());
			System.out.println(emp.toString());
		}
	}

}
