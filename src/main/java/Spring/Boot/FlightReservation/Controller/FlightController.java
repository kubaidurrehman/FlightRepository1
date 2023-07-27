package Spring.Boot.FlightReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Spring.Boot.FlightReservation.Entity.Flight;
import Spring.Boot.FlightReservation.Repositiory.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("findFlight")
	public String findFlight(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("dateOfDepurture") String date, ModelMap modelMap) {
		System.out.println(from + " " + to + " " + date);
		List<Flight> flights = flightRepository.findFlight(from, to, date);
		System.out.println(flights);
		modelMap.addAttribute("flights", flights);
		return "Flights/displayFlights";
	}
}
