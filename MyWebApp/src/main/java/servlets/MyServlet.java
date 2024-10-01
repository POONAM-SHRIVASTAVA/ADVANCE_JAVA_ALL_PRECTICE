package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    
    @Override
    public void init() throws ServletException {
        // This method is called when the servlet is first initialized
        System.out.println("init called...");
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // This method is called whenever a request is made to this servlet
        System.out.println("got a request...");
        
        // Example of setting a response
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from MyServlet!</h1>");
    }
    
    @Override
    public void destroy() {
        // This method is called when the servlet is being destroyed
        System.out.println("destroy called...");
    }
}
