package com.josh.training.javaprograms.program09;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Using LinkedHashMap to implements put method
 */
public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> student = new LinkedHashMap<Integer, String>();
		/*
		 * Using put() method to adding key and values to object
		 */
		student.put(05, "Shekar");
		student.put(02, "Chandru");
		student.put(03, "Mahesh");
		student.put(04, "Sunil");
		// Adding null value to object
		student.put(01, null);
		// Again adding value to key 1
		student.put(01, "Pavan");
		/*
		 * EntrySet method is used to create a new set and store the map elements into
		 * Collection.
		 */
		Set linkedHMSet = student.entrySet();
		Iterator Itr = linkedHMSet.iterator();
		/*
		 * Map.Entry method is used to access the entry in the LinkedHashMap.
		 */
		System.out.println("Key and values of student:\n");
		while (Itr.hasNext()) {
			Map.Entry mapName = (Map.Entry) Itr.next();
			System.out.println("key value is " + mapName.getKey() + " value is " + mapName.getValue());
		}
	}
}
/*
 * OUTPUT: Key and values of student:
 * 
 * key value is 5 value is Shekar 
 * key value is 2 value is Chandru 
 * key value is 3* value is Mahesh 
 * key value is 4 value is Sunil 
 * key value is 1 value is Pavan
 */