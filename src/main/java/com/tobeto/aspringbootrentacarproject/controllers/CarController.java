package com.tobeto.aspringbootrentacarproject.controllers;


import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.repositories.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("allCars")
    public List<Car> getAll() {
        List<Car> cars = carRepository.findAll();
        return cars;
    }

    @GetMapping("{id}")
    public Car getById(@PathVariable int id) {
        return carRepository.findById(id).orElseThrow();
    }

    @PostMapping("add")
    public void add(@RequestBody Car car) {
        carRepository.save(car);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id, @RequestBody Car car) {
        Car deleteToCar = carRepository.findById(id).orElseThrow();
        carRepository.delete(deleteToCar);

    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, @RequestBody Car car) {
        Car upateToCar = carRepository.findById(id).orElseThrow();
        upateToCar.setModelYear(car.getModelYear());
        upateToCar.setModelName(car.getModelName());
        upateToCar.setDailyPrice(car.getDailyPrice());
        upateToCar.setColor(car.getColor());
        upateToCar.setStatus(car.getStatus());
        upateToCar.setFuelType(car.getFuelType());
        carRepository.save(upateToCar);


    }

}
