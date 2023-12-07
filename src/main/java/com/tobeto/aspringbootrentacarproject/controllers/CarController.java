package com.tobeto.aspringbootrentacarproject.controllers;


import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CarService;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.AddCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.responses.GetListCarResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("getAll")
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable int id) {
        return carService.getById(id);
    }
    @PostMapping("/add/")
    public void add(@RequestBody @Valid AddCarRequest request){
        carService.add(request);

    }
    @DeleteMapping("/delete/")
    public void delete(@RequestBody DeleteCarRequest request){
        carService.delete(request);

    }
    @PutMapping("/update/")
    public void update(@RequestBody UpdateCarRequest request){
        carService.update(request);

    }


    @GetMapping("/filter/Color")
    public List<Car> getByColor(@RequestParam String color){
        return carService.getByColor(color);
    }

    @GetMapping("/dto/fuelType")
    public List<GetListCarResponse> getByFuelTypeDto(@RequestParam String fuelType){
        return carService.getByFuelTypeDto(fuelType);
    }





}
