package com.tobeto.aspringbootrentacarproject.services.dtos.car.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {

    @Min(value = 2008,message = "Model yılı en az 2008 olmalıdır.")
    private int modelYear;

    @NotBlank(message = "Model adı boş olamaz")
    private String modelName;
    @Positive(message = "Araç ücreti negatif bir değer alamaz")
    private double dailyPrice;
    @NotBlank(message = "Lütfen renk giriniz.")
    private String color;
    @NotBlank(message = "araç statüsünü belirtiniz")
    private String status;

    @NotBlank(message = "Yakıt tipi boş geçilemez.")
    @Length(min = 3,message = "Yakıt ismi 3 haneden küçük olamaz.")
    private String fuelType;

}
