package com.josh.training.javaprogram.program08;

import java.util.regex.*;

/**
 * Example for Regular Expressions
 */
public class RegularExpression {
	public static void main(String[] args) {
		String text = "Hi Josh Software, How is the Josh";
		String word = "Josh";
		/*
		 * Using Pattern.compile method to match a text against a regular expression
		 * pattern multiple times
		 */
		Pattern pattern = Pattern.compile(word);
		/*
		 * Using pattern.matcher method to search for the data
		 */
		Matcher matches = pattern.matcher(text);
		/*
		 * find method is used for searches the occurrence of the regular expression in
		 * text variable start method and end method is used for getting the start and
		 * end indexes of a match that is being found using find() method
		 */
		while (matches.find()) {
			System.out.println("Josh is found at index beteween " + matches.start() + "-" + matches.end());
		}
		/*
		 * \\s is meta character or predefined character here \\s is used for indicates
		 * a white space character
		 */
		text = text.replaceAll("\\s", "_");
		System.out.println("\n Removing white spaces from text string \n" + text);

	}

}
