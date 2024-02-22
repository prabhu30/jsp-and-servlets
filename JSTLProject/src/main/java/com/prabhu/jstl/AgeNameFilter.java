package com.prabhu.jstl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/demoservlet")
public class AgeNameFilter implements Filter {

    public AgeNameFilter() {}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		int age = Integer.parseInt(req.getParameter("age"));
		String name = req.getParameter("name");
		
		if (age >= 18 && name.length() > 1) {			
			chain.doFilter(request, response);
		} else {
			response.getWriter().print("Invalid Input. Age must be greater than 18 and name should be meaningful.");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
