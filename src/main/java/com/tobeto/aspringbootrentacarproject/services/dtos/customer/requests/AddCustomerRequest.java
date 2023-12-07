package com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddCustomerRequest {

    @Positive
    @Min(value = 11,message = "11 haneli olmalıdır.")
    @Max(value = 11,message = "11 haneli olmalıdır.")
    private int identiNumber;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Positive
    private int mobil;
    @NotBlank
    private String email;
    @NotBlank
    private String country;
    @NotBlank
    private String address;
    @NotBlank
    private String state;
}
