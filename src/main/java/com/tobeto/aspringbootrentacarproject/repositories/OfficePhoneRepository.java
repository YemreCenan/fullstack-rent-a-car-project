package com.tobeto.aspringbootrentacarproject.repositories;

import com.tobeto.aspringbootrentacarproject.entities.OfficePhone;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.resposes.GetListOffPhoneResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface OfficePhoneRepository extends JpaRepository<OfficePhone,Integer> {



    List<OfficePhone>findByPhoneOne(int phoneOne);




}
