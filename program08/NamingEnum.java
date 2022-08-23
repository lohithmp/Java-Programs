package com.josh.training.javaprograms.program08;

/**
 * An enum is a special "class" that represents a group of constants
 * "NamingEnum" is a class that implements enum keyword
 */
public enum NamingEnum {
	lohith("M P"), Karthik("S"), Anirudh("A N"), Harshitha("M N");

	public String initialLetter;

	NamingEnum(String letter) {
		this.initialLetter = letter;
	}

	public String getInitialLetter() {
		return this.initialLetter;
	}
}
