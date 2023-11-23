package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.OfficePhone;
import com.tobeto.aspringbootrentacarproject.repositories.OfficePhoneRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.OfficePhoneService;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.AddOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.DeleteOfficePhoneRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.office_phone.requests.UpdateOfficePhoneRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/office_phone")
public class OfficePhoneController {


    private OfficePhoneService officePhoneService;

    public OfficePhoneController(OfficePhoneService officePhoneService) {
        this.officePhoneService = officePhoneService;
    }





    @GetMapping("getAll")
    public List<OfficePhone> getAll(){

        return officePhoneService.getAll();

    }

    @GetMapping("getById")
    public OfficePhone getById(int id){

        return officePhoneService.getById(id);
    }


    @PostMapping("/add/")
    public void add(AddOfficePhoneRequest request){

        officePhoneService.add(request);
    }

    @DeleteMapping("/delete/")
    public void delete(DeleteOfficePhoneRequest request){
        officePhoneService.delete(request);


    }


    @PutMapping("/update/")
    public void update(UpdateOfficePhoneRequest request){
        officePhoneService.update(request);

    }


}
