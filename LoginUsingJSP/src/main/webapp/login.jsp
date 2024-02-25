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
	%>

	<form action="Login" method="POST">
		
		<br> <label for="password">Enter Username : </label>
		<input type="text" name="username" id="username" placeholder="username">

		<br><br>
		<label for="password">Enter Password : </label>
		<input type="password" name="password" id="password" placeholder="password" autocomplete="off">
		
		<br><br>
		<input type="submit" value="LOGIN">
		
	</form>

</body>
</html>