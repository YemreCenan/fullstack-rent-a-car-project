package com.tobeto.aspringbootrentacarproject.services.dtos.customer.requests;

import lombok.Data;

@Data
public class UpdateCustomerRequest {
    private int id;
    private int identiNumber;
    private String firstName;
    private String lastName;
    private int mobil;
    private String email;
    private String country;
    private String address;
    private String state;
}
