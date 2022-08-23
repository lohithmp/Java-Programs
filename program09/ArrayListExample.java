package com.josh.training.javaprograms.program09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Using ArrayList to implement Various methods and sorting the elements using sort() method by using Comparable interface.
 */

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> places = new ArrayList<String>();
		// Using .add() method to add the elements into the ArrayList.
		places.add("Garudacharpalya");
		places.add("BTM Layout");
		places.add("Hoodi");
		places.add("Basavanagudi");
		places.add("Vijaynagara");
		System.out.println("Size of ArrayList is " + places.size());
		System.out.println("\nDisplaying The Area\n");
		// Using for-each loop to iterate through the ArrayList.
		for (String pl : places) {
			System.out.println(pl);
		}
		System.out.println("\nSorted form of elements\n");
		// Using Collections.sort() to sort the elements by implementing Comparable interface.
		Collections.sort(places);
		for (String sortpl : places) {
			System.out.println(sortpl);
		}
		System.out.println("\nRemoved an element of index 1\n");
		// Using remove() method to remove the element from specific index.
		places.remove(1);
		for (String removePl : places) {
			System.out.println(removePl);
		}
		System.out.println("\nReplace an element of index 2\n");
		// Using .set() method to add the element to a specific index.
		places.set(2, "Kuvempu Nagara");
		for (String setPl : places) {
			System.out.println(setPl);
		}
		// Using indexOf() method to get the index of a particular element.
		int elementIndex = places.indexOf("Garudacharpalya");
		System.out.println("\nGarudacharpalya place present in index of " + elementIndex);
		// Using contains() method to check the presence of an element.
		boolean isPresent = places.contains("BTM");
		System.out.println("\nIs BTM place is present in an array: " + isPresent);
	}

}

/*
 * OUTPUT: Size of ArrayList is 5
 * 
 * Displaying The Area
 * 
 * Garudacharpalya BTM Layout Hoodi Basavanagudi Vijaynagara
 * 
 * Sorted form of elements
 * 
 * BTM Layout Basavanagudi Garudacharpalya Hoodi Vijaynagara
 * 
 * Removed an element of index 1
 * 
 * BTM Layout Garudacharpalya Hoodi Vijaynagara
 * 
 * Replace an element of index 2
 * 
 * BTM Layout Garudacharpalya Kuvempu Nagara Vijaynagara
 * 
 * Garudacharpalya place present in index of 1
 * 
 * Is BTM place is present in an array: false
 * 
 */