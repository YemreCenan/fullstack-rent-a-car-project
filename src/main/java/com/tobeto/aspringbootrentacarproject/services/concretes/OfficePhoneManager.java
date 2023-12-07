package com.tobeto.aspringbootrentacarproject.services.concretes;


import com.tobeto.aspringbootrentacarproject.entities.OfficePhone;
import com.tobeto.aspringbootrentacarproject.repositories.OfficePhoneRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.OfficePhoneService;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.AddOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.DeleteOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.UpdateOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.resposes.GetListOffPhoneResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficePhoneManager implements OfficePhoneService {


    private OfficePhoneRepository officePhoneRepository;

    public OfficePhoneManager(OfficePhoneRepository officePhoneRepository) {
        this.officePhoneRepository = officePhoneRepository;
    }

    @Override
    public void add(AddOfficePhoneRequest request) {
    if (request.getPhoneOne()== request.getPhoneTwo()){
        throw new RuntimeException("iki alan için aynı numara kullanılamaz.");
    }
        OfficePhone officePhone = new OfficePhone();
        officePhone.setPhoneOne(request.getPhoneOne());
        officePhone.setPhoneTwo(request.getPhoneTwo());
        officePhoneRepository.save(officePhone);

    }

    @Override
    public void delete(DeleteOfficePhoneRequest request) {
      OfficePhone deleteToOfficePhone = officePhoneRepository.findById(request.getId()).orElseThrow();
      officePhoneRepository.delete(deleteToOfficePhone);
    }

    @Override
    public void update(UpdateOfficePhoneRequest request) {
      OfficePhone updateToOfficePhone= officePhoneRepository.findById(request.getId()).orElseThrow();
      updateToOfficePhone.setPhoneOne(request.getPhoneOne());
      updateToOfficePhone.setPhoneTwo(request.getPhoneTwo());
      officePhoneRepository.save(updateToOfficePhone);
    }

    @Override
    public List<OfficePhone> getAll() {
        List<OfficePhone>officePhoneList = officePhoneRepository.findAll();
        return officePhoneList;
    }

    @Override
    public OfficePhone getById(int id) {
        OfficePhone officePhone = officePhoneRepository.findById(id).orElseThrow();
        return officePhone;
    }

    @Override
    public List<OfficePhone> getByPhoneOne(int phoneOne) {
        return officePhoneRepository.findByPhoneOne(phoneOne)
                .stream()
                .filter((of)->of.getPhoneOne()>10).toList();


    }


}
