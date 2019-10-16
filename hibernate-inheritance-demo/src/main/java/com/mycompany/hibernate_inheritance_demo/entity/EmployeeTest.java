package com.mycompany.hibernate_inheritance_demo.entity;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
					.addAnnotatedClass(PartTimeEmployee.class)
					.addAnnotatedClass(FullTimeEmployee.class).buildSessionFactory();
			Session session = factory.openSession();
			Employee emp = new Employee("John", "john@gmail.com", 34567788);
			PartTimeEmployee pemp = new PartTimeEmployee("Rahul", "rahul@gmail.com",  99999999, 9);
			FullTimeEmployee femp = new FullTimeEmployee("Sam", "sam@gmail.com", 9999999, 9887.4);
			session.getTransaction().begin();
			session.save(emp);
			session.save(pemp);
			session.save(femp);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

