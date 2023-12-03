package com.tobeto.aspringbootrentacarproject.services.dtos.reservation.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListReservationResponse {

    private double totalPrice;
    private LocalDate beginingDate;
    private LocalDate endDate;

}
