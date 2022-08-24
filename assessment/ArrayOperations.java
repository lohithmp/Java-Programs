package com.josh.assessment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Create ArrayList with elements, ArrayList = {1,4,8,10,19,20}
Perform Below operations on the ArrayList:
- Calculate the length by iterating it.
- Calculate the sum of elements in the ArrayList and print it
- Create the separate list one for Odd numbers and One for Even numbers
 */

public class ArrayOperations {
	public static void main(String[] args) {

		List<Integer> array = Arrays.asList(1, 4, 8, 10, 19, 20);

		int sum = 0;
		int count = 0;
		//Calculating the length by iterating it
		for (Integer integer : array) {
			count++;
		}
		//Adding the elements in the ArrayList
		for (Integer i : array) {
			sum = sum + i;
		}
		//Created list and only odd elements stored by using stream
		List<Integer> odd = array.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		//Created list and only even elements stored by using stream
		List<Integer> even = array.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println("Length of the array is: " + count);
		System.out.println("the sum of elements in the ArrayList: " + sum);
		System.out.println("odd elements of arraylist is :" + odd);
		System.out.println("even elements of arraylist is :" + even);
	}

}
