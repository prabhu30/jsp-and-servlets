<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSTL - Java Server Pages Standard Tag Library</title>
	</head>
	<body>
		
		<h1>Core Tag Library</h1>
		<b>Core - out tag</b> <br><br>
		<core:out value="${name}"></core:out>  
		<br><br>	
		
		<b>Core - forEach tag</b> <br><br>
		<core:forEach items="${employees}" var="employee">
			${employee}  
			<br><br>
		</core:forEach>
		
		<%-- Add password in the below setDataSource configuration in order to display sql results
		<h1>SQL Tag Library</h1>
		<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/prabhudb" user="root" password="**************"/>
		
		<sql:query var="rs" dataSource="${db}">select * from movies</sql:query>
		
		
		<core:forEach items="${rs.rows}" var="movie">
			<core:out value="${movie.id}"></core:out> | <core:out value="${movie.name}"></core:out> | <core:out value="${movie.rating}"></core:out>
			<br>
		</core:forEach>
		--%>
		
		<h1>Functions Tag Library</h1>
		<core:set var="str" value="Prabhu Kalyan is a god gifted child"></core:set>
		
		<core:forEach items="${fn:split(str, ' ')}" var="item">
			<core:out value="${item}"></core:out><br>
		</core:forEach>
		
		<core:if test="${fn:contains(str, 'Prabhu')}">
			<h3>Welcome, Prabhu! Keep Smiling.</h3>
		</core:if>
	</body>
</html>