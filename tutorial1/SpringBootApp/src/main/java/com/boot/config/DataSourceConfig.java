package com.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.boot.bean.DataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean(name="dataSource")
	@Profile("development")
	DataSource development(){
		return new DataSource("My-dev",9999);
	}

	@Bean(name="dataSource")
	@Profile("Production")
	DataSource production(){
		return new DataSource("My-prod",9999);
	}
}
