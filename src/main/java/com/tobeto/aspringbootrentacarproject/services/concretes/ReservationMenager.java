package com.tobeto.aspringbootrentacarproject.services.concretes;

import com.tobeto.aspringbootrentacarproject.entities.Reservation;
import com.tobeto.aspringbootrentacarproject.repositories.ReservationRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.ReservationService;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.AddReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.DeleteReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.UpdateReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.responses.GetListReservationResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationMenager implements ReservationService {


    private ReservationRepository reservationRepository;

    public ReservationMenager(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void add(AddReservationRequest request) {
     Reservation reservation = new Reservation();
     reservation.setTotalPrice(request.getTotalPrice());
     reservation.setBeginingDate(request.getBeginingDate());
     reservation.setEndDate(request.getEndDate());
     reservationRepository.save(reservation);

    }

    @Override
    public void delete(DeleteReservationRequest request) {
     Reservation deleteToReservation=reservationRepository.findById(request.getId()).orElseThrow();
     reservationRepository.delete(deleteToReservation);
    }

    @Override
    public void update(UpdateReservationRequest request) {
        Reservation updateToReservation=reservationRepository.findById(request.getId()).orElseThrow();
        updateToReservation.setTotalPrice(request.getTotalPrice());
        updateToReservation.setBeginingDate(request.getEndDate());
        updateToReservation.setEndDate(request.getEndDate());
        reservationRepository.save(updateToReservation);
    }

    @Override
    public List<Reservation> getAll() {
        List<Reservation> reservationList =reservationRepository.findAll();
        return reservationList;
    }

    @Override
    public Reservation getById(int id) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow();

        return reservation;
    }

    @Override
    public List<GetListReservationResponse> getByPriceDto(double totalPrice) {
        return reservationRepository.findByPrice(totalPrice)
                .stream()
                .filter((r)-> r.getTotalPrice()<1000).toList();
    }


}
