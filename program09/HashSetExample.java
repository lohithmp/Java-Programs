package com.josh.training.javaprograms.program09;

import java.util.HashSet;

/**
 * Using HashSet to implement Various methods.
 */
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> shoeObj = new HashSet<String>();
		shoeObj.add("Addidas");
		shoeObj.add("Puma");
		shoeObj.add("Liberty");
		shoeObj.add(null);
		shoeObj.add("Woodland");
		// Does not allow duplicate element.
		shoeObj.add("Addidas");
		// Does not allow multiple null elements.
		shoeObj.add(null);
		// Displaying the elements using for-each loop
		System.out.println("Displaying the Shoes brand\n");
		for (String obj : shoeObj) {
			System.out.println("Shoes brand " + obj);
		}
		// Using .remove() method to remove particular element.
		shoeObj.remove(null);
		System.out.println("\nAfter remove of null element displaying the shoes brand \n");
		for (String obj : shoeObj) {
			System.out.println("Shoes brand " + obj);
		}
		/*
		 * Creating another HashSet object to clone the above elements.
		 */
		HashSet<String> hashsetCloneObj = new HashSet<String>();
		hashsetCloneObj = (HashSet)shoeObj.clone();
		System.out.println("\nDisplaying the clone elements");
		System.out.println(hashsetCloneObj);
	}
}
/*
 * OUTPUT: Displaying the Shoes brand
 * 
 * Shoes brand null Shoes brand Addidas Shoes brand Liberty Shoes brand Puma
 * Shoes brand Woodland
 * 
 * After remove of null element displaying the shoes brand
 * 
 * Shoes brand Addidas Shoes brand Liberty Shoes brand Puma Shoes brand Woodland
 * 
 * Displaying the clone elements [Addidas, Liberty, Puma, Woodland]
 */