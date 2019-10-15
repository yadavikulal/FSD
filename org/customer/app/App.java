package org.customer.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.customer.app.factory.CustomerFactory;
import org.customer.app.factory.CustomerFactoryIMPL;
import org.customer.app.model.Customer;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;
public class App 
{
    private static Scanner scanner=new Scanner(System.in);
	public static void main( String[] args )
    {
        try {
        	CustomerFactory impl=new CustomerFactoryIMPL();
        	Customer customer = null;
        	
        	do {
        		System.out.println("1. Create customer");
            	System.out.println("2. Display all customer ");
            	System.out.println("3. Display customer by id");
            	System.out.println("4. Update customer");
            	System.out.println("5. Delete customer");
            	System.out.println("Enter your choice");
            	int choice = scanner.nextInt();
            	
        		switch (choice) {
        		
				case 1: 
					System.out.println("ID: ");
					int id = scanner.nextInt();
					System.out.println("Name: ");
					String name = scanner.next();
					System.out.println("Email: ");
					String email = scanner.next();
					customer = impl.createCustomer(id, name, email);
					break;
				case 2:
					List<Customer> list = impl.getAllCustomer();
					for(Customer c: list) {
						System.out.println(c);
					}
					break;
					
				case 3:
					System.out.println("Enter id");
					id = scanner.nextInt();
					impl.findByID(id);
					
					break;
				case 4:
					System.out.println("Enter id");
					id = scanner.nextInt();
					impl.updateCustomer(id);
					break;
				case 5:
					System.out.println("Enter id");
					id = scanner.nextInt();
					impl.deleteCustomer(id);
					break;
				default:
					break;
				}
        	} while(true);
        }
        	
        	catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
        	}
    
        }
}