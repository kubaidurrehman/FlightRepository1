package Spring.Boot.FlightReservation.Entity;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {
	private String flightNumber;
	private String operatingAirlines;
	private String depurtureCity;
	private String arrivalCity;
	private String dateOfDepurture;
	private String estimatedDepurtureTime;

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

	public String getEstimatedDepurtureTime() {
		return estimatedDepurtureTime;
	}

	public void setEstimatedDepurtureTime(String estimatedDepurtureTime) {
		this.estimatedDepurtureTime = estimatedDepurtureTime;
	}

	public String getDateOfDepurture() {
		return dateOfDepurture;
	}

	public void setDateOfDepurture(String dateOfDepurture) {
		this.dateOfDepurture = dateOfDepurture;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines + ", depurtureCity="
				+ depurtureCity + ", arrivalCity=" + arrivalCity + ", dateOfDepurture=" + dateOfDepurture
				+ ", estimatedDepurtureTime=" + estimatedDepurtureTime + "]";
	}

}
