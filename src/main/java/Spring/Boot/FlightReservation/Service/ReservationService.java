package Spring.Boot.FlightReservation.Service;

import Spring.Boot.FlightReservation.DTO.ReservationRequest;
import Spring.Boot.FlightReservation.Entity.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
