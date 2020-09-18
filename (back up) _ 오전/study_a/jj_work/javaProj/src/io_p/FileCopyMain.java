package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// fff/bbb.txt  --> dst/azsdf.txt บนป็ 
		
		String src = "fff/son_01.jpg", dst = "dst/child_01.jpg";
		
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dst);
		
		byte [] buf = new byte[1024];
		
		while(fis.available()>0) {
			int len = fis.read(buf);
			fos.write(buf, 0, len);
		}
		
		
		fos.close();
		fis.close();
	}

}
