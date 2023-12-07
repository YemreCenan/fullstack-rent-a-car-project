package com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteBrandRequest {
@Positive(message = "id negatif olamaz")
    private int id;


}
