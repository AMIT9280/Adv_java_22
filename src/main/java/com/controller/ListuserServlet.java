package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
//@WebServlet("/ListuserServlet")
public class ListuserServlet extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserDao userDao = new UserDao();
		ArrayList<UserBean> users = userDao.getAllUser();
		
		request.setAttribute("allUser", users);
		
		RequestDispatcher rd = request.getRequestDispatcher("ListUser.jsp");
		rd.forward(request, response);

	}
}
