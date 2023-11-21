package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.OfficePhone;
import com.tobeto.aspringbootrentacarproject.repositories.OfficePhoneRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/office_phone")
public class OfficePhoneController {

 private final OfficePhoneRepository officePhoneRepository;


    public OfficePhoneController(OfficePhoneRepository officePhoneRepository) {
        this.officePhoneRepository = officePhoneRepository;
    }

    @GetMapping
    public List<OfficePhone> getAll(){
        List<OfficePhone> officePhones= officePhoneRepository.findAll();
        return officePhones;

    }

    @GetMapping("{id}")
    public OfficePhone getById(@PathVariable int id){

        return officePhoneRepository.findById(id).orElseThrow();
    }


    @PostMapping()
    public void add(@RequestBody OfficePhone officePhone){

        officePhoneRepository.save(officePhone);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        OfficePhone deleteToOfficePhone=officePhoneRepository.findById(id).orElseThrow();
        officePhoneRepository.delete(deleteToOfficePhone);

    }


    @PutMapping("update/{id}")
    public void update(@PathVariable int id,@RequestBody OfficePhone officePhone){
        OfficePhone updateOfficePhone = officePhoneRepository.findById(id).orElseThrow();
        updateOfficePhone.setPhoneOne(officePhone.getPhoneOne());
        updateOfficePhone.setPhoneTwo(officePhone.getPhoneTwo());
        officePhoneRepository.save(updateOfficePhone);

    }


}
