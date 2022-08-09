package com.josh.training.javaprograms.program13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Using BufferedWriter and BufferedReader to append the file
 * and here deleting the exist file. 
 */
public class AppendDemo {
	public static void main(String[] args) throws IOException {
		try {
			// BufferedWriter is used to provide buffering for Writer instances.
			// FileWrite is used write characters into the file.
			/*
			 * .write() method is used writes text to a character-output stream.
			 * .delete() method is used to delete the specific file.
			 */
			FileWriter filewrite = new FileWriter("D:\\FileDemo\\append.txt", true);
			File fileDelete = new File("D:\\FileDemo\\deleting.txt");
			BufferedWriter bw = new BufferedWriter(filewrite);
			bw.write("\nLine is there");
			bw.write("\nAppended");
			bw.close();
			if (fileDelete.delete()) {
				System.out.println("file is deleted");
			} else {
				System.out.println("file not deleted");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// BufferedReader class is used to read the text from a character-based input stream
		BufferedReader bufferRead = new BufferedReader(new FileReader("D:\\FileDemo\\append.txt"));
		System.out.println(bufferRead.readLine());
		String reading = null;
		while ((reading = bufferRead.readLine()) != null) {
			System.out.println(reading);
		}
	}
}
