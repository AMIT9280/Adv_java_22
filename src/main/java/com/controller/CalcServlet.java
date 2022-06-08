package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) {
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
	    System.out.println(n1);
	    System.out.println(n2);
	    
	    
		response.setContentType("text/html");
		
		try {
				PrintWriter out = response.getWriter();
				out.print("<html><body>");
				out.print("Number 1 : "+n1+"<br>");
				out.print("Number 2 : "+n2+"<br>");
				int add =Integer.parseInt(n1)+Integer.parseInt(n2);
				out.print("Addition of Two Number is : <b>"+add+"<br>");
				out.print("</body></html>");
				
		}catch (Exception e) {
		
		}
		

	}
}
