package com.tobeto.aspringbootrentacarproject.repositories;

import com.tobeto.aspringbootrentacarproject.entities.CurrentOffice;
import com.tobeto.aspringbootrentacarproject.entities.OfficePhone;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.responses.GetListCurrOfficeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrentOfficeRepository extends JpaRepository<CurrentOffice,Integer> {





   //JPQL FİLTER BY CITIES
    @Query("SELECT new com.tobeto.aspringbootrentacarproject.services.dtos.current_office.responses.GetListCurrOfficeResponse(cu.officeStreet,cu.officeCity,cu.officeCountry,cu.officeState)" +
    "FROM CurrentOffice cu WHERE cu.officeCity= :officeCity" )
    List<GetListCurrOfficeResponse>getByCity(String officeCity);




}
