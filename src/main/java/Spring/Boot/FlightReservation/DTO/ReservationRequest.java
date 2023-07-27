package Spring.Boot.FlightReservation.DTO;


public class ReservationRequest {
	private Long flightId;
	private String firstName;
	private String lastName;
	private String MiddleName;
	private String passsengerEmail;
	private String passengerPhoneNo;
	private String nameOnTheCard;
	private String cardNumber;
	private String expirationDate;
	private String securityDate;
	public Long getFlightId() {
		return flightId;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public ReservationRequest(Long flightId, String firstName, String lastName, String middleName,
			String passsengerEmail, String passengerPhoneNo, String nameOnTheCard, String cardNumber,
			String expirationDate, String securityDate) {
		super();
		this.flightId = flightId;
		this.firstName = firstName;
		this.lastName = lastName;
		MiddleName = middleName;
		this.passsengerEmail = passsengerEmail;
		this.passengerPhoneNo = passengerPhoneNo;
		this.nameOnTheCard = nameOnTheCard;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityDate = securityDate;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPasssengerEmail() {
		return passsengerEmail;
	}
	public void setPasssengerEmail(String passsengerEmail) {
		this.passsengerEmail = passsengerEmail;
	}
	public String getPassengerPhoneNo() {
		return passengerPhoneNo;
	}
	public void setPassengerPhoneNo(String passengerPhoneNo) {
		this.passengerPhoneNo = passengerPhoneNo;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getSecurityDate() {
		return securityDate;
	}
	public void setSecurityDate(String securityDate) {
		this.securityDate = securityDate;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "ReservationRequest [flightId=" + flightId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", passsengerEmail=" + passsengerEmail + ", passengerPhoneNo=" + passengerPhoneNo + ", nameOnTheCard="
				+ nameOnTheCard + ", cardNumber=" + cardNumber + ", expirationDate=" + expirationDate
				+ ", securityDate=" + securityDate + "]";
	}
	
	
	
	
	
	
}
