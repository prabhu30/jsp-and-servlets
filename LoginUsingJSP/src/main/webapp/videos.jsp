<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");		// HTTP 1.1
		response.setHeader("Pragma", "no-cache");	// HTTP 1.0
		response.setHeader("Expires", "0");		// Proxies
		
		if (session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>

	<a href="home.jsp">Home</a>
	&ensp;
	<a href="mydashboard.jsp">Dashboard</a>
	&ensp;
	<a href="about.jsp">About</a>

	<h1>
		Complete Java, Spring, and Microservices course
	</h1>
	
	<iframe width="480" height="360" src="https://www.youtube.com/embed/4XTsAAHW_Tc" 
	title="Complete Java, Spring, and Microservices course" 
	frameborder="0" 
	allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" 
	allowfullscreen>
	</iframe>

</body>
</html>