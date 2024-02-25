<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Super Career</title>
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

	<p>Welcome, ${username}</p>

</body>
</html>