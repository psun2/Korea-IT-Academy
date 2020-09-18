package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyMain2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// fff/bbb.txt  --> dst/azsdf.txt บนป็ 
		
		String src = "fff/son_02.jpg", dst = "dst/child_02.jpg";
		
		FileReader fis = new FileReader(src);
		FileWriter fos = new FileWriter(dst);
		
		int data;
		while((data=fis.read())!=-1) {
			
			fos.write(data);
		}
		
		
		fos.close();
		fis.close();
	}

}
