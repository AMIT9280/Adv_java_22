package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class YearFilter implements Filter{

	
	public void destroy() {
		
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		int bYear = Integer.parseInt(request.getParameter("bYear"));
		System.out.println(bYear);
		if (bYear >= 1920 && bYear <= 2022 ) {
			chain.doFilter(request, response);
					} else {
						request.setAttribute("error", "Please Enter Valid Birth Year");
						RequestDispatcher rd = request.getRequestDispatcher("FilterInput.jsp");
						rd.forward(request, response);
// if second filter is there then call it
			// else call 
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
