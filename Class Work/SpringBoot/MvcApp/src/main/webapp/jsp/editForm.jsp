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
	<h1>Edit Employee</h1>
	<from:from method="POST" action="" >
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="id" /></td>
				<td></td>
			</tr>
			<tr>
			<td>name:</td>
				<td><form:input path="name" /></td>

			</tr>
			<tr>
			<td>name:</td>
				<td><form:input path="salary" /></td>

			</tr>
			<tr>
			<td>designation:</td>
				<td><form:input path="designation" /></td>

			</tr>
			
			<tr>
			<td></td>
				<td><input = "submit" value="Edit Save" /></td>
			</tr>
		</table>
	</from:from>
</body>
</html>