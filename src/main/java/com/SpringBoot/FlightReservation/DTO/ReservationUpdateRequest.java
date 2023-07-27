package com.SpringBoot.FlightReservation.DTO;

public class ReservationUpdateRequest {

	private Long id;
	private boolean checkedIn;
	private int numberOfBags;
	public ReservationUpdateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationUpdateRequest(Long id, boolean checkedIn, int numberOfBags) {
		super();
		this.id = id;
		this.checkedIn = checkedIn;
		this.numberOfBags = numberOfBags;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	@Override
	public String toString() {
		return "ReservationUpdateRequest [id=" + id + ", checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags
				+ "]";
	}
	
	
}
