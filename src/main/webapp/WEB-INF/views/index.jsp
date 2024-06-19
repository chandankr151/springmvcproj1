<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home_Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h2>Called by home controller</h2>
	<h3>URL/home</h3>
	
	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		
		List<String> friends = (ArrayList<String>) request.getAttribute("friends");
		System.out.println("Your Name: "+name);
		System.out.println("Your ID: "+id);
	%>
	
	<h1>Your Name: <%= name %></h1>
	<h2>Your Id: <%= id %></h2>
	
	<h2>List of Your friends Name: </h2>
	<%
		for(String f: friends){
			System.out.println(f);
			%>
		<h3>Friend Name: <%=f %></h3><%
		}
	%>
</body>
</html>