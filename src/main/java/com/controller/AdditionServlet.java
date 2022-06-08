package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String n1 = request.getParameter("n1");
			String n2 = request.getParameter("n2");
			
			int no1 = Integer.parseInt(n1);
			int no2 = Integer.parseInt(n2);
			
			int ans = no1+no2;
			
			request.setAttribute("Answer",ans);
			
			RequestDispatcher rd = request.getRequestDispatcher("Ans.jsp");
			
			rd.forward(request,response);
	}
}
