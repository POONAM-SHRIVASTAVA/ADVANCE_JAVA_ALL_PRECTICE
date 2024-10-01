<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href ='sum.jsp'>add two no.</a>
<a href ='table.jsp'>Show table</a>
<a href ='login.jsp'>Login</a>

<h1>Hello World</h1>
<%! int a =5,b=3,sum=0; %>
<%
sum =a+b;
if(true){
System.out.println("sum is "+sum);
}
%>
<h3>sum is <%=sum%> </h3>
<%

int age=24;
if(age>=18){
	%>
	<h1>Eligible</h1>
	<% 
}
else{
	  %>
	  <p>not Eligible</p>
	  <%  
}
for(int i=1;i<=10;i++){
	%>
	<p><%=i %></p>
	<% 
}
%>
</body>
</html>