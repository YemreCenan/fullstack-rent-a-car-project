package com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AddCurrentOfficeRequest {
    @NotBlank
    @Length(max = 50, message = "En fazla 50 karakter kullanabilirsiniz.")
    private String officeStreet;
@NotBlank
@Positive
@Max(value = 5 ,message = "En fazla 5 haden oluşabilir.")
    private int officeNumber;
@NotBlank
@Length(max = 50,message = "En fazla 50 karakterden oluşmalıdır.")
    private String officeCity;
@NotBlank
@Min(value = 3,message = "Minimum 3 karakterden oluşmalıdır")
    private String officeCountry;
@NotBlank
    private String officeState;

}
