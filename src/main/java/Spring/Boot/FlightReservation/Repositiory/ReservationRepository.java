package Spring.Boot.FlightReservation.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.Boot.FlightReservation.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
