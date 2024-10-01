<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="5">
	<h5>Value ${i}</h5>
</c:forEach>

<table border="1" cellpadding="10" cellspacing="0">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Phone</th>
</tr>
<c:forEach items="${studentList}" var="s">
	<tr>
		<td>${s.getId()}</td>
		<td>${s.getName()}</td>
		<td>${s.getPhon()}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>