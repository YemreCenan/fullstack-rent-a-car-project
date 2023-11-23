package com.tobeto.aspringbootrentacarproject.services.dtos.car.requests;

import lombok.Data;

@Data
public class AddCarRequest {
    private int modelYear;
    private String modelName;
    private double dailyPrice;
    private String color;
    private String status;
    private String fuelType;

}
