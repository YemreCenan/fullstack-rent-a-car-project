package com.tobeto.aspringbootrentacarproject.services.dtos.car.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCarResponse {

    private int id;
    private String modelName;
    private String fuelType;
    private String color;

}
