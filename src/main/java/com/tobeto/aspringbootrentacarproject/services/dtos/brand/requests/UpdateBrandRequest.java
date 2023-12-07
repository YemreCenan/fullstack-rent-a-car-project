package com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UpdateBrandRequest {
    @Positive(message = "id negatif olamaz")
    private int id;
    @NotBlank
    @Length(min = 3)
    private String name;
}
