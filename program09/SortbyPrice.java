package com.josh.training.javaprograms.program09;

import java.util.Comparator;

/*
 * SortbyPrice class sorting price by using implementing Comparator interface
 */
public class SortbyPrice implements Comparator<Car> {

	@Override
	public int compare(Car price1, Car price2) {

		return (price1.carPrice - price2.carPrice);
	}

}
