package com.josh.training.javaprograms.program14;

import java.util.function.BiFunction;

/*
 * Here implementing MethodRefeInterface and AdditionFunctionalInterface Interfaces
 */
public class MethodReference {
	public String subject() {
		return "PASS";
	}

	public static void main(String[] args) {
		// Creating object of the class "MethodReference".
		MethodReference mref = new MethodReference();
		//Implementing the abstract method "result()" present in the "AdditionFunctionalInterface" Interface using method reference.
		AdditionFunctionalInterface fi = mref::subject;
		System.out.println(fi.result());
		// Using  BIFunction Interface to implement the static method "add" with the help of method reference.
		BiFunction<Integer, Integer, Double> mr = Operation::add;
		System.out.println(mr.apply(100, 200));
	}
}
