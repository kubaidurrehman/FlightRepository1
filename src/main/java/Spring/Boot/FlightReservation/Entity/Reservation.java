package Spring.Boot.FlightReservation.Entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Reservation  extends AbstractEntity{
private Boolean checkedin;
private int numberOfBags;
@OneToOne
private Passenger passenger;
@OneToOne
private Flight flight;

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
	return "Reservation [checkedin=" + checkedin + ", numberOfBags=" + numberOfBags + "]";
}


}
