package com.tobeto.aspringbootrentacarproject.repositories;

import com.tobeto.aspringbootrentacarproject.entities.Reservation;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.responses.GetListReservationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {



    @Query("Select new com.tobeto.aspringbootrentacarproject.services.dtos.reservation.responses.GetListReservationResponse(r.totalPrice,r.beginingDate,r.endDate)"+
            "From Reservation r Where r.totalPrice = :totalPrice")

    List<GetListReservationResponse>findByPrice(double totalPrice);

}
