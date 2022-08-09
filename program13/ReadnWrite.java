package com.josh.training.javaprograms.program13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Creating file including write and read the file
 */
public class ReadnWrite {
	public static void main(String[] args) throws IOException {
		try {
			// BufferedWriter is used to provide buffering for Writer instances.
			// FileWrite is used write characters into the file.
			/*
			 * .write() method is used writes text to a character-output stream
			 */
			try (BufferedWriter bufferWrite = new BufferedWriter(new FileWriter("D:\\FileDemo\\Readnwrite.txt"))) {
				bufferWrite.write("Good Morning");
				bufferWrite.write("\n GoodNight Sweet Dreams");
				bufferWrite.close();
			}
			// BufferedReader class is used to read the text from a character-based input stream
			try (BufferedReader bufferRead = new BufferedReader(new FileReader("D:\\FileDemo\\Readnwrite.txt"))) {
				System.out.println(bufferRead.readLine());
				String reading = null;
				while ((reading = bufferRead.readLine()) != null) {
					System.out.println(reading);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
