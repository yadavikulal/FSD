package com.mycompany.spring_jdbc_demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_jdbc_demo.dao.CustomerDAO;
import com.mycompany.spring_jdbc_demo.dao.CustomerDAOImpl;
import com.mycompany.spring_jdbc_demo.model.Customer;

public class Tester {

	public static void main(String[] args) {
		try {

			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDAO = context.getBean("customerDao", CustomerDAOImpl.class);

			//customerDAO.createCustomer(new Customer("Sourav", "Ganguly", "sourav@luv2code.com"));
			//System.out.println("created!");

			List<Customer> list = customerDAO.getAllCustomer();
			Iterator<Customer> i = list.iterator();
			while (i.hasNext()) {
				Customer c = i.next();
				System.out.println(c.getFirstName() + " , " + c.getLastName() + " , " + c.getEmail());
			}

			customerDAO.deleteCustomer();
			System.out.println("deleted!");

			customerDAO.updateCustomer((new Customer("Sachin", "Tendulkar", "sachin@luv2code.com")));
			System.out.println("updated!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
