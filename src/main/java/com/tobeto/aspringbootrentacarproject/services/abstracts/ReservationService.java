package com.tobeto.aspringbootrentacarproject.services.abstracts;

import com.tobeto.aspringbootrentacarproject.entities.Reservation;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.AddReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.DeleteReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.UpdateReservationRequest;

import java.util.List;

public interface ReservationService {

    void add (AddReservationRequest request);
    void delete(DeleteReservationRequest request);
    void update(UpdateReservationRequest request);

    List<Reservation> getAll();

    Reservation getById(int id);
}
