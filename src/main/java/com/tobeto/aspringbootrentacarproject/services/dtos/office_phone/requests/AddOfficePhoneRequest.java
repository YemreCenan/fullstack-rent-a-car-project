package com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddOfficePhoneRequest {

    @NotBlank
    @Min(value = 10,message = "10 haneli olmalıdır.")
    @Max(value = 10,message = "10 haneli olmalıdır.")
    private int phoneOne;

    @NotBlank
    @Min(value = 10,message = "10 haneli olmalıdır.")
    @Max(value = 10,message = "10 haneli olmalıdır.")
    private int phoneTwo;
    


}
