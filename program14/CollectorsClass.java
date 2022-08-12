package com.josh.training.javaprograms.program14;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
 * Using Collector class to implements its methods
 */
public class CollectorsClass {
	public static void main(String[] args) {
		//Arrays.asList() method to adding all elements.
		List<Integer> numbers= Arrays.asList(20,10,50,20,150,10);
		/*
		 * using Stream API to implementing filter(), collect()
		 * filter() method which returns a stream consisting of the elements.
		 * collect() method collects objects from a stream object and stored in the List collections here.
		 * collectors.toList() returns a Collector Interface that gathers the input data onto a new list
		 */
		//Printing whose greater than 30 in list collections 
		List<Integer> num=numbers.stream().filter(greater->greater>30).collect(Collectors.toList());
		System.out.println("Numbers greater than 30 are \n"+num);
		/*
		 * Here giving average value of all elements present in list object using averagingDouble() method.
		 */
		Double average=numbers.stream().collect(Collectors.averagingDouble(avg->avg));
		System.out.println("Average of given numbers is "+average);
		/*
		 * Using groupingBy method to counting each elements present in list object and display it.
		 */
		Map<Integer,Long> list=numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("\nCounting the each element: \n"+list);
		/*
		 * StringJoiner class is adding elements in between every elements in the StringJoiner object
		 */
		StringJoiner foodChain= new StringJoiner("->","Food Chain: "," Repeat");
		foodChain.add("Grass");
		foodChain.add("Mosquito");
		foodChain.add("Rat");
		foodChain.add("Snake");
		foodChain.add("Eagle");
		StringJoiner foodChain1= new StringJoiner("->","Food Chain: "," Repeat");
		foodChain1.add("Grass");
		foodChain1.add("Mosquito");
		foodChain1.add("Rat");
		foodChain1.add("Snake");
		foodChain1.add("Eagle");
		System.out.println(foodChain);
		/*
		 * Here concatenate both StringJoiner object elements and displaying it.
		 */
		StringJoiner merge= foodChain.merge(foodChain1);
		System.out.println(merge);
		
	}
}
