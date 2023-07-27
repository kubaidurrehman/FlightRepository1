<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation Details</title>
</head>
<body>
<fieldset>
<fieldset><pre>
<h2>Complete Reservation</h2>
Airline :        ${flight.operatingAirlines} <br/>
Departure City : ${flight.depurtureCity} <br/>
Arrival City :   ${flight.arrivalCity}<br/>
</pre>
</fieldset>
<form action="completeReservation">
<pre>

<fieldset>
<h2>Passanger Details :</h2>
First name :  <input type="text" name="firstName" />

Middle name : <input type="text" name="MiddleName" />

Last name :   <input type="text" name="lastName" />

Email :       <input type="text" name="passsengerEmail" />

Phone :       <input type="text" name="passengerPhoneNo" />
</fieldset>

<fieldset>
<h2>Card Details :</h2>
Name of the Card : <input type="text" name="nameOnTheCard">

Card No :          <input type="text" name="cardNumber">

Expiration Date :  <input type="text" name="expirationDate">

Four Digit security code : <input type="text" name="securityDate">
</fieldset>

<input type="hidden" name="flightId" value="${flight.id}"/>

<input type="submit" value="confirm"/>

</pre>
</form>
</fieldset>
</body>
</html>