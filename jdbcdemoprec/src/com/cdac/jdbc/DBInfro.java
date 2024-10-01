package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfro {
public static void main (String args[]) {
	Connection connection =null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","cdac");
	   System.out.println("yyyy,got connected");
	
	}
		
	catch(ClassNotFoundException e){
		System.out.println("please check the number of your glass 0-0");
		
		
	}
	catch(SQLException e) {
		System.out.println("please chech your no glass of 0-0");
	     e.printStackTrace();
	
	}
	finally {
		try {
			connection.close();}
		catch(Exception e) {}
		}
	}
}

