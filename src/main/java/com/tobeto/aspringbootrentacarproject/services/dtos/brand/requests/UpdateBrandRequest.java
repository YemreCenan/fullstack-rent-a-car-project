package com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests;

import lombok.Data;

@Data
public class UpdateBrandRequest {
    private int id;
    private String name;
}
