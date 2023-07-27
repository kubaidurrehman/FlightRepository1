package Spring.Boot.FlightReservation.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.Boot.FlightReservation.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 User findByEmail(String email);
	
	
}
