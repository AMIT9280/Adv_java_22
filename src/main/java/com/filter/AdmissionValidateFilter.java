package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdmissionValidateFilter implements Filter{

	@Override
	public void destroy() {
		 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		  
		String Maths = request.getParameter("Math"); 
		String Phy = request.getParameter("Phy");
		String Che = request.getParameter("Che");
		
		int  m =Integer.parseInt(Maths);
		int  p =Integer.parseInt(Phy);
		int  c =Integer.parseInt(Che);
		
		int total = m+p+c;
		
		if(m>=60 && p>=50 && c>=40 || (m+p)>=150 && total>=200) {
			request.setAttribute("total",total);
			request.setAttribute("msg", "eligible to get admission");
			RequestDispatcher rd = request.getRequestDispatcher("Admission.jsp");
			rd.forward(request, response);
			
		}else {
			request.setAttribute("msg", "Not eligible to get admission");
			RequestDispatcher rd = request.getRequestDispatcher("Admission.jsp");
			chain.doFilter(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		 
	}

}
