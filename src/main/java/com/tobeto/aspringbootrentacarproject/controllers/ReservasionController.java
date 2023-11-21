package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.Reservation;
import com.tobeto.aspringbootrentacarproject.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservation")
public class ReservasionController {

    private final ReservationRepository reservationRepository;

    public ReservasionController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public List<Reservation> getAll() {
        List<Reservation> reservations = reservationRepository.findAll();

        return reservations;
    }

    @GetMapping("{id}")
    public Reservation getById(@PathVariable int id){

        return reservationRepository.findById(id).orElseThrow();
    }

    @PostMapping("/add/{id}")
    public void add(@RequestBody Reservation reservation){
        reservationRepository.save(reservation);

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        Reservation deleteToReservation = reservationRepository.findById(id).orElseThrow();
        reservationRepository.delete(deleteToReservation);
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable int id,@RequestBody Reservation reservation){
        Reservation updateToReservation = reservationRepository.findById(id).orElseThrow();
        updateToReservation.setTotalPrice(reservation.getTotalPrice());
        updateToReservation.setTotalPrice(updateToReservation.getTotalPrice());
        updateToReservation.setBeginingDate(updateToReservation.getBeginingDate());
        updateToReservation.setEndDate(updateToReservation.getEndDate());
        reservationRepository.save(updateToReservation);

    }



}
