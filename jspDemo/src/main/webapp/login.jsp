<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServle" method="post">
	<input type="text" placeholder="Enter Username" name="username">
	<br><br>
	<input type="password" placeholder="Enter Password" name="password">
	<br><br>
	<input type="submit" value="login">
</form>
<%
	if(request.getAttribute("loginError")!=null){
		%>
		<h4><%=request.getAttribute("loginError") %></h4>
		<%
	}
%>

</html>