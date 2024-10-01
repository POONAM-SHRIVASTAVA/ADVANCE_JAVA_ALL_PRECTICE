<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	String s1[] = {"101","Manoj","969595"}; 
	String s2[] = {"102","Suraj","6677733"};
	String s3[] = {"103","Vicky","8888222"};
	
	String students[][] = {s1,s2,s3};
	%>
	<table border='1' cellpadding='10' cellspacing='0'>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone</th>
		</tr>
		<% 
		for(int i=0;i<students.length;i++){
			%>
			<tr>
				<td><%=students[i][0] %></td>
				<td><%=students[i][1] %></td>
				<td><%=students[i][2] %></td>
			</tr>
			<%
		}
		%>
	</table>

</body>
</html>