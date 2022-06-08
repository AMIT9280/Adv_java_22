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
import com.dao.UserStorage;

@WebServlet("/TicketServlet")
public class TicketServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("Fname");
		String Mnum = request.getParameter("Mnum");
		String Category = request.getParameter("category");
		int Qty = Integer.parseInt(request.getParameter("qty")); 

		System.out.println(firstName);
		System.out.println(Mnum);
		System.out.println(Category);
		System.out.println(Qty);
		
		TicketUserBean user = new TicketUserBean();
		
		user.setCategory(Category);
		user.setFirstName(firstName);
		user.setMnum(Mnum);
		user.setQty(Qty);
		
		ArrayList<TicketUserBean> list = new ArrayList<TicketUserBean>();
		list.add(user);
		UserStorage.list.add(user);
		
		RequestDispatcher rd = request.getRequestDispatcher("ListBookingServlet");
		rd.forward(request, response);
		

	}
}
