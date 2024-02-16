package com.prabhu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompareTwoNumbers extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int number1 = Integer.parseInt(req.getParameter("number1"));
		int number2 = Integer.parseInt(req.getParameter("number2"));
		
		int result = number1 > number2 ? number1 : number1 == number2 ? 0 : number2;
		
		PrintWriter output = res.getWriter();
		
		if (result == 0) {			
			output.println("Both numbers are Equal");
		} else {
			req.setAttribute("num1", number1);
			req.setAttribute("num2", number2);
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("compareNumbers");
			requestDispatcher.forward(req, res);
		}
	}
	
}
