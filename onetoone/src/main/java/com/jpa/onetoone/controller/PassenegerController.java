package com.jpa.onetoone.controller;

import com.jpa.onetoone.model.Passenger;
import com.jpa.onetoone.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
Class PassenegerController handles the Data Transfer between the user and the Database.
 */
@RestController
public class PassenegerController {
    //Autowiring the bean created for PassengerService class.
    @Autowired
    private PassengerService passengerService;

    //Using @PostMapping to add and save the Data into the dataBase.
    @PostMapping("/addPassenger")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.postPassenger(passenger);
    }

    //Using @GetMapping to get the data from the database.
    @GetMapping("/getPassenger")
    public List<Passenger> getPassenger(){
        return passengerService.getAllPassenger();
    }

    @PostMapping("/addPassengerManyTOMany")
    public List<Passenger> addPassengerManyTOMany(@RequestBody List<Passenger> passengers) {
        return passengerService.postAllPassengerManyTOMany(passengers);
    }

    @GetMapping("/getPassenger/{id}")
    public  Passenger getPassengerManyTOMany(@PathVariable("id") long passengerId){
        return passengerService.getPassengerByIdManyTOMany(passengerId);
    }

    @GetMapping("/pagination/{offset}/{pageSize}")
    public List<Passenger> getPassengerManyTOManyPagination(@PathVariable("offset") int offSet, @PathVariable("pageSize") int pageSize){
        return passengerService.getPassengerManyTOManyPagination(offSet,pageSize);
    }
}