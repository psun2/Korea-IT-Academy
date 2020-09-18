package io_p;

import java.io.FileInputStream;

public class FileInputMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/song.txt");

//		while(fis.available()>0) {
//			System.out.print((char)fis.read());
//		}
		
//		byte [] buf = new byte[10];
//		while(fis.available()>0) {
//			int len = fis.read(buf);
//			System.out.print(new String(buf, 0, len));
//		}
		
		byte [] buf = new byte[fis.available()];
		fis.read(buf);
		System.out.print(new String(buf));
		fis.close();
	}

}
