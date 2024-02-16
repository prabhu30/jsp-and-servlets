package com.prabhu.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompareDiffValues extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int num1 = (int) req.getAttribute("num1");
		int num2 = (int) req.getAttribute("num2");
		
		int result = num1 > num2 ? num1 : num2;
		
		res.getWriter().println("Greatest Number of " + num1 + " and " + num2 + " is : " + result);
	}
}
