package com.josh.training.javaprograms.program08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Data is annotation for generates getters for all fields
 * @AllArgsConstructor annotation generates a constructor with one parameter for
 *                     every field in Serialization class
 */
@Data
@AllArgsConstructor
/**
 * Serialization class is for set employee details of object convert into byte
 * stream using Serialization
 */
public class Serialization implements java.io.Serializable {
	private String empName;
	private int empId;
	private String empDesignation;
	private transient String empAddress;
	private transient int empAge;

	public static void main(String[] args) {
		Serialization serialize = new Serialization("Revan", 111, "Engineer", "Mysore", 23);
		try {
			FileOutputStream fs = new FileOutputStream(
					"C:\\Users\\Admin\\eclipse-workspace\\lohitSerialize\\serializeation.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(serialize);
			os.close();
			fs.close();
			System.out.println("Serialization done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/*
 * OUTPUT: Serialization done
 */