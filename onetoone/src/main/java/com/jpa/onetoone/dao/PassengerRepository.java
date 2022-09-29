package com.jpa.onetoone.dao;

import com.jpa.onetoone.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
//@Transactional
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
