package com.tobeto.aspringbootrentacarproject.services.abstracts;

import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.AddCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {

    void add(AddCarRequest request);
    void delete(DeleteCarRequest request);
    void update(UpdateCarRequest request);

    List<Car>getAll();
    Car getById(int id);



}
