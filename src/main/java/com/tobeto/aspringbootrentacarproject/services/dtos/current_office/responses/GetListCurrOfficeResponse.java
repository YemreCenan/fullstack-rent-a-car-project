package com.tobeto.aspringbootrentacarproject.services.dtos.current_office.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCurrOfficeResponse {

  private String officeStreet;
  private String officeCity;
  private String officeCountry;
  private String officeState;



}
