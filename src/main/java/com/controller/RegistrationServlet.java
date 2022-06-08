package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class RegistrationServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("FirstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {

			isError = true;
			request.setAttribute("FirstNameError", "Please Enter FirstName");
		} else {

			request.setAttribute("FirstNameValue", firstName);
		}
		if (email == null || email.trim().length() == 0) {

			isError = true;
			request.setAttribute("EmailError", "Please Enter Email");
		} else {

			request.setAttribute("EmailValue", email);
		}
		if (password == null || password.trim().length() == 0) {

			isError = true;
			request.setAttribute("PasswordError", "Please Enter Password");
		} else {

			request.setAttribute("PasswordValue", password);
		}
		if (isError == true) {

			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		} else {
			UserBean user = new UserBean();
			user.setFirstName(firstName);
			user.setEmail(email);
			user.setPassword(password);

			boolean status = new UserDao().insertUser(user);
			if (status == true) {
				RequestDispatcher rd = request.getRequestDispatcher("ListuserServlet");
				rd.forward(request, response);
			} else {

				// error
			}
		}

	}
}
