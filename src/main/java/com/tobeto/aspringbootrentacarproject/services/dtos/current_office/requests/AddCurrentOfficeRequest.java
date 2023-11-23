package com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests;

import lombok.Data;

@Data
public class AddCurrentOfficeRequest {
    private String officeStreet;
    private int officeNumber;
    private String officeCity;
    private String officeCountry;
    private String officeState;
}
