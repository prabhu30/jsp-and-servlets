package com.prabhu.servletappone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompareTwoNumbers extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int number1 = Integer.parseInt(req.getParameter("number1"));
		int number2 = Integer.parseInt(req.getParameter("number2"));
		
		int result = number1 > number2 ? number1 : number1 == number2 ? 0 : number2;
		
		PrintWriter output = res.getWriter();
		
		if (result != 0) {			
			output.println("Greatest of " + number1 + " and " + number2 + " is : " + result);
		} else {
			output.println("Both numbers are equal");
		}
	}
	
}
