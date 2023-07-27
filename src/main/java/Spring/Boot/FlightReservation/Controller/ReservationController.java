package Spring.Boot.FlightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Spring.Boot.FlightReservation.DTO.ReservationRequest;
import Spring.Boot.FlightReservation.Entity.Flight;
import Spring.Boot.FlightReservation.Entity.Reservation;
import Spring.Boot.FlightReservation.Repositiory.FlightRepository;
import Spring.Boot.FlightReservation.Service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightId).get();
		System.out.println("ShowCompleteReservation");
		System.out.println(flight);
		modelMap.addAttribute("flight", flight);
		
		return "Flights/completeReservation";
	}

	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		System.out.println(request.getFirstName());
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation is created successfully" + reservation.getId());
		return "Flights/reservationConfirmation";
	}
}
