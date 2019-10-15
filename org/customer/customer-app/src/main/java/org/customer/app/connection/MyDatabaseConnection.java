package org.customer.app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabaseConnection {
	
	private static Connection connection=null;
	
	private MyDatabaseConnection() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","pass@word1");
	}
	
	public static Connection getMyConnection() throws SQLException
	{
		if(connection==null)
		{
			new MyDatabaseConnection();
		}
		return connection;
	}

}