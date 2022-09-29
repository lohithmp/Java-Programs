package com.jpa.onetoone.service;

import com.jpa.onetoone.dao.PassengerRepository;
import com.jpa.onetoone.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
/*
Creating PassengerService class to provide business logic to be implemented in the controller class.
 */
@Service
public class PassengerService {
    //Autowiring the bean created for CarRepository class to implement the JpaRepository methods.
    @Autowired
    private PassengerRepository passengerRepository;

    //Creating postPassenger to implement the save method.
    public Passenger postPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    //Creating getAllPassenger to implement the findAll method.
    public List<Passenger> getAllPassenger() {
        return passengerRepository.findAll();
    }

    //Creating postAllPassengerManyTOMany to implement the saveAll method.
    public List<Passenger> postAllPassengerManyTOMany(List<Passenger> passengers) {
        return passengerRepository.saveAll(passengers);
    }

    //Creating getPassengerByIdManyTOMany to implement the findById method to get the data with specific Id.
    public Passenger getPassengerByIdManyTOMany(long passengerId) {
        return  passengerRepository.findById(passengerId).get();
    }

    //Creating getPassengerManyTOManyPagination to implement findAll method and pagination with sorting.
    public List<Passenger> getPassengerManyTOManyPagination(int offSet, int pageSize) {
        List<Passenger> passengers=  passengerRepository.findAll(PageRequest.of(offSet,pageSize, Sort.by("passengerName"))).getContent();
        return passengers;
    }
}
