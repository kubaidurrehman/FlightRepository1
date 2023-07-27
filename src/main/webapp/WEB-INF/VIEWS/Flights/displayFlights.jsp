<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>
<fieldset>
	
<legend>Flights:</legend>
	<table>
		<thead>
			<tr>
				<th>Airlines</th>
				<th>Departure City</th>
				<th>Arrival City</th>
				<th>Departure Time</th>

			</tr>
		</thead>

		<c:forEach items="${flights}" var="flight">
			<tbody>
				<tr>
					<td>${flight.operatingAirlines}</td>
					<td>${flight.depurtureCity}</td>
					<td>${flight.arrivalCity}</td>
					<td>${flight.estimatedDepurtureTime}</td>
					<td><a href="showCompleteReservation?flightId=${flight.id}">Select</a></td>
				</tr>
			</tbody>
		</c:forEach>

	</table>
	</fieldset>
</body>
</html>