package com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBrandRequest {
  @NotBlank
  @Length(min = 3, message ="Araç markası 3 haneden küçük olamaz")
   private String name;
}
