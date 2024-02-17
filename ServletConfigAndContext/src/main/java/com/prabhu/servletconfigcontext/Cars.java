package com.prabhu.servletconfigcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cars extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// ----- Servlet Context -----
		response.getWriter().println("<h1>Using Servlet Context</h1>");
		response.getWriter().println("<p><i>A parameter defined using servlet context in web.xml is shared "
				+ "across all the servlets. This parameter is not specific to one particular servlet. It "
				+ "is defined in global context and can be used by any servlet</i></p>");

		ServletContext servletContext = getServletContext();
		String carName = servletContext.getInitParameter("Car Name");
		String carPrice = servletContext.getInitParameter("Car On-road Price");
		
		response.getWriter().println("<b>My Favorite Car is : </b>" + carName);
		response.getWriter().println("<br><br><b>Car Price is : </b>" + carPrice);

		// ----- Servlet Config -----
		response.getWriter().println("<h1>Using Servlet Config</h1>");
		response.getWriter().println("<p><i>A parameter defined using servlet config in web.xml is shared by "
				+ "only that particular servlet, hence it should be defined in that servlet's mapping "
				+ "declaration. <br><b>Note : </b> Even though a global parameter is defined in servlet context "
				+ "with same parameter name, the parameter defined in servlet's mapping using servlet "
				+ "config will be given first priority while fetching the value in servlet class.</i></p>");

		ServletConfig servletConfig = getServletConfig();
		String carNameNew = servletConfig.getInitParameter("Car Name New");
		String carPriceNew = servletConfig.getInitParameter("Car Price New");
		
		response.getWriter().println("<b>My Favorite Car is : </b>" + carNameNew);
		response.getWriter().println("<br><br><b>Car Price is : </b>" + carPriceNew);
	}
}
