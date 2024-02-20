package com.prabhu.jstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoservlet")
public class DemoServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Display Strings
		String name = "korivi prabhu kalyan";
		request.setAttribute("name", name);
		
		// Display Objects
		List<Employee> employees = Arrays.asList(new Employee("prabhu kalyan", 28_00_000), 
												new Employee("sriram", 24_00_000), 
												new Employee("ajay sankar", 26_00_000));
		
		request.setAttribute("employees", employees);
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
	}
}
