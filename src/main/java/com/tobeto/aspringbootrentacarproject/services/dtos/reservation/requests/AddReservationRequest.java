package com.tobeto.aspringbootrentacarproject.services.dtos.reservation.requests;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddReservationRequest {
    @Positive(message = "Toplam ücret negatif değer alamaz")
    private double totalPrice;
    @FutureOrPresent(message = "Kiralama başlangıç tarihi bugün veya gelecek bir tarih olmalıdır.")
    private LocalDate beginingDate;
    @Future(message = "Kiralama bitiş tarihi gelecekte bir tarih olmalıdır.")
    private LocalDate endDate;
}
