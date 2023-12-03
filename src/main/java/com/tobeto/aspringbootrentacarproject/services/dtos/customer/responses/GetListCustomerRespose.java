package com.tobeto.aspringbootrentacarproject.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetListCustomerRespose {

    private int identiNumber;
    private String firstName;
    private String lastName;
    private String state;
}
