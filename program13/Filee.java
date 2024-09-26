package com.josh.training.javaprograms.program13;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
 * Creating file 
 */
public class Filee {
	public static void main(String[] args) {
		// Here created file object and given file path
		File file = new File(
				"D:\\FileDemo\\createFilee.txt");
		try {
			/*
			 * CreateNewFile() method creates empty file
			 */
			boolean istrue = file.createNewFile();
			if (istrue) {
				System.out.println("File created succesfully");
			} else {
				System.out.println("file not created");
			}
			/*
			 * .canWrite() method gives access to user for write only
			 */
			if(file.canWrite()) {
				System.out.println("Successfully converted file to write only format");
			}
			else {
				System.out.println("file not converted to write only format");
			}
			//SimpleDateFormat is used to both parse and format dates according to a formatting pattern we specify.
			/*
			 * .lastModified() method is return time
			 */
			SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:MM:SS");
			System.out.println(sdf.format(file.lastModified()));
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
