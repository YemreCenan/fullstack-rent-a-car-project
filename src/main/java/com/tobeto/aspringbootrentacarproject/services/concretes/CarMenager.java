package com.tobeto.aspringbootrentacarproject.services.concretes;

import com.tobeto.aspringbootrentacarproject.entities.Car;
import com.tobeto.aspringbootrentacarproject.repositories.CarRepository;
import com.tobeto.aspringbootrentacarproject.services.abstracts.CarService;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.AddCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.aspringbootrentacarproject.services.dtos.car.responses.GetListCarResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarMenager implements CarService {
    private CarRepository carRepository;

    private CarMenager (CarRepository carRepository){
        this.carRepository =carRepository;

    }

    @Override
    public void add(AddCarRequest request) {
        if (request.getModelYear()<4)
        {
            throw new RuntimeException("The model year name cannot be less than 4 characters.");
        }
        if (carRepository.existsCarByFuelType(request.getFuelType())){

            throw new RuntimeException("minimum 3 karakterdern oluşmalıdır");
        }



        Car car = new Car();
        car.setModelYear(request.getModelYear());
        car.setModelName(request.getModelName());
        car.setDailyPrice(request.getDailyPrice());
        car.setColor(request.getColor());
        car.setStatus(request.getStatus());
        car.setFuelType(request.getFuelType());
        carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest request) {

        Car carToUpdate=carRepository.findById(request.getId()).orElseThrow();
        carToUpdate.setModelYear(request.getModelYear());
        carToUpdate.setModelName(request.getModelName());
        carToUpdate.setDailyPrice(request.getDailyPrice());
        carToUpdate.setColor(request.getColor());
        carToUpdate.setStatus(request.getStatus());
        carToUpdate.setFuelType(request.getFuelType());
        carRepository.save(carToUpdate);

    }

    @Override
    public void delete(DeleteCarRequest request) {
       Car carToDelete= carRepository.findById(request.getId()).orElseThrow();
       carRepository.delete(carToDelete);

    }

    @Override
    public List<Car> getAll() {
        List<Car> carList = carRepository.findAll();
        return carList;
    }

    @Override
    public Car getById(int id) {
        Car car = carRepository.findById(id).orElseThrow();
        return car;
    }

    @Override
    public List<Car> getByColor(String color) {
        return carRepository.findByColorStartingWith(color);
    }

    @Override
    public List<GetListCarResponse> getByFuelTypeDto(String fuelType) {
        return carRepository.getByFuelType(fuelType)
                .stream()
                .filter((car)->car.getFuelType().length()<=5).toList();
    }
}
