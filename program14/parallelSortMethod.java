package com.josh.training.javaprograms.program14;

import java.util.Arrays;
/*
 * Implementation of parallelSort() method.
 */
public class parallelSortMethod {
public static void main(String[] args) {
	int numbers[]= {10,50,60,40,2,38};
	/*
	 * Arrays.parallelSort() method is used Sort the array index from 1 to 5.
	 */
	Arrays.parallelSort(numbers,1,5);
	System.out.println("Sorted array index from 1 to 5 :");
	Arrays.stream(numbers).forEach(display->System.out.print(display+" "));
}
}
