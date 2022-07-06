package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdmissionFilter implements Filter{

	 
	public void destroy() {
		 		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		 	String Math = request.getParameter("Math");
		 	String Phy = request.getParameter("Phy");
		 	String Che = request.getParameter("Che");
		 	
		 	if(Math == null || Phy == null || Che==null || Math.trim().length() == 0 || Phy.trim().length() == 0  || Che.trim().length() == 0 ) {
		 		
		 		request.setAttribute("err", "Pls Enter Valid Marks");	
		 		
		 		RequestDispatcher rd = request.getRequestDispatcher("Admission.jsp");
				rd.forward(request, response);
			} else {
				
				chain.doFilter(request, response);// if second filter is there then call it
				// else call 
			}
		 
	}
	public void init(FilterConfig arg0) throws ServletException {
	 
		
	}

}
