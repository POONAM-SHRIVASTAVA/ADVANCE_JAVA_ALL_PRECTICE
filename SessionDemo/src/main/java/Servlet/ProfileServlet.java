package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter printWriter =response.getWriter();
	
	try {
		HttpSession session = request.getSession(false);
		if(session !=null) {
			String username =(String)
					session.getAttribute("usernameSession");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/schools","root","cdac");
			Statement stmt = conn.createStatement();
			String qry = "SELECT * FROM user WHERE username='"+username+"'";

			 
			System.out.println(qry);
			ResultSet rs = stmt.executeQuery(qry);
			if(rs.next()) {
				int id = rs.getInt("id");
				String phon = rs.getString("phon");
				String email = rs.getString("email");
				printWriter.println("<h3>Welcome "+username+"</h3>");

			printWriter.println("<h4>Id:"+id+"</h4>");
			printWriter.println("<h4> Phon: "+phon+"</h4>");
			printWriter.println("<h4>Email: "+email+"</h4>");
			
			printWriter.println("<a href='LogoutServlet'>Logout</a>");
			}
			else {
				printWriter.println("<h4>Problem in fetching data...!</h4>");
			}
		}
		else {
			response.sendRedirect("index.html");
		}
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}
	

	}
	
}


		
		
	
	
	


