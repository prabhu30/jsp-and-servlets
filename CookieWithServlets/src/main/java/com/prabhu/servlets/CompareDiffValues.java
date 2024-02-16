package com.prabhu.servlets;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CompareDiffValues extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int num1 = 0, num2 = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie cookie : cookies) {
			if (cookie.getName().equals("num1")) {
				num1 = Integer.parseInt(cookie.getValue());
			} else if (cookie.getName().equals("num2")) {
				num2 = Integer.parseInt(cookie.getValue());
			}
		}
		
		int result = num1 > num2 ? num1 : num2;
		
		res.getWriter().println("Greatest Number of " + num1 + " and " + num2 + " is : " + result);
	}
}
