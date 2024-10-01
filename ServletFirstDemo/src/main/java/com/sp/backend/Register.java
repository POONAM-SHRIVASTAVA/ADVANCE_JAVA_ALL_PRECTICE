package com.sp.backend;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/regForm")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String myname =request.getParameter("name1");
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("password");
		String mygender =request.getParameter("gender1");
		
		
		try {
			getClass().forName("com.mysql.cj.jdbc.driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_crud","root","cdac");
			PreparedStatement ps =connection.prepareStatement("insert into register values(?,?,?,?)");
			ps.setString(1,myname);
			ps.setString(2, myemail);
			ps.setString(3,mypass);
			ps.setString(4,mygender);
			 int count =ps.executeUpdate();
			 if(count>0)
			 {
				 response.setContentType("text/html");
				 out.print("<h2 style ='color:green'>User registered successfully</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/register.jsp") ;
				rd.include(request, response);
			 }
			 else {
				 response.setContentType("text/html");
				 out.print("<h2 style ='color:red'>User registered successfully</h3>");
				RequestDispatcher rd = request.getRequestDispatcher("/register.jsp") ;
				rd.include(request, response);
			 }
		}catch(Exception e){
			
			e.printStackTrace();
			
			response.setContentType("text/html");
			 out.print("<h2 style ='color:red'>Exception Occured:"+e.getMessage()+"</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/register.jsp") ;
			rd.include(request, response);
			
		}
	}

}
