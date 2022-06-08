package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ElectionServlet")
public class ElectionServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		   String name = request.getParameter("name");
		   String gender = request.getParameter("gender");
		   String dob = request.getParameter("date");
		   
		    dob = dob.substring(0,4);
		    Calendar c =  Calendar.getInstance();
		    int year = c.get(Calendar.YEAR);
		    int age = Integer.parseInt(dob);
		    int age1 = year - age;
		    if(age1>=18 ) {
		    	request.setAttribute("age", name+" You Are Eligible For Voting"); 
		    }else {
		    	
		    	request.setAttribute("age", name+" You Are Not Eligible For Voting");
		    }
		    RequestDispatcher rd = request.getRequestDispatcher("ELECTION.jsp");
			rd.forward(request, response);
	}
}
