package com.student.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import com.student.daoimpl.StudentDAOImpl;
import com.student.models.Students;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentDAOImpl studentDAOImpl;
	
	public StudentController() {
		studentDAOImpl = new StudentDAOImpl();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		try {
			List<Students> studentsList = studentDAOImpl.getAll();
			printWriter.println("<table border='1' cellspacing='0' cellpadding='10'>");
			printWriter.println("<tr>");
			printWriter.println("<th>Id</th>");
			printWriter.println("<th>Name</th>");
			printWriter.println("<th>Phon</th>");
			printWriter.println("<th>Marks</th>");
			printWriter.println("<th>City</th>");
			printWriter.println("<th>Gender</th>");
			printWriter.println("<th>Actions</th>");
			printWriter.println("</tr>");
			
			Iterator<Students> studentIterator = studentsList.iterator();
			while(studentIterator.hasNext()) {
				Students student = studentIterator.next();
				printWriter.println("<tr>");
				printWriter.println("<td>"+student.getId()+"</td>");
				printWriter.println("<td>"+student.getName()+"</td>");
				printWriter.println("<td>"+student.getPhon()+"</td>");
				printWriter.println("<td>"+student.getMarks()+"</td>");
				printWriter.println("<td>"+student.getCity()+"</td>");
				printWriter.println("<td>"+student.getGender()+"</td>");
				printWriter.println("<td><a href='DeleteStudentController?id="+student.getId()+"'>Delete</a></td>");
				printWriter.println("<tr>");
			}
			
			printWriter.println("</table>");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			printWriter.println("<h3>Something went wrong...</h3>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		try {
			Students student = new Students();
			student.setId(Integer.parseInt(request.getParameter("id")));
			student.setName(request.getParameter("name"));
			student.setPhone(request.getParameter("phon"));
			student.setCity(request.getParameter("city"));
			student.setGender(request.getParameter("gender"));
			student.setMarks(Float.parseFloat(request.getParameter("marks")));
			
			StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
			int result = studentDAOImpl.save(student);
			if(result>0) {
				printWriter.println("<h3>Student Registered</h3>");
			}
			else {
				printWriter.println("<h3>Student registration failed</h3>");
			}
			
		} catch (Exception e) {
			System.out.println(e);
			printWriter.println("<h3>Something went wrong...</h3>");
		}
			
		
	}

}
