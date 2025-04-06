<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: grey; 
            color: white;
        }
        .form-container {
            width: 300px;
            margin: 80px auto;
            padding: 20px;
            background-color: #fff; 
            border: 1px solid #ccc;
            border-radius: 5px;
            color: black; 
        }
        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-container label {
            font-size: 14px;
            margin-bottom: 5px;
            display: block;
        }
        .form-container input, .form-container select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-container button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
        }
        .form-container button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Employee Form</h2>
        <form:form action="save" method="post" modelAttribute="command">
            

            <label for="empName">Name</label>
            <form:input path="name" />
            
            <label for="salary">Salary</label>
            <form:input path="salary" />
            
            <label for="designation">designation</label>
            <form:input path="designation" />

            

            <button type="submit" value="save">Submit</button>
        </form:form>>
    </div>

</body>
</html>
