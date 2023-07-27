<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h2>User Registration</h2>
<form action="registerUser" method="get">
<pre>
First Name:        <input type="text" name="first_Name"/>
Last Name :        <input type="text" name="last_Name"/>
User Email :       <input type ="text" name="email"/>
Password :         <input type="password" name="password"/>
Confirm password : <input type="password" name="confirmPassword"/>
<input type="submit" value="Register"/>
</pre>
</form>
</body>
</html>