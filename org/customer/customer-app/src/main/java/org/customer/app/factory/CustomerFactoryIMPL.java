package org.customer.app.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.customer.app.connection.MyDatabaseConnection;
import org.customer.app.model.Customer;

public class CustomerFactoryIMPL implements CustomerFactory {
	Scanner scanner = new Scanner(System.in);
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	
	Customer tempCustomer=null;
	public CustomerFactoryIMPL() {
		super();
		
		try {
			connection=MyDatabaseConnection.getMyConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Customer createCustomer(int id, String name, String email) {
		// TODO Auto-generated method stub
		
		try {
			tempCustomer=new Customer(id,name,email);
	
			pStatement=connection.prepareStatement("insert into customer values(?,?,?)");
			pStatement.setInt(1, tempCustomer.getId());
			pStatement.setString(2, tempCustomer.getName().toString());
			pStatement.setString(3, tempCustomer.getEmail().toString());
			int count=pStatement.executeUpdate();
			System.out.println(count+" row(s) inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tempCustomer;
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		
		
		List<Customer> list=new ArrayList<Customer>();
		try {
			statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from customer");
			while(rs.next())
			{
				list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return list;
	}

	

	public void findByID(int id) {
		// TODO Auto-generated method stub
		try {
			int count = -1;
			pStatement = connection.prepareStatement("select * from customer where id=?");
			pStatement.setInt(1, id);
			ResultSet rs = pStatement.executeQuery();
			while(rs.next()) {
				count++;
			}
			if(count < 0) {
				System.out.println("NO such record found!");
			}
			
			else {
				rs.beforeFirst();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			}
		}
		catch (Exception e) {
				// TODO: handle exception
			System.out.println(e);
		}
	}

	public void findByName(String name) {
		// TODO Auto-generated method stub
		try {
			int count = -1;
			pStatement = connection.prepareStatement("select * from customer where name=?");
			pStatement.setString(1, name);
			ResultSet rs = pStatement.executeQuery();
			while(rs.next()) {
				count++;
			}
			if(count < 0) {
				System.out.println("NO such record found!");
			}
			
			else {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			}
		}
		catch (Exception e) {
				// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void updateCustomer(int id) {
		try {
			System.out.println("Updated name: ");
			String name = scanner.next();
			System.out.println("Updated email: ");
			String email = scanner.next();
			pStatement = connection.prepareStatement("update customer set name=? , email=? where id=?");
			pStatement.setString(1, name);
			pStatement.setString(2, email);
			pStatement.setInt(3, id);
			int i = pStatement.executeUpdate();
			if(i<=0) {
				System.out.println("No such id");
			}
			else {
				System.out.println("Updated successfully");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void deleteCustomer(int id) {
		try {
			
			pStatement = connection.prepareStatement("delete from customer where id=?");
			pStatement.setInt(1,id);
			int i = pStatement.executeUpdate();
			if(i<=0) {
				System.out.println("No such id");
			}
			else {
				System.out.println("Deleted successfully");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
	