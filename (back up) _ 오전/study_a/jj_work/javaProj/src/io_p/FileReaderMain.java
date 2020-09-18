package io_p;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("fff/song.txt");

		int data;
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
		}
		
		fr.close();
		
		System.out.println("\n-----------------");
		
		FileInputStream fis = new FileInputStream("fff/song.txt");

		
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		
		fis.close();
	}

}
