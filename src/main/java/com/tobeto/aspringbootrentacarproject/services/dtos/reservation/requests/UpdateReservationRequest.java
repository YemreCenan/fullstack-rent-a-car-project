package com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateReservationRequest {
    private int id;
    private double totalPrice;
    private LocalDate beginingDate;
    private LocalDate endDate;
}
