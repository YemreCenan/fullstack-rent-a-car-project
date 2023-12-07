package com.tobeto.aspringbootrentacarproject.services.dtos.brand.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class GetListBrandResponse {
    private int id;
    private String name;

}
