package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
		
	public void service(HttpServletRequest request, HttpServletResponse response) {
		String FirstName = request.getParameter("FirstName");
		String Email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		String Gender = request.getParameter("Gender");
		String Hobby[] = request.getParameterValues("hobby");
		String country = request.getParameter("city");
		
	    System.out.println(FirstName);
	    System.out.println(Email);
	    System.out.println(Password);
	    System.out.println(Gender);
	    System.out.println(Hobby);
	    System.out.println(country);
		response.setContentType("text/html");
		
		try {
				PrintWriter out = response.getWriter();
				out.print("<html><body>");
				out.print("FirstName :"+FirstName+"<br>");
				out.print("Eamil :"+Email+"<br>");
				out.print("Password :"+Password+"<br>");
				out.print("Gender :"+Gender+"<br>");
				out.print("Country :"+country+"<br>");
				out.print("Hobby :");
				for(int i=0; i<Hobby[i].length(); i++) {
					out.print(Hobby[i]);
				}
				out.print("</body></html>");	
		}catch (Exception e) {
		
		}
		
		
	}
}
