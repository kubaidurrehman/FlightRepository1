package Spring.Boot.FlightReservation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.Boot.FlightReservation.DTO.ReservationRequest;
import Spring.Boot.FlightReservation.Entity.Flight;
import Spring.Boot.FlightReservation.Entity.Passenger;
import Spring.Boot.FlightReservation.Entity.Reservation;
import Spring.Boot.FlightReservation.Repositiory.FlightRepository;
import Spring.Boot.FlightReservation.Repositiory.PassengerRepository;
import Spring.Boot.FlightReservation.Repositiory.ReservationRepository;
import Spring.Boot.FlightReservation.Util.EmailUtil;
import Spring.Boot.FlightReservation.Util.PDFGenerator;
@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	PassengerRepository passsengerRepository;

	@Autowired
	ReservationRepository reservationRepository;
	

	@Autowired
	PDFGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;

	// Make Payment
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Long flightId = request.getFlightId();
		
		Flight flight = flightRepository.findById(flightId).get();
  System.err.println(request.getFirstName());
		Passenger passenger = new Passenger();
		passenger.setFirst_Name(request.getFirstName());
		passenger.setMiddle_Name(request.getMiddleName());
		passenger.setLast_Name(request.getLastName());
		passenger.setEmail(request.getPasssengerEmail());
		passenger.setPhoneNo(request.getPassengerPhoneNo());
		Passenger savedPassenger = passsengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedin(false);
		Reservation saveReservation = reservationRepository.save(reservation);
		
		
		String filePath="D:\\" + saveReservation.getId() + ".pdf";
		System.out.println(filePath);
		pdfGenerator.generateItinerary(saveReservation, filePath);
		System.out.println(passenger.getEmail());
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		
		return saveReservation;
	}

}
