package com.tobeto.aspringbootrentacarproject.services.abstracts;

import com.tobeto.aspringbootrentacarproject.entities.OfficePhone;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.AddOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.DeleteOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.UpdateOfficePhoneRequest;

import java.util.List;

public interface OfficePhoneService {

    void add(AddOfficePhoneRequest request);
    void delete(DeleteOfficePhoneRequest request);
    void update(UpdateOfficePhoneRequest request);

    List<OfficePhone> getAll();

    OfficePhone getById(int id);

}
