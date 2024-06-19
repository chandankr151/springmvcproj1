<%@page import="java.time.LocalDateTime"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to help page</h1>
	<%-- <%
		String name = (String) request.getAttribute("name");
		String roll = (String) request.getAttribute("rollNumber");
		LocalDateTime dt = (LocalDateTime) request.getAttribute("dt");
	%> --%>
	
	<%-- <h2>Your Name: <%=name %></h2>
	<h3>Your Roll: <%=roll %></h3>
	<h4>Date&Time Now: <%=dt %></h4> --%>
	
	<h2>Your Name: ${name}</h2>
	<h3>Your Roll: ${rollNumber}</h3>
	<h4>Date&Time Now: ${dt}</h4>
	<hr>
	
	
	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
	</c:forEach>
	
	<h1><c:out value="${marks }"></c:out></h1>
</body>
</html>