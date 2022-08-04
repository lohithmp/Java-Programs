package com.josh.training.javaprograms.program09;

import java.util.PriorityQueue;
/*
 * Using PriorityQueue to implements its methods
 */
public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> names = new PriorityQueue<String>();
		names.add("Bhuvan");
		names.add("Niroop");
		names.add("Chandan");
		names.add("Manoj");
		/*
		 * Using peek() method to retrieve head of the queue.
		 */
		System.out.println("First index of element in the queue is " + names.peek());
		/*
		 * Using poll() method to retrieve and remove the head of the queue.
		 */
		System.out.println("First index element is removed and displaying: " + names.poll());

		System.out.println("\nDisplaying the names in the queue are \n");
		for (String name : names) {
			System.out.println(name);
		}

	}
}
/*
 * OUTPUT 
 * First index of element in the queue is Bhuvan 
 * First index element is removed and displaying: Bhuvan
 * 
 * Displaying the names in the queue are
 * 
 * Chandan
 * Manoj 
 * Niroop
 */