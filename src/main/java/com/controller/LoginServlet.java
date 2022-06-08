package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) {
		String Email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		
	    System.out.println(Email);
	    System.out.println(Password);
	    
		response.setContentType("text/html");
		
		try {
				PrintWriter out = response.getWriter();
				out.print("<html><body>");
				out.print("Email :"+Email+"<br>");
				out.print("Password :"+Password+"<br>");
				out.print("</body></html>");
				
		}catch (Exception e) {
		
		}
		

	}
}
