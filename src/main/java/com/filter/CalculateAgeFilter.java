package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculateAgeFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String bYear = request.getParameter("bYear");
		if (bYear == null || bYear.trim().length() == 0 || bYear.contains("-") || bYear.length() <= 3 ) {
			request.setAttribute("error", "Please Enter Valid Birth Year");
			RequestDispatcher rd = request.getRequestDispatcher("FilterInput.jsp");
			rd.forward(request, response);
		} else {
			chain.doFilter(request, response);// if second filter is there then call it
			// else call 
		}

	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}
