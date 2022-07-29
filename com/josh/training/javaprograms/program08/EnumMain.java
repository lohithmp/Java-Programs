package com.josh.training.javaprograms.program08;

/**
 * Calling the initialized group of constants using "EnumMain"
 */
public class EnumMain {
	public static void main(String[] args) {
		System.out.println("Here is the names of Team Hustler\n");
		NamingEnum nenum = NamingEnum.Anirudh;
		System.out.println("Anirudh " + nenum.getInitialLetter());
		NamingEnum nenum1 = NamingEnum.Harshitha;
		System.out.println("Harshitha " + nenum1.getInitialLetter());
		NamingEnum nenum2 = NamingEnum.Karthik;
		System.out.println("Karthik " + nenum2.getInitialLetter());
		NamingEnum nenum3 = NamingEnum.lohith;
		System.out.println("Lohith " + nenum3.getInitialLetter());

	}

}
/*
 * OUTPUT: Here is the names of Team Hustler
 * 
 * Anirudh A N Harshitha M N Karthik S Lohith M P
 * 
 */
