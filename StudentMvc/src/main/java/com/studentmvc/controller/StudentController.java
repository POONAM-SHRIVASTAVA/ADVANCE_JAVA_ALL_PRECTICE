package com.studentmvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.studentmvc.model.Student;
import com.studentmvc.serviceimpl.StudentServiceImpl;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StudentServiceImpl studentServiceImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        studentServiceImpl =new StudentServiceImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Student> student = studentServiceImpl.getAll();
			RequestDispatcher rd = request.getRequestDispatcher("student-list.jsp");
			request.setAttribute("studentList", student);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id =Integer.parseInt(request.getParameter("id"));
			float marks = Float.parseFloat(request.getParameter("marks"));
			String phon =request.getParameter("phon");
			String city =request.getParameter("city");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			Student student = new Student(id,name,phon,gender,marks,city);
			
			int result =studentServiceImpl.save(student);
			 RequestDispatcher  rd =request.getRequestDispatcher("register.jsp");
			 if(result>0) {
				 request.setAttribute("msg","Student Registered !");
			 }
			 else {
				 request.setAttribute("errorMsg","Student not  Registered !");
			 }
			 rd.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
