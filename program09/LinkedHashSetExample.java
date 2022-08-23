package com.josh.training.javaprograms.program09;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Using LinkedHashSet and TreeSet object to implements methods
 */
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> railwaysZone = new LinkedHashSet<String>();

		/*
		 * Adding elements to LinkedHashSet object using .add() method
		 */
		railwaysZone.add("Souther Railways");
		railwaysZone.add("Eastern Railways");
		railwaysZone.add("Western Railways");
		railwaysZone.add("Nothern Railways");
		/*
		 * Creating TreeSet Object by using Conversion of LinkedHashSet to TreeSet
		 */
		TreeSet<String> treeSetObj = new TreeSet<String>(railwaysZone);
		// Adding duplicate element to TreeSet Object.
		treeSetObj.add("Eastern Railways");

		// Displaying the elements in sorted order .
		System.out.println("\nDisplaying the Railway Zones in India by using TreeSet Object reference\n");
		for (String zones : treeSetObj) {
			System.out.println(zones + " Zones");
		}
		// Adding duplicate element to LinkedHashSet Object.
		railwaysZone.add("Western Railways");
		// Adding null element to LinkedHashSet Object.
		railwaysZone.add(null);
		// Adding multiple null element to LinkedHashSet Object.
		railwaysZone.add(null);
		// Displaying the elements in sorted order .
		System.out.println("\nDisplaying the Railway Zones in India by using LinkedHashSet Object reference\n");
		for (String zones : railwaysZone) {
			System.out.println(zones + " Zones");
		}
	}
}
/*
 * OUTPUT: Displaying the Railway Zones in India by using TreeSet Object
 * reference
 * 
 * Eastern Railways Zones Nothern Railways Zones Souther Railways Zones Western
 * Railways Zones
 * 
 * Displaying the Railway Zones in India by using LinkedHashSet Object reference
 * 
 * Souther Railways Zones Eastern Railways Zones Western Railways Zones Nothern
 * Railways Zones null Zones
 */
