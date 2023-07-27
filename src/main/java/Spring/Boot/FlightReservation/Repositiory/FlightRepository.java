package Spring.Boot.FlightReservation.Repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import Spring.Boot.FlightReservation.Entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query(value = "from Flight where depurture_city=:depurture_city and arrival_city=:arrival_city and date_of_depurture=:date_of_depurture")
	List<Flight> findFlight(@Param("depurture_city") String from, @Param("arrival_city") String to,
			@Param("date_of_depurture") String date_of_depurture);

//	In Spring Boot, the @Param annotation is used in conjunction with the @Query annotation to bind method parameters to named query parameters 
//in custom queries. It is typically used when you have multiple parameters in your query and you want to explicitly map them to method parameters.
}
