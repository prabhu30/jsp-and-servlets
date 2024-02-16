package com.prabhu.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CompareDiffValues extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// ----- with URL Rewriting -----
		// int num1 = Integer.parseInt(req.getParameter("num1"));
		// int num2 = Integer.parseInt(req.getParameter("num2"));
		
		// Session Management
		HttpSession session = req.getSession();
		
		int num1 = (int) session.getAttribute("num1");
		int num2 = (int) session.getAttribute("num2");
		
		int result = num1 > num2 ? num1 : num2;
		
		res.getWriter().println("Greatest Number of " + num1 + " and " + num2 + " is : " + result);
	}
}
