<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%-- Directive (to import the packages) --%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Introduction to JSP</title>
	</head>
	<body>
		
		<%-- Declarative --%>
		<%-- (to declare variables/methods outside service() method when converted to servlet --%>
		<%!
			String sumOfNumbersText = "Sum of numbers";
		%>
		
		<%-- Scriptlet --%>
		<%-- Whatever written in scriptlet goes inside the service/doGet/doPost method after conversion --%>
		<%
			int number1 = Integer.parseInt(request.getParameter("num1"));
			int number2 = Integer.parseInt(request.getParameter("num2"));
			int sumOfNumbers = number1 + number2;
			
			List<Integer> numbersList = new ArrayList<>();
			numbersList.add(number1);	
			numbersList.add(number2);
		%>
		
		<%-- Expression --%>
		<%-- Whatever written in below expression goes inside out.println() method in servlet after conversion --%>
		<%= sumOfNumbersText + " is equal to " + sumOfNumbers %>
	</body>
</html>