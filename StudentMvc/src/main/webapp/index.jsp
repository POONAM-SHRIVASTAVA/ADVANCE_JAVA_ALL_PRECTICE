<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
 <body>
  <c:set var="num" value="5"></c:set>
  <c:set var="age" value="4"></c:set>
  <c:set var="id" value="9"></c:set>
  <a href='jstl-demo.jsp'>JSTL Demo</a>
  <a href='GetStudentController'>Fetch Data</a>
    <div class="container">
    	<div class="alert alert-primary" role="alert">
    		<c:out value="Welcome to Student CRUD application"></c:out>
    		<c:out value="Sum is ${5+2}"></c:out>
    		<c:out value="Num is ${num}3" />
  		</div>
  		<h1>Num is ${num}</h1>
  		<c:if test="${age>=18}">
  			<h4>User is eligible</h4>
  		</c:if>
  		
  		<c:choose>
  			<c:when test="${id==1}">
  				<h5>Aman</h5>
  			</c:when>
  			<c:when test="${id==2}">
  				<h5>Priya</h5>
  			</c:when>
  			<c:when test="${id==3}">
  				<h5>Priyanka</h5>
  			</c:when>
  			<c:otherwise>
  				Id does not exists
  			</c:otherwise>
  		</c:choose>
    </div>

    
    <div class="container mt-5">
    	<div class="row">
    		<div class="col-lg-4">
    			<div class="card">
  					<div class="card-body">
    					<h5 class="card-title">Register Student</h5>
    					<p class="card-text">Click the button below to open registration form</p>
    					<a href="register.jsp" class="btn btn-success">Register Student</a>
  					</div>
				</div>
    		</div>
    		<div class="col-lg-4">
    			<div class="card">
  					<div class="card-body">
    					<h5 class="card-title">Fetch Students</h5>
    					<p class="card-text">Click the button below to view all the students</p>
    					<a href="StudentController" class="btn btn-success">Fetch all students</a>
  					</div>
				</div>
    		</div>
    	</div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>

</html>