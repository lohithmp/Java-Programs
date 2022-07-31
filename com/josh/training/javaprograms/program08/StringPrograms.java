package com.josh.training.javaprogram.program08;

/**
 * String based programs using String, StringBuffer and StringBuilder
 */
public class StringPrograms {
	public static void concat1(String s1) {
		s1 = s1 + "Software";
	}

	/*
	 * Concatenates to StringBuilder
	 */
	public static void concat2(StringBuilder s2) {
		/*
		 * append using for Concatenate to the current strings
		 */
		s2.append(" Software");
	}

	/*
	 * Concatenates to StringBuffer
	 */
	public static void concat3(StringBuffer s3) {
		s3.append(" Software");
	}

	public static void main(String[] args) {
		// Custom input string
		String s1 = "Josh";

		/*
		 * Calling above defined concat1 method
		 */
		concat1(s1);

		/*
		 * s1 is not changed because String is immutable
		 */
		System.out.println("String: " + s1);
		StringBuilder s2 = new StringBuilder("Josh");

		/*
		 * Calling above defined concat2 method
		 */
		concat2(s2);
		System.out.println("StringBuilder: " + s2);

		StringBuffer s3 = new StringBuffer("Josh");

		/*
		 * Calling above defined concat3 method
		 */
		concat3(s3);
		System.out.println("StringBuffer: " + s3);
		/*
		 * Conversion of StringBuffer to string
		 */
		String string1 = s3.toString();
		System.out.println("Converting StringBuffer to string: " + string1);
		/*
		 * Conversion of StringBuilder to string
		 */
		String string2 = s2.toString();
		System.out.println("Converting StringBuilder to string: " + string2);
		/*
		 * Conversion of String to StringBuffer
		 */
		StringBuffer stringbufferObj = new StringBuffer(s1);
		System.out.println("Coverting String to StringBuffer: " + stringbufferObj);
		/*
		 * Conversion of String to StringBuilder
		 */
		StringBuilder stringbuilderObj = new StringBuilder(s1);
		System.out.println("Coverting String to StringBuilder: " + stringbuilderObj);
		/*
		 * Conversion of StringBuffer to StringBuilder and vice-versa
		 */
		String str = stringbufferObj.toString();
		StringBuilder stringbuffertobuilderObj = new StringBuilder(str);
		System.out.println("Converting StringBuffer to StringBuilder: " + stringbuffertobuilderObj);
	}

}
