package com.jpa.onetoone.controller;

import com.jpa.onetoone.model.Car;
import com.jpa.onetoone.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
/*
Class CarController handles the Data Transfer between the user and the Database.
 */
public class CarController {
    //Autowiring the bean created for CarService class.
    @Autowired
    private CarService carService;

    //Using @PostMapping to add and save the Data into the dataBase.
    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car) {
        return carService.postCar(car);
    }

    //Using @GetMapping to get the data from the database.
    @GetMapping("/getCar")
    public List<Car> getCar(){
        return carService.getAll();
    }

    //Getting the data according to specific Id.
    @GetMapping("/getCarManyTOMany/{id}")
    public  Car getCarManyTOMany(@PathVariable("id") long carNumber){
        return carService.getCarByIdManyTOMany(carNumber);
    }
}
