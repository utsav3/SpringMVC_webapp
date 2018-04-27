<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<html>
<head>
<title>Insert title here</title>

<!-- 
Bootstrap Stylesheet CSS
 -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	  rel="stylesheet">

</head>
<body>
<div class="container">

<table class="table table-striped">
	<caption>${name} Todos List:</caption></br>

	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Completed?</th>
			<th></th>
		</tr>
	</thead>
	
	<tbody>
		
	<!-- for each loop -->
	<!--  for(todo:todos) -->
	<c:forEach items="${todos}" var="todo">
		</br>
		<tr>
			<td>${todo.desc}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.done}</td>
			<td><a href="/delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></a></td>
		</tr>
		  
	</c:forEach>
	
	</tbody>
	
	

	
</table>
<div>
<a class="btn btn-success" href="/add-todo">Add</a>
</div>

</div>
<!-- jquery and bootstrap -->	
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>