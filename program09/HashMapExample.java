package com.josh.training.javaprograms.program09;

import java.util.*;

/*
 * Using HashMap to implements various methods 
 */
public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> empName = new HashMap<Integer, String>();
		empName.put(111, "Anirudh");
		empName.put(112, "Karthik");
		empName.put(113, "Jeevan");
		empName.put(114, "Girish");
		/*
		 * EntrySet method is used to create a new set and store the map elements into them.
		 */
		System.out.println("key and value of employees:\n");
		Set set = empName.entrySet();
		Iterator empItr = set.iterator();
		/*
		 * Map.Entry is used to access the entry in the HashMap.
		 */
		while (empItr.hasNext()) {
			Map.Entry en = (Map.Entry) empItr.next();
			System.out.println("key is "+en.getKey() + " value is " + en.getValue());
		}
		System.out.println("\n112 object key's value is:\n " + empName.get(112) + "\n");
		/*
		 * Removing particular element by using .remove() method
		 */
		empName.remove(113);
		System.out.println("After removal of 112 key is:\n");
		Iterator empItr2 = set.iterator();
		while (empItr2.hasNext()) {
			Map.Entry en1 = (Map.Entry) empItr2.next();
			System.out.println("key is "+en1.getKey() + " value is " + en1.getValue());
		}
		/*
		 * isEmpty() method is used to check elements is presence in object.
		 */
		boolean isEmpty=empName.isEmpty();
		System.out.println("\nIs HashMap empty?: "+isEmpty);
	}
}
/*
 * OUTPUT: key and value of employees:
 * 
 * key is 112 value is Karthik key is 113 value is Jeevan key is 114 value is
 * Girish key is 111 value is Anirudh
 * 
 * 112 object key's value is: Karthik
 * 
 * After removal of key and value is:
 * 
 * key is 112 value is Karthik key is 114 value is Girish key is 111 value is
 * Anirudh
 * 
 * Is HashMap empty?: false
 */

