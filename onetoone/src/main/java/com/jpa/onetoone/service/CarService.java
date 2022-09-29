package com.jpa.onetoone.service;

import com.jpa.onetoone.dao.CarRepository;
import com.jpa.onetoone.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    Creating CarService class to provide business logic to be implemented in the controller class.
 */
@Service
public class CarService {

    //Autowiring the bean created for CarRepository class to implement the JpaRepository methods.
    @Autowired
    private CarRepository carRepository;

    //Creating postCar to implement the save method.
    public Car postCar(Car car) {
        return carRepository.save(car);
    }

    //Creating getAll to implement the findAll method.
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    //Creating getCarByIdManyTOMany to implement the findById method to get the data with specific Id.
    public Car getCarByIdManyTOMany(long carNumber) {
        return  carRepository.findById(carNumber).get();
    }
}
