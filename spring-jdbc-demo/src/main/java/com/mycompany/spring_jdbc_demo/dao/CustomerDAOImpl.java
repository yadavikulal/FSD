package com.mycompany.spring_jdbc_demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mycompany.spring_jdbc_demo.model.Customer;

import lombok.Setter;

@Setter
public class CustomerDAOImpl implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer(first_name,last_name,email) values (?,?,?)", customer.getFirstName(),
				customer.getLastName(), customer.getEmail());
	}

	public CustomerDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return jdbcTemplate.query("select first_name,last_name,email from customer", new CustomerMapper());
	}

	@Override
	public void deleteCustomer() {
		jdbcTemplate.update("delete from customer where id=?", 124);

	}

	@Override
	public void updateCustomer(Customer customer) {

		jdbcTemplate.update("update customer set first_name=?, last_name=? where id=?", customer.getFirstName(),
				customer.getLastName(), 122);
	}

}
