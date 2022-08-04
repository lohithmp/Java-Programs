package com.josh.training.javaprograms.program09;

import java.util.*;
/*
 * Using ArrayList to sort the price of car
 */
public class CarCamparator {
	public static void main(String[] args) {
		ArrayList<Car> array = new ArrayList<Car>();
		array.add(new Car(100000, "Hyundai Creta"));
		array.add(new Car(240000, "Innova Crysta"));
		array.add(new Car(380000, "KIA Carnival"));
		array.add(new Car(200000, "Honda Civic"));
		array.add(new Car(150000, "Tata Harrier"));
		System.out.println("Unsorted price of car\n");
		// Unsorted price of car
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		// Sorted price of car
		System.out.println("\nSorted price of car\n");
		Collections.sort(array, new SortbyPrice());
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
/*
 * OUTPUT: Unsorted price of car
 * 
 * Car(carPrice=100000, carName=Hyundai Creta) 
 * Car(carPrice=240000,carName=Innova Crysta) 
 * Car(carPrice=380000, carName=KIA Carnival)
 * Car(carPrice=200000, carName=Honda Civic)
 *  Car(carPrice=150000, carName=Tata Harrier)
 * 
 * Sorted price of car
 * 
 * Car(carPrice=100000, carName=Hyundai Creta) 
 * Car(carPrice=150000, carName=Tata Harrier) 
 * Car(carPrice=200000, carName=Honda Civic) 
 * Car(carPrice=240000,carName=Innova Crysta) 
 * Car(carPrice=380000, carName=KIA Carnival)
 */