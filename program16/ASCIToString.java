package com.josh.training.javaprograms.program16;

import java.io.PrintWriter;
import java.io.StringWriter;

/*
 * Converting ASCI number to Characters.
 */
public class ASCIToString {
	public static void main(String[] args) {
		System.out.println("  ASCI value to character conversion:  \n");
		int array[] = { 19, 54, 89, 65 };
		String num = "12 ,45,78,89,56,23";
		String character = null;
		/*
		 * Character.toSTring() method is converting Number to character.
		 */
		for (int number : array) {
			character = Character.toString((char) number);
			System.out.println(character);
		}
		/*
		 * StringWriter is used to write the portion of string.
		 */
		System.out.println("   Adding two String:  ");
		StringWriter writer = new StringWriter();
		/*
		 * . append() method is used to adding Strings.
		 */
		writer.append("Josh ");
		writer.append("Software");
		System.out.println("Adding both string :" + writer);
		/*
		 * split() method is used to remove required elements.
		 */
		System.out.println("\n   Deleted coma in the given array: ");
		String str[] = num.split(",");
		for (String s : str) {
			System.out.println(s + " ");
		}
		System.out.println("\n  StackTrace  description:\n ");
		try {
			int n = 52 / 0;
			System.out.println(n);
		} catch (Exception e) {
			StringWriter writers = new StringWriter();
			PrintWriter print = new PrintWriter(writers);
			/*
			 * e.printStacktrace() method give description of exception and a tool used to
			 * handle exceptions and errors. convert it into string by using toString()
			 * method.
			 */
			e.printStackTrace(print);
			String stacktrace = writers.toString();
			System.out.println(stacktrace);
		}
		
	}
}
