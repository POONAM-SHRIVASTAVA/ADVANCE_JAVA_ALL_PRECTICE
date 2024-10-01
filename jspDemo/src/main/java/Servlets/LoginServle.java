package Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServle
 */
public class LoginServle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username =request.getParameter("username");
					String password =request.getParameter("password");
					if(username.equals("admin")&&password.equals("admin123")) {
					response.sendRedirect("table.jsp");
		}
		else {
			request.setAttribute("loginError","Invalid username or password");
		RequestDispatcher requestDispatcher =request.getRequestDispatcher("login.jsp");//servlet me url AUR JSP ME JSP FILE NAME;
		requestDispatcher.forward(request, response);
		
		}
		
		
		
	}catch(Exception e) {
			e.printStackTrace();
	
}
	}
}
