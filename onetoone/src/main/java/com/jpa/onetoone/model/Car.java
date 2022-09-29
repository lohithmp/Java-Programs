package com.jpa.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
/*
Using @Entity to create a Table With Class Car as the table Name.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    //@Id is used to declare the primary key.
    //@GeneratedValue to auto generate the value.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long carNumber;
    private String carName;

    /*
      Relations of both OneToOne and ManyToOne has been implemented.

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "passenger_Id")
//    private Passenger passenger;

//    @ManyToOne(cascade = CascadeType.ALL)
//    private Passenger passenger;
     */

    @ManyToMany
    @JsonIgnore
    private List<Passenger> passengers;
}