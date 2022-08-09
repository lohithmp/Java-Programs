package com.josh.training.javaprograms.program13;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;
/*
 * Here we see coping the file, Compressing file into Gzip file and Hiding the file.
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\\\FileDemo\\\\Readnwrite.txt");
		File fileCopy = new File("D:\\FileDemo\\Copyfilee.txt");
		File fileHide = new File("D:\\\\FileDemo\\\\hde.txt");
		/*
		 * Files.copy() method is used to copy file from one path to another.
		 */
		Files.copy(file.toPath(), fileCopy.toPath());
		// BufferedReader class is used to read the text from a character-based input stream
		//FileReader class is used to read data from the file.
		BufferedReader br = new BufferedReader(new FileReader("D:\\FileDemo\\Copyfilee.txt"));
		String readCopy = null;
		while ((readCopy = br.readLine()) != null) {
			System.out.println(readCopy);
		}
		br.close();
		//Path is the particular location of an entity 
		/*
		 * paths.get() method is retrieve the path of the given file
		 * and convert it into object using Path interface
		 */
		Path place = Paths.get("D:\\FileDemo\\Copyfilee.txt");
		Path zipPath = Paths.get("D:\\FileDemo\\Copyfilee.txt.gz");
		/*
		 * .notExists() method is used to check file is exist.
		 */
		if (Files.notExists(place)) {
			System.out.println("File not present");
			return;
		}
		/*
		 * .setReadonly() method give access to read only
		 */
		boolean flag = fileCopy.setReadOnly();
		if (flag == true) {
			System.out.println("File coverted to read only format successfully");
		} else {
			System.out.println("File not converted to read only");
		}
		/*
		 * .isHidden() method is used to check the file is hide.
		 */
		if (fileHide.isHidden()) {
			System.out.println("file successfully is hidden");
		} else {
			System.out.println("file is not hidden");
		}
		//SimpleDateFormat is used to both parse and format dates according to a formatting pattern we specify.
		/*
		 * .lastModified() method is return time
		 */
		SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy HH-MM a");
		System.out.println(sd.format(fileCopy.lastModified()));
		/*
		 * calling compressGzip() method  within the class
		 */
		CopyFile.compressGzip(place, zipPath);
	}
	/*
	 * compressGzip method is customized method to Compress file to Gzip file format.
	 */
	private static void compressGzip(Path place, Path zipPath) {
		try {
			//GZIPOutputStream class implements a stream filter for writing compressed data in the GZIP file format.
			GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream(zipPath.toFile()));
			//FileInputStream is used for reading byte-oriented data
			FileInputStream fis = new FileInputStream(zipPath.toFile());
			//
			byte[] b = new byte[1024];
			int length;
			while ((length = fis.read(b)) > 0) {
				gos.write(b, 0, length);
				System.out.println(length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
