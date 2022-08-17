package com.josh.training.javaprograms.program16;
/*
 * Conversions using respective methods.
 */
public class Conversion {
	public static void main(String[] args) {
		/*
		 * Using .parseInt(binary,2) method is converting decimal to  binary number.
		 */
		String binaryNumber="1001";
		int decimalNumber=Integer.parseInt(binaryNumber, 2);
		System.out.println("Binary to Decimal number conversion of "+binaryNumber+" is "+decimalNumber);
		/*
		 * Using .toOctalString() method is converting decimal to  Octal number.
		 */
		String octalNumber=Integer.toOctalString(decimalNumber);
		System.out.println("Binary to Octal number conversion of "+binaryNumber+" is "+octalNumber);
		/*
		 * Using .toBinaryString() method is converting decimal to  binary number.
		 */
		String binary=Integer.toBinaryString(decimalNumber);
		System.out.println("Decimal to Binary number conversion of "+decimalNumber+" is "+binary);
		/*
		 * Using .toHexString() method is converting decimal to  hexadecimal number.
		 */
		String hexadecimal=Integer.toHexString(15);
		System.out.println("Decimal to Hexadecimal number conversion of "+decimalNumber+" is "+hexadecimal);
		/*
		 * Using .parseInt(hexadecimal,16) method is converting hexadecimal to  decimal number.
		 */
		int decimal=Integer.parseInt(hexadecimal,16);
		System.out.println("Hexadecimal to Decimal number conversion of "+hexadecimal+" is "+decimal);
		/*
		 * Using .toOctalString() method is converting decimal to  octal number.
		 */
		String octal=Integer.toOctalString(decimal);
		System.out.println("Decimal to Octal number conversion of "+decimal+" is "+octal);
		/*
		 * Using .parseInt(octal,8) method is converting octal to  decimal number.
		 */
		int octalToDecimal=Integer.parseInt(octal,8);
		System.out.println("Octal to Decimal number conversion of "+octal+" is "+octalToDecimal);
	}
}
