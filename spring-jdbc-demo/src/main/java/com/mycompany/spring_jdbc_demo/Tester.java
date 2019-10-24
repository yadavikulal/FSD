package com.mycompany.spring_jdbc_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_jdbc_demo.dao.CustomerDAO;
import com.mycompany.spring_jdbc_demo.dao.CustomerDAOImpl;
import com.mycompany.spring_jdbc_demo.model.Customer;

public class Tester {

	public static void main(String[] args) {
		try {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);

			customerDAO.createCustomer(new Customer("Sourav", "Ganguly", "sourav@luv2code.com"));
			System.out.println("ok!");
			
			List<Customer> list = new ArrayList<Customer>();
			list = customerDAO.retrieveCustomer();
			for(Customer c: list) {
				System.out.println(c.getFirstName()+"  "+c.getLastName()+"  "+c.getEmail());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
   
}
