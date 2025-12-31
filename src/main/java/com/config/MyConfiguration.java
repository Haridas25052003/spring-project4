package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.dao"})
public class MyConfiguration {
	
	@Bean
	public JdbcTemplate j1() {
		JdbcTemplate j=new JdbcTemplate();
		j.setDataSource(d1());
		return j;
	}
	
	private DriverManagerDataSource d1() {
		
		DriverManagerDataSource d=new DriverManagerDataSource();
		
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/spdb3");
		d.setUsername("root");
		d.setPassword("root123");
		
		return d;
	}

}
