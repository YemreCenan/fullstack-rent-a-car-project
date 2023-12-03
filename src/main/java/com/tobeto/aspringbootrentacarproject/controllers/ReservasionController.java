package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.Reservation;
import com.tobeto.aspringbootrentacarproject.repositories.ReservationRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.ReservationService;
import com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.AddReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.DeleteReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests.UpdateReservationRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.reservation.responses.GetListReservationResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/reservation")
public class ReservasionController {


    private ReservationService reservationService;

    public ReservasionController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("getAll")
    public List<Reservation> getAll() {

        return reservationService.getAll();
    }

    @GetMapping("getById")
    public Reservation getById(int id){

        return reservationService.getById(id);
    }

    @PostMapping("/add/")
    public void add(AddReservationRequest request){
        reservationService.add(request);

    }
    @DeleteMapping("/delete/")
    public void delete(DeleteReservationRequest request){
       reservationService.delete(request);
    }
    @PutMapping("/update/")
    public void update(UpdateReservationRequest request){
       reservationService.update(request);

    }

    @GetMapping("/dtoTotalPrice")
    public List<GetListReservationResponse> getByPriceDto(@RequestParam double totalPrice){

        return reservationService.getByPriceDto(totalPrice);
    }



}
