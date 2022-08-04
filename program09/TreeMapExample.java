package com.josh.training.javaprograms.program09;

import java.util.*;
/*
 * Using TreeMap to implements put method.
 */
public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> studentObj = new TreeMap<Integer, String>();
		//Using put method to adding the elements into TReeMap object.
		studentObj.put(05, "Shekar");
		studentObj.put(02, "Chandru");
		studentObj.put(03, "Mahesh");
		studentObj.put(04, "Sunil");
		studentObj.put(01, null);
		studentObj.put(01, "Pavan");
		/*
		 * EntrySet method is used to create a new set and store the map elements into them.
		 */
		Set set = studentObj.entrySet();
		Iterator nameItr = set.iterator();
		/*
		 * Map.Entry is used to access the entry in the TreeMap.
		 */
		System.out.println("Key and values of students\n");
		while (nameItr.hasNext()) {
			Map.Entry name = (Map.Entry) nameItr.next();
			System.out.println("key value is " + name.getKey() + " value is " + name.getValue());
		}
	}
}
/*
 * OUTPUT: Key and values of students
 * 
 * key value is 1 value is Pavan 
 * key value is 2 value is Chandru 
 * key value is 3 value is Mahesh 
 * key value is 4 value is Sunil 
 * key value is 5 value is Shekar
 */