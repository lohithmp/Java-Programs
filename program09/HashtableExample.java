package com.josh.training.javaprograms.program09;

import java.util.*;
/*
 * Using Hashtable to implements method
 */
public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer, Integer> oilObj = new Hashtable<Integer, Integer>();
		// Using .put() method to add the elements into the hashtable.
		oilObj.put(142, 500);
		oilObj.put(152, 1000);
		oilObj.put(2412, 700);
		oilObj.put(1154, 300);
		oilObj.put(214, 100);
		System.out.println("Displaying BillNumber and Price of oil is\n");
		/*
		 * EntrySet method is used to create a new set and store the hashtable elements
		 * into Collection.
		 */
		Set set = oilObj.entrySet();
		Iterator iterator = set.iterator();
		/*
		 * Map.Entry method is used to access the entry in the Hashtable.
		 */
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> m = (Map.Entry<Integer, Integer>) iterator.next();
			System.out.println("Bill Number: " + m.getKey() + ", Oil Price: " + m.getValue()+" Rupee");
		}
	}
}
/*
 * OUTPUT: Displaying BillNumber and Price of oil is
 * 
 * Bill Number: 1154, Oil Price: 300 Rupee
 * Bill Number: 142, Oil Price: 500 Rupee
 * Bill Number: 152, Oil Price: 1000 Rupee
 * Bill Number: 214, Oil Price: 100 Rupee
 * Bill Number: 2412, Oil Price: 700 Rupee
 */