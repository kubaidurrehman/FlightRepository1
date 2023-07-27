package com.SpringBoot.FlightReservation.DTO;

public class Flight {
	private Long id;
	private String flightNumber;
	private String operatingAirlines;
	private String depurtureCity;
	private String arrivalCity;
	private String dateOfDepurture;
	private String estimatedDepurtureTime;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(Long id, String flightNumber, String operatingAirlines, String depurtureCity, String arrivalCity,
			String dateOfDepurture, String estimatedDepurtureTime) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.operatingAirlines = operatingAirlines;
		this.depurtureCity = depurtureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDepurture = dateOfDepurture;
		this.estimatedDepurtureTime = estimatedDepurtureTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepurtureCity() {
		return depurtureCity;
	}

	public void setDepurtureCity(String depurtureCity) {
		this.depurtureCity = depurtureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDateOfDepurture() {
		return dateOfDepurture;
	}

	public void setDateOfDepurture(String dateOfDepurture) {
		this.dateOfDepurture = dateOfDepurture;
	}

	public String getEstimatedDepurtureTime() {
		return estimatedDepurtureTime;
	}

	public void setEstimatedDepurtureTime(String estimatedDepurtureTime) {
		this.estimatedDepurtureTime = estimatedDepurtureTime;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines
				+ ", depurtureCity=" + depurtureCity + ", arrivalCity=" + arrivalCity + ", dateOfDepurture="
				+ dateOfDepurture + ", estimatedDepurtureTime=" + estimatedDepurtureTime + "]";
	}

}
