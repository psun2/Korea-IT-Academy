package io_p;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderMain {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("fff/bbb.txt");
			while(fis.available()>0) {
				System.out.print((char)fis.read());
			}
			fis.close();
			
			System.out.println("\n--------------------");
			
			FileReader fr = new FileReader("img/son_6.jpg");
			FileWriter fw = new FileWriter("dst/child_6.jpg");
			int data;
			while((data=fr.read())>=0) {
				System.out.print((char)data);
				fw.write(data);
			}
			
			
			fw.close();
			fis.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
