<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSTL - Java Server Pages Standard Tag Library</title>
	</head>
	<body>
		
		<core:out value="${name}"></core:out>  <br><br>
		
		<core:forEach items="${employees}" var="employee">
			${employee}  <br><br>
		</core:forEach>
		
	</body>
</html>