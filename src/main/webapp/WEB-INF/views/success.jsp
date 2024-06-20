<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success jsp</title>
<!-- <link rel="stylesheet" href="style.css"> -->

<style>
* {
	font-family: cursive;
}

body {
	margin: 0px;
	padding: 0px;
	display: flex;
	justify-content: center;
	height: 100vh;
	align-items: center;
	color: darkcyan;
}

form {
	padding: 5px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, .3);
	border-radius: 10px;
	width: 85%;
	max-width: 450px;
	min-width: 350px;
	min-height: 400px;
	display: flex;
	flex-direction: column;
	align-items: center;
}

p{
	font-size: 14px solid;	
}
</style>

</head>
<body>
	<form>
		<%-- <%
			String name  = (String)	request.getParameter("name");
			String email = (String)	request.getParameter("email");
			String pass  = (String)	request.getParameter("pass");
		%>
		<h1>Your Name: <%=name %></h1>
		<h2>Your Email: <%=email %></h2>
		<h3>Your Password: <%=pass %></h3> --%>

		<%-- <h1>Your Name: 		${name }</h1>
		<h2>Your Email: 	${email }</h2>
		<h3>Your Password: 	${pass }</h3> --%>

		<h1>Registration Success Form</h1>
		<h6>${desc }</h6>
	
		<p>Your Name: ${user.name }		<p>
		<p>Your Email: ${user.email }	<p>
		<p>Your Password: ${user.pass }	<p>
	</form>
</body>
</html>