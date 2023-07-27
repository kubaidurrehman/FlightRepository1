package com.SpringBoot.FlightReservation.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.SpringBoot.FlightReservation.DTO.Reservation;
import com.SpringBoot.FlightReservation.DTO.ReservationUpdateRequest;

@Component
public class ReservationRestClintImpl implements ReservationRestClint {

	private static final String RESERVATION_REST_URL = "http://localhost:8080/UbaidAirlines/reservation/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);

		return reservation;
	}

	@Override
	public Reservation UpdateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		return reservation;

	}

}
