package com.springjava4dev.profiles.dao.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springjava4dev.profiles.dao.CustomerDao;
import com.springjava4dev.profiles.model.Customer;

	

@Repository
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao
{
	@Autowired
	DataSource dataSource;
	@PostConstruct
	void init(){
	    setDataSource(dataSource);
	}
	
	@Override
	public void insert(Customer cust) {
	    String sql = "INSERT INTO customer " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
	    getJdbcTemplate().update(sql, new Object[] { cust.getCustId(), cust.getName(), cust.getAge() });
	}
}
