package com.tobeto.aspringbootrentacarproject.repositories;

import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.responses.GetListCarResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {



   List<Car>findByColorStartingWith(String color);
    @Query("Select  new com.tobeto.aspringbootrentacarproject.services.dtos.car.responses.GetListCarResponse(c.id,c.modelName,c.fuelType)"+
            "From Car c WHERE c.fuelType = :fuelType")
    List<GetListCarResponse>getByFuelType(String fuelType);

boolean existsCarByFuelType(String fuelType);
}
