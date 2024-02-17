package com.prabhu.servletannotations;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkLeapYear")
public class CheckLeapYear extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int year = Integer.parseInt(request.getParameter("userInput"));
		String result;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					result = "a leap year";
				} else {
					result = "not a leap year";
				}
			} else {
				result = "a leap year";
			}
		} else {
			result = "not a leap year";
		}
		
		response.getWriter().println(year + " is " + result);
	}

}
