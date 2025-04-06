
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Login</h1>
		
		<form action="userController">
		Username : <input type="text" name="username" id="username"><br><br> 
		Password : <input type="text" name="password" id="password"><br><br> 
		<input type="submit" name="submit" value="submit"><br><br> 
		 <% String name =(String) request.getAttribute("key"); %>
		<h1><%= name %></h1>
		</form>
	</div>
</body>
</html>