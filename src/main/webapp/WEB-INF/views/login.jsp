<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DOJO WEB APP</title>
<!-- LOADING DOJO -->
<script src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js"></script>
<script>
dojo.ready(function(){
	  dojo.byId("greeting").innerHTML += " from " + dojo.version;
	});
</script>
</head>
<body>
<h1 id="greeting">Dojo Version: </h1>
<form action="/login.do" method="post">
<p><font color = "red">${ErrorMessage}</font></p>
Enter your name: <input type="text" name = "name"/>
</br>
Enter your password: <input type="password" name = "password"/>
</br>

<input type="submit"/>

</body> 
</html>