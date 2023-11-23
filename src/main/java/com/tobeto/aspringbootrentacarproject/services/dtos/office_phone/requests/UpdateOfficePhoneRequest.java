package com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests;

import lombok.Data;

@Data
public class UpdateOfficePhoneRequest {
    private int id;
    private int phoneOne;
    private int phoneTwo;
}
