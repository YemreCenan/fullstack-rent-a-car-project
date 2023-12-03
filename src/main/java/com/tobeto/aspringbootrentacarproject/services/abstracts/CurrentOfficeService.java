package com.tobeto.aspringbootrentacarproject.services.abstracts;

import com.tobeto.aspringbootrentacarproject.entities.CurrentOffice;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.AddCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.DeleteCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.UpdateCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.responses.GetListCurrOfficeResponse;

import java.util.List;

public interface CurrentOfficeService {
    void add(AddCurrentOfficeRequest request);

    void delete(DeleteCurrentOfficeRequest request);
    void update(UpdateCurrentOfficeRequest request);

 List<CurrentOffice> getAll();
 CurrentOffice getById(int id);


 List<GetListCurrOfficeResponse>getByCityDto(String officeCity);

}
