<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flight</title>
</head>
<body>

<h2> Find Flights</h2>
<fieldset>
<legend>Find Flights</legend>
<form action="findFlight" method="post"> <pre>
From           : <input type="text" name="from"/>

To             : <input type= "text" name= "to"/>

Depurture Date : <input type= "text" name="dateOfDepurture"/>

<input type="submit" value="search"> </pre>
</form>
</fieldset>

</body>
</html>