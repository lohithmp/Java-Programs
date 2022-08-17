package com.josh.training.javaprograms.program16;

import java.util.Scanner;

/**
 * Creating a Class to implement the different types of conversions using
 * respective methods.
 */
public class DatatypeConversion {
	public void intToString(int number) {
		/**
		 * Using .valueOf() method to convert given value to string.
		 */
		String str = String.valueOf(number);
		System.out.println("int to String converted value:  " + str);
	}

	public void intToDouble(int number) {
		double value = number;
		System.out.println("int to Double converted value:  " + value);
	}

	public void intToLong(int number) {
		long value = number;
		System.out.println("int to Long converted value:  " + value);
	}

	public void intToChar(int number) {
		char character = (char) number;
		System.out.println("int to Character converted value:  " + character);
	}

	/**
	 * Using .toString() method to convert the given value to string.
	 */
	public void longToString(long number) {
		String str = Long.toString(number);
		System.out.println("Long to String converted value:  " + str);
	}

	public void longToInt(long number) {
		int value = (int) number;
		System.out.println("Long to int converted value:  " + value);
	}

	public void doubleToInt(double number) {
		int value = (int) number;
		System.out.println("Double to int converted value:  " + value);
	}

	public void floatToString(float number) {
		String str = String.valueOf(number);
		System.out.println("float to String converted value:  " + str);
	}

	public void booleanToString(boolean number) {
		String str = Boolean.toString(number);
		System.out.println("boolean to String converted value:  " + str);
	}

	public void characterToInt(char number) {
		int value = (char) number;
		System.out.println("Character to int converted value:  " + value);
	}

	public void characterToString(char number) {
		String str = Character.toString(number);
		System.out.println("Character to String converted value:  " + str);
	}

	/*
	 * Using .parseLong() method to get the required primitive data type.
	 */
	public void stringToLong(String number) {
		long value = Long.parseLong(number);
		System.out.println("String to Long converted value:  " + value);
	}
	/*
	 * Using .parseDouble() method to get the required primitive data type.
	 */
	public void stringToDouble(String number) {
		double value = Double.parseDouble(number);
		System.out.println("String to double converted value:  " + value);
	}
	/*
	 * Using .parseBoolean() method to get the required primitive data type.
	 */
	public void stringToBoolean(String number) {
		boolean value = Boolean.parseBoolean(number);
		System.out.println("String to Boolean converted value:  " + value);
	}

	public static void main(String[] args) {
		DatatypeConversion conversionRef = new DatatypeConversion();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Select 1 for Integer to String conversion!! ");
		System.out.println(" Select 2 for Integer to Double conversion!! ");
		System.out.println(" Select 3 for Integer to Long conversion!! ");
		System.out.println(" Select 4 for Integer to Character conversion!! ");
		System.out.println(" Select 5 for Long to String conversion!! ");
		System.out.println(" Select 6 for Long to Int conversion!! ");
		System.out.println(" Select 7 for Double to Int conversion!! ");
		System.out.println(" Select 8 for Float to String conversion!! ");
		System.out.println(" Select 9 for boolean to String conversion!! ");
		System.out.println(" Select 10 for Character to Int conversion!! ");
		System.out.println(" Select 11 for Character to String conversion!! ");
		System.out.println(" Select 12 for String to Long conversion!! ");
		System.out.println(" Select 13 for String to double conversion!! ");
		System.out.println(" Select 14 for String to Boolean conversion!! ");
		System.out.println("\nSelect the number to convert data type from one to another: \n");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("Enter the integer value: ");
			int enterNum = scanner.nextInt();
			conversionRef.intToString(enterNum);
			break;
		case 2:
			System.out.println("Enter the integer value: ");
			int enterNum1 = scanner.nextInt();
			conversionRef.intToDouble(enterNum1);
			break;
		case 3:
			System.out.println("Enter the integer value: ");
			int enterNum2 = scanner.nextInt();
			conversionRef.intToLong(enterNum2);
			break;
		case 4:
			System.out.println("Enter the integer value: ");
			int enterNum3 = scanner.nextInt();
			conversionRef.intToChar(enterNum3);
		case 5:
			System.out.println("Enter the Long value: ");
			long enterNum4 = scanner.nextLong();
			conversionRef.longToString(enterNum4);
			break;
		case 6:
			System.out.println("Enter the Long value: ");
			long enterNum5 = scanner.nextLong();
			conversionRef.longToInt(enterNum5);
			break;
		case 7:
			System.out.println("Enter the Double value: ");
			double enterNum6 = scanner.nextDouble();
			conversionRef.doubleToInt(enterNum6);
			break;
		case 8:
			System.out.println("Enter the float value: ");
			float enterNum7 = scanner.nextFloat();
			conversionRef.floatToString(enterNum7);
			break;
		case 9:
			System.out.println("Enter the Boolean value: ");
			boolean enterNum8 = scanner.nextBoolean();
			conversionRef.booleanToString(enterNum8);
			break;
		case 10:
			System.out.println("Enter the character value: ");
			char enterNum9 = scanner.next().charAt(0);
			conversionRef.characterToInt(enterNum9);
			break;
		case 11:
			System.out.println("Enter the character value: ");
			char enterNum10 = scanner.next().charAt(0);
			conversionRef.characterToString(enterNum10);
			break;
		case 12:
			System.out.println("Enter the String value: ");
			String enterNum11 = scanner.next();
			conversionRef.stringToLong(enterNum11);
			break;
		case 13:
			System.out.println("Enter the String value: ");
			String enterNum12 = scanner.next();
			conversionRef.stringToDouble(enterNum12);
			break;
		case 14:
			System.out.println("Enter the String value: ");
			String enterNum13 = scanner.next();
			conversionRef.stringToBoolean(enterNum13);
			break;
		}
		scanner.close();
	}

}
