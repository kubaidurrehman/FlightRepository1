<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<fieldset>
<legend>User Login</legend>
<form action="login" method="post">
<pre>
User Email : <input type="text" name="email"/>

Password :   <input type="password" name="password"/>
<input type="submit" value="Login"/>
${msg}
</pre>
</form>
</fieldset>
</body>
</html>