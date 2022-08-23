package com.josh.training.javaprograms.program09;

import lombok.*;
/*
 * Using car class to get values to variables.
 * @AllArgsConstructor generates a constructor with 1 parameter for each field in Car class
 * @ToString generate an implementation of the toString() method
 * @Data generates getters and setters for all fields
 */

@AllArgsConstructor
@ToString
@Data
public class Car {
	int carPrice;
	String carName;
}
