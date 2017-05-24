package com.springjava4dev.profiles;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjava4dev.profiles.dao.CustomerDao;
import com.springjava4dev.profiles.model.Customer;

@SpringBootApplication
public class SpringProfileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringProfileApplication.class, args);
		CustomerDao customerDao = context.getBean(CustomerDao.class);
		Customer cust = new Customer();
		cust.setCustId((new Random()).nextLong());
		cust.setName("John");
		cust.setAge(30);
		
		customerDao.insert(cust);
		
		System.out.println("================Done=================");
	}
}
