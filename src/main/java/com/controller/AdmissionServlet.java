package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AdmissionServlet")
public class AdmissionServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				String Maths = request.getParameter("Math"); 
				String Phy = request.getParameter("Phy");
				String Che = request.getParameter("Che");
				
				int  m =Integer.parseInt(Maths);
				int  p =Integer.parseInt(Phy);
				int  c =Integer.parseInt(Che);
				
				int total = m+p+c;
				
				System.out.println(total);
				
				request.setAttribute("total",total);
				
				RequestDispatcher rd = request.getRequestDispatcher("Admission.jsp");
				rd.forward(request, response);
				
				
		}
}
