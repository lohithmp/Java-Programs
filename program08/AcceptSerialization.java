package com.josh.training.javaprograms.program08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 *  AcceptSerialization class is for getting employee details of using Deserialization 
 */
public class AcceptSerialization {
	public static void main(String[] args) {
		Serialization s = null;
		try {
			/*
			 * FileInputStream obtains input bytes from a file in a file system
			 */
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\Admin\\eclipse-workspace\\lohitSerialize\\serializeation.txt");
			ObjectInputStream os = new ObjectInputStream(fs);
			/*
			 * Reading the members of supertype class by using readObject method from
			 * ObjectInputStream
			 */
			s = (Serialization) os.readObject();
			os.close();
			fs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Serialization not found");
			e.printStackTrace();

		}
		System.out.println("Name of the employee is  " + s.getEmpName());
		System.out.println("Age of the employee is " + s.getEmpAge());
		System.out.println("Designation of the employee is " + s.getEmpDesignation());
		System.out.println("Employee Id is " + s.getEmpId());
		System.out.println("Address of the employee is " + s.getEmpAddress());

	}
}

/*
 * OUTPUT: Name of the employee is Revan Age of the employee is 0 Designation of
 * the employee is Engineer Employee Id is 111 Address of the employee is null
 */
