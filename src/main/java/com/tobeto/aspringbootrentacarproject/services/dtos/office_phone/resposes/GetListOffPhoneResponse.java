package com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.resposes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListOffPhoneResponse {
    private int phoneOne;
    private int phoneTwo;
}
