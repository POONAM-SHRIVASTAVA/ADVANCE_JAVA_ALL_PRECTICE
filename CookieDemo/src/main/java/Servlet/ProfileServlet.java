package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;

/**
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter printWriter;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		Cookie ck[] = request.getCookies();
		if(ck!=null) {
			String name = ck[0].getName();
			if(name.equals("usernameCookie")) {
				String username = ck[0].getValue();
				printWriter.println("<h4>Welcome "+username+"</h4>");
				printWriter.println("<a href='LogoutServlet'>Logout</a>");
			}
			else {
				response.sendRedirect("index.html");
			}
		}
		else {
			response.sendRedirect("index.html");
		}
		
	}

}
