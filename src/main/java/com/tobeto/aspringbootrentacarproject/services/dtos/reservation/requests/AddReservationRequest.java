package com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests;


import lombok.Data;

import java.time.LocalDate;

@Data
public class AddReservationRequest {
    private double totalPrice;
    private LocalDate beginingDate;
    private LocalDate endDate;
}
