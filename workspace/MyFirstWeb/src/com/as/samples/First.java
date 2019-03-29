package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	 PrintWriter out =	res.getWriter();
	 out.println("<html>");
	 out.println("<title> My First </title>");	
	 out.println("<body>");
	 out.println("<font color=blue size = 10>  || Hello ||  </font>");
	 out.println("</body>");
	 out.println("</html>");
	 res.setContentType("text/html");
	}
}
