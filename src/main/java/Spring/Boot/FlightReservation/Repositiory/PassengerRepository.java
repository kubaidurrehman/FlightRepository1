package Spring.Boot.FlightReservation.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.Boot.FlightReservation.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
