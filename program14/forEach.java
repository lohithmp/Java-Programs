package com.josh.training.javaprograms.program14;

import java.util.List;
/*
 * Implementation of  forEach and forEachOrderedmethod method.
 */
public class forEach  {
	public static void main(String[] args) {
		/*
		 * Using forEach loop we are getting unordered company names respective list data.
		 */
		System.out.println("Using forEach loop we are getting unordered company names respective list data \n");
		List.of("Google", "Microsoft", "Josh", "Infosys", "Oracle").stream().parallel()
				.forEach(companies -> System.out.println(companies));
		/*
		 * Using forEachOrdered loop we are getting ordered company names respective list data.
		 */
		System.out.println("\nUsing forEachOrdered loop we are getting ordered company names respective list data\n");
		List.of("Google", "Microsoft", "Josh", "Infosys", "Oracle").stream().parallel()
				.forEachOrdered(companies -> System.out.println(companies));
		
	}

	
}
