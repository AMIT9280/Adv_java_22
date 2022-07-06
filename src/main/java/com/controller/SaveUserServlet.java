package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		 String firstName = request.getParameter("fNAme");
		 String Cc = request.getParameter("cc");
		 
		 //Save cookies
		 Cookie c = new  Cookie("FirstName",firstName);
		 response.addCookie(c);
		 
		 //Session get
		 HttpSession session = request.getSession();
		 session.setAttribute("Cc", Cc);
		 
		 //Session Time Out
		 session.setMaxInactiveInterval(60);
		 response.sendRedirect("UserDataDisplay.jsp");
	}
}
