package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("img/son_2.jpg");
			FileOutputStream fos = new FileOutputStream("dst/child_2.jpg");
			
			byte [] buf = new byte[20];
			
			while(fis.available()>0) {
				int len = fis.read(buf);
				System.out.print(new String(buf,0,len));
				fos.write(buf, 0, len);
				
			}
			

			
			fos.close();
			fis.close();
			
			
			/// fff/bbb.txt -> dst/qqq.txt บนป็
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
