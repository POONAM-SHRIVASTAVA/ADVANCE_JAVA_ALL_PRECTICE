package com.studentmvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlUtil {
	

	

		
		final static String DB_USER = "root";
		final static String DB_PASSWORD = "cdac";
		final static String DB_NAME = "schools";
		final static String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
		final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		public static PreparedStatement stmt;
		 public static Connection conn;
		
		static public void connectDb() throws ClassNotFoundException, SQLException {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
		}
		
		static public int insert() throws SQLException {
			int result = -1;
			
				result = stmt.executeUpdate();
			
			return result;
}
		
		static public int update() throws SQLException {
			int result = -1;
			
				result = stmt.executeUpdate();
			
			return result;
		}
		
		static public int delete() throws SQLException {
			int result = -1;
			
				result = stmt.executeUpdate();
			
			return result;
		}
		
		static public ResultSet fetch() throws SQLException {
			ResultSet rs = null;
			{
				rs = stmt.executeQuery();
			}
			return rs;
		}
		
		static public void close() throws SQLException {
			if(conn!=null && stmt!=null) {
				stmt.close();
				conn.close();
			}
		}
		
		
	}


