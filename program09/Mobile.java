package com.josh.training.javaprograms.program09;

import lombok.AllArgsConstructor;
import lombok.ToString;
/*
 * Mobile class used to get values of variables from LinkedListExample class
 * @AllArgsConstructor generates a constructor with 1 parameter for each field in Mobile class.
 * @ToString will cause lombok to generate an implementation of the toString() method.
 */
@AllArgsConstructor
@ToString
public class Mobile {
	private String mobileName;
	private String mobileColor;
	private int mobilePrice;
	
}
