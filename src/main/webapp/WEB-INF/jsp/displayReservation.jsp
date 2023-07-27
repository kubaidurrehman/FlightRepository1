<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
<fieldset>
<legend><h2>Flight Details : </h2></legend>
<pre>
Airlines: ${reservation.flight.operatingAirlines}<br/>

Departure City : ${reservation.flight.depurtureCity}<br/>

Arrival City : ${reservation.flight.arrivalCity}<br/>

Date of Departure : ${reservation.flight.dateOfDepurture}<br/>

Estimated Departure time : ${reservation.flight.estimatedDepurtureTime}<br/>
</pre>
<form action="completeCheckIn" method="post">
Enter the number of Bags you want to check in : <input type="text" name="numberOfBags"/>

<input type="hidden" value="${reservation.id}" name="reservationId"/>
<input type="submit" value="Check In"/>

</form>
</fieldset>
</body>
</html>