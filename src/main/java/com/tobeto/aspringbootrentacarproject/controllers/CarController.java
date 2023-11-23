package com.tobeto.aspringbootrentacarproject.controllers;


import com.tobeto.aspringbootrentacarproject.entities.Brand;
import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.repositories.CarRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CarService;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.AddCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.UpdateCarRequest;
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
    public void add(@RequestBody AddCarRequest request){
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

}
