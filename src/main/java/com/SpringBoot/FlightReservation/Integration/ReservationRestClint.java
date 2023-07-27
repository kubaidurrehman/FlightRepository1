package com.SpringBoot.FlightReservation.Integration;

import com.SpringBoot.FlightReservation.DTO.Reservation;
import com.SpringBoot.FlightReservation.DTO.ReservationUpdateRequest;

public interface ReservationRestClint {

	public Reservation findReservation(Long id);

	public Reservation UpdateReservation(ReservationUpdateRequest request);

}
