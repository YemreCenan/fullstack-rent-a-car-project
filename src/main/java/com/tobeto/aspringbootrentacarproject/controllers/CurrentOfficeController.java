package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.CurrentOffice;
import com.tobeto.aspringbootrentacarproject.repositories.CurrentOfficeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/current_offices")
public class CurrentOfficeController {

    private final CurrentOfficeRepository currentOfficeRepository;


    public CurrentOfficeController(CurrentOfficeRepository currentOfficeRepository) {
        this.currentOfficeRepository = currentOfficeRepository;

    }

    @GetMapping
    public List<CurrentOffice> getAll() {
        List<CurrentOffice> currentOffices = currentOfficeRepository.findAll();

        return currentOffices;
    }

    @GetMapping("{id}")
    public CurrentOffice getById(@PathVariable int id){

        return currentOfficeRepository.findById(id).orElseThrow();
    }

    @PostMapping("/add/{id}")
    public void add(@PathVariable int id ,@RequestBody CurrentOffice currentOffice){

        currentOfficeRepository.save(currentOffice);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id,@RequestBody CurrentOffice currentOffice){
        CurrentOffice deteleToCurrOffice= currentOfficeRepository.findById(id).orElseThrow();
        currentOfficeRepository.delete(deteleToCurrOffice);

    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id,@RequestBody CurrentOffice currentOffice){
        CurrentOffice updateToCurrOffice= currentOfficeRepository.findById(id).orElseThrow();
        updateToCurrOffice.setOfficeStreet(currentOffice.getOfficeStreet());
        updateToCurrOffice.setOfficeNumber(currentOffice.getOfficeNumber());
        updateToCurrOffice.setOfficeCity(currentOffice.getOfficeCity());
        updateToCurrOffice.setOfficeCountry(currentOffice.getOfficeCountry());
        updateToCurrOffice.setOfficeState(currentOffice.getOfficeState());
        currentOfficeRepository.save(updateToCurrOffice);





    }



}



