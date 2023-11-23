package com.tobeto.aspringbootrentacarproject.controllers;

import com.tobeto.aspringbootrentacarproject.entities.CurrentOffice;
import com.tobeto.aspringbootrentacarproject.repositories.CurrentOfficeRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CurrentOfficeService;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.AddCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.DeleteCurrentOfficeRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.current_office.requests.UpdateCurrentOfficeRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/current_offices")
public class CurrentOfficeController {

    private final CurrentOfficeService currentOfficeService;


    public CurrentOfficeController(CurrentOfficeService currentOfficeService) {
        this.currentOfficeService = currentOfficeService;

    }

    @GetMapping("getAll")
    public List<CurrentOffice> getAll() {

        return currentOfficeService.getAll();
    }

    @GetMapping("getById")
    public CurrentOffice getById(int id){

        return currentOfficeService.getById(id);
    }

    @PostMapping("/add/")
    public void add(AddCurrentOfficeRequest request){
        currentOfficeService.add(request);

    }

    @DeleteMapping("/delete/")
    public void delete(DeleteCurrentOfficeRequest request){
        currentOfficeService.delete(request);

    }

    @PutMapping("/update/")
    public void update(UpdateCurrentOfficeRequest request){
       currentOfficeService.update(request);

    }



}



