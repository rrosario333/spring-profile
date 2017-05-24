package com.springjava4dev.profiles.dao;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceBeans {

	@Primary
	@Bean(name="datasource")
	@ConfigurationProperties(prefix="test.datasource")
	@Profile("test")
	public DataSource dataSourceForTestEnv(){
		System.out.println("dataSource for Test");
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="dataSource")
	@ConfigurationProperties(prefix="dev.datasource")
	@Profile("dev")
	public DataSource dataSourceForDevEnv(){
		System.out.println("dataSource for Dev");
		return DataSourceBuilder.create().build();
	}
}