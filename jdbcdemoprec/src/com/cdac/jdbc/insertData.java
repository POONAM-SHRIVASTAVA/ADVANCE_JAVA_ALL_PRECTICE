package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertData {
	public static void main(String argString []) {
		Connection connection = null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","cdac");
			Statement stmt =connection.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter prodcut name");
			String name = sc.nextLine();
			System.out.println("Enter price of the product");
			double price =Double.parseDouble(sc.nextLine());
			System.out.println("Enter quantity of the product");
			int qunatity =Integer.parseInt(sc.nextLine());
			String sql ="insert into tbl_product(name,price,quantity)values(?,?,?,?,?)";
			
			
			stmt.executeUpdate(sql);
			
			System.out.println("record insert");
		}catch(Exception e) {
			System.out.println("Something wrong with MYSql");
		e.printStackTrace();
		
		}finally {
			try {
				connection.close();
				
			}catch(Exception e){
				
			}
		}
		
	}

}
