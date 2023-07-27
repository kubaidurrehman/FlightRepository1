package com.SpringBoot.FlightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoot.FlightReservation.DTO.Reservation;
import com.SpringBoot.FlightReservation.DTO.ReservationUpdateRequest;
import com.SpringBoot.FlightReservation.Integration.ReservationRestClint;

@Controller
public class CheckedInController {

	@Autowired
	ReservationRestClint restClint;

	@RequestMapping("/startCheckedIn")
	public String showStarcheckin() {
		return "startCheckedIn";
	}

	@RequestMapping("/showStartCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {

		Reservation reservation = restClint.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);

		return "displayReservation";
		}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,@RequestParam("numberOfBags") int numberOfBags ) {
		ReservationUpdateRequest reservationUpdateRequest= new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		reservationUpdateRequest.setCheckedIn(true);
		restClint.UpdateReservation(reservationUpdateRequest);
		return "CheckinConfirmation" ;
	}

}