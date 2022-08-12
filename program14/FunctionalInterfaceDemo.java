package com.josh.training.javaprograms.program14;

import java.util.function.IntBinaryOperator;

/*
 *  Functional Interface using lambda expression
 */
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		//Creating our own  Functional Interface using lambda expression
		InterfaceforSAM mult=(x,y)->x*y;
		System.out.println("Multiply of 5 and 200 is "+mult.MethodSAM(5,200));
		// Predefined Functional Interface using lambda expression
		//IntBinaryOperator Represents an operation upon two int valued operands and producing an int valued result
		IntBinaryOperator ibo=(x,y)->x+y;
		System.out.println("Addition of 25 and 25 is "+ibo.applyAsInt(25, 25));
	}
}
