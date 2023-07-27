package com.SpringBoot.FlightReservation.DTO;

public class Reservation {

	private Long id;
	private Boolean checkedin;
	private int numberOfBags;

	private Passenger passenger;

	private Flight flight;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Long id, Boolean checkedin, int numberOfBags, Passenger passenger, Flight flight) {
		super();
		this.id = id;
		this.checkedin = checkedin;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCheckedin() {
		return checkedin;
	}

	public void setCheckedin(Boolean checkedin) {
		this.checkedin = checkedin;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", checkedin=" + checkedin + ", numberOfBags=" + numberOfBags + ", passenger="
				+ passenger + ", flight=" + flight + "]";
	}

}
