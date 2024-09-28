package com.josh.training.javaprograms.program14;

import java.util.Optional;
/*
 * Creating Optional class to implements Optional's method.
 */
public class OptionalDemo {
	public static void main(String[] args) {
		String name= "Kolar Gold Fields";
		Optional<String> option= Optional.of(name);
		/*
		 * Optional.ofNullable() method used to get an instance of the Optional class with a specified value
		 */
		Optional<String> empty =Optional.ofNullable(null);
		/*
		 * option.isPresent() method used to check element is present in option reference.
		 */
		if(option.isPresent()) {
			System.out.println(option);
		}
		/*
		 * .ifPresent() method is used to if element is present on given reference and it will allow to do implementation
		 */
		option.ifPresent(s->System.out.println(s));
		/*
		 *  empty.isPresent() method used to check element is present in option reference
		 */
		if(empty.isPresent()) {
			System.out.println("Yeah it's not empty");
		}
		else {
			System.out.println("Yeah it's empty");
		}
		/*
		 * .orElseGet() method is used to get the value of this Optional instance if present
		 */
		System.out.println(empty.orElseGet(()->"empty"));
		System.out.println(option.orElse("Bye"));
	}
}
