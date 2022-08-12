package com.josh.training.javaprograms.program14;

import java.util.*;
/*
 * Creating a class to implement lambda functions.
 */
public class LambdaExp {
	public static void main(String[] args) {
		List<String> lst = new LinkedList<String>();
		lst=List.of("Ramesh", "Suresh", "Umesh");
		
		AdditionFunctionalInterface ref = () -> {
			return "No parameter values---first class\n";
		};
		System.out.println(ref.result());
		int x = 25;
		FunctionalInterface ref01 = (y) -> {
			System.out.println("sum of " + (x + y)+"\n");
		};
		//calling Element() method present in FunctionalInterface interface.
		ref01.Element(75);
		System.out.println("List of names-");
		lst.forEach((names) -> System.out.println(names));
		
	}
}
