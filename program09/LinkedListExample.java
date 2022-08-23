package com.josh.training.javaprograms.program09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Using LinkedList to implement various methods
 */
public class LinkedListExample {
	public static void main(String[] args) {
		List<Mobile> mobileObj = new LinkedList<Mobile>();
		mobileObj.add(new Mobile("Vivo", "Gold", 35000));
		mobileObj.add(new Mobile("Oppo", "Brown", 30000));
		mobileObj.add(new Mobile("Realme", "White", 45000));
		mobileObj.add(new Mobile("Iphone", "Black", 100000));
		mobileObj.add(new Mobile("Iphone", "Black", 100000));
		// Adding null elements to LinkedList object.
		mobileObj.add(new Mobile(null, null, 0));
		System.out.println("Displaying the features of Mobile\n");
		for (int i = 0; i < mobileObj.size(); i++) {
			System.out.println(mobileObj.get(i));
		}
		/*
		 * Removing particular element and displaying it.
		 */
		System.out.println("\nRemoving element at index 4: \n" + mobileObj.remove(4) + "\n");
		// Adding another object to LinkedList object by using .add() method.
		mobileObj.add(new Mobile("Nothing", "LightBlack", 45000));
		System.out.println("Displaying after adding another object to LinkedList object\n");
		// Iterator to retrieve all elements.
		Iterator<Mobile> mobIterator = mobileObj.iterator();
		while (mobIterator.hasNext()) {
			System.out.println(mobIterator.next());
		}
		// Coversion of LinkedList to ArrayList.
		System.out.println("\nConverting LinkedList to Arraylist\n");
		List<Mobile> lst = new ArrayList<Mobile>(mobileObj);
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(mobileObj.get(i));
		}
	}
}
/*
 * OUTPUT 
 * Displaying the features of Mobile
 * 
 * Mobile(mobileName=Vivo, mobileColor=Gold, mobilePrice=35000)
 * Mobile(mobileName=Oppo, mobileColor=Brown, mobilePrice=30000)
 * Mobile(mobileName=Realme, mobileColor=White, mobilePrice=45000)
 * Mobile(mobileName=Iphone, mobileColor=Black, mobilePrice=100000)
 * Mobile(mobileName=Iphone, mobileColor=Black, mobilePrice=100000)
 * Mobile(mobileName=null, mobileColor=null, mobilePrice=0)
 * 
 * Removing element at index 4: 
 * Mobile(mobileName=Iphone, mobileColor=Black,mobilePrice=100000)
 * 
 * Displaying after adding another object to LinkedList object
 * 
 * Mobile(mobileName=Vivo, mobileColor=Gold, mobilePrice=35000)
 * Mobile(mobileName=Oppo, mobileColor=Brown, mobilePrice=30000)
 * Mobile(mobileName=Realme, mobileColor=White, mobilePrice=45000)
 * Mobile(mobileName=Iphone, mobileColor=Black, mobilePrice=100000)
 * Mobile(mobileName=null, mobileColor=null, mobilePrice=0)
 * Mobile(mobileName=Nothing, mobileColor=LightBlack, mobilePrice=45000)
 * 
 * Converting LinkedList to Arraylist
 * 
 * Mobile(mobileName=Vivo, mobileColor=Gold, mobilePrice=35000)
 * Mobile(mobileName=Oppo, mobileColor=Brown, mobilePrice=30000)
 * Mobile(mobileName=Realme, mobileColor=White, mobilePrice=45000)
 * Mobile(mobileName=Iphone, mobileColor=Black, mobilePrice=100000)
 * Mobile(mobileName=null, mobileColor=null, mobilePrice=0)
 * Mobile(mobileName=Nothing, mobileColor=LightBlack, mobilePrice=45000)
 */
