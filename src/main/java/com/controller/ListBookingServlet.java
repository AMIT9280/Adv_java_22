package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.TicketUserBean;
import com.bean.UserBean;
 
import com.dao.UserDao;
import com.dao.UserStorage;
 
@WebServlet("/ListBookingServlet")
public class ListBookingServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
			
			RequestDispatcher rd = request.getRequestDispatcher("ListBooking.jsp");
			rd.forward(request, response);
		}
}
