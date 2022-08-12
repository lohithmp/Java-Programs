package com.josh.training.javaprograms.program14;

import java.util.List;
import java.util.stream.Collectors;
/*
 * creating Stream class object and its implementation.
 */
public class StreamDemo {
	public static void main(String[] args) {
		/*
		 * using Stream API to implementing filter(),startWith()
		 * filter() method which returns a stream consisting of the elements.
		 */
		List.of("Shashi", "Bhuvan", "Venka", "Maltesh").stream().filter(x -> x.startsWith("S"))
				.forEach(s -> System.out.println("Whose name start's with S :" + s));
		/*
		 * count() method used to counting the length of the elements present in list object.
		 */
		long length = List.of(11, 22, 55, 44, 66, 77, 88, 99, 100).stream().count();
		System.out.println("\nLength of the List is " + length);
		/*
		 * using Stream API to implementing map(), collect() and toLowerCase()
		 * map() method is used to transform one object into other by applying a function.
		 * collect() method collects objects from a stream object and stored in the List collections here.
		 * toLowerCase() method is used to making given string into lower case.
		 */
		System.out.println("\nBikes brand name in lower case:");
		List.of("H2", "ZX10RR", "10RR", "PANIGALE V4").stream().map(str -> str.toLowerCase())
				.collect(Collectors.toList()).forEach(brand -> System.out.println(brand));

	}
}
