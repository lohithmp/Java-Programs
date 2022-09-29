package com.jpa.onetoone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long passengerId;
    private String passengerName;


    /*
      Relations of both OneToOne and ManyToOne has been implemented.

//   @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "car_Number",
//            referencedColumnName = "carNumber")
//    private Car car;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "passenger_Id",referencedColumnName = "passengerId")
//    private List<Car> car1;
     */

    //@ManyToMany to implement ManyToMany relation Between multiple entities.
    @ManyToMany(cascade = CascadeType.ALL)

    //@JoinTable to specifically join a table to another entity's table
    @JoinTable(
            name = "car_passengers",
            joinColumns = @JoinColumn(name = "passenger_Id",
            referencedColumnName = "passengerId"),
            inverseJoinColumns = @JoinColumn(name = "car_Number",
            referencedColumnName = "carNumber")
    )
    private List<Car> cars;
}