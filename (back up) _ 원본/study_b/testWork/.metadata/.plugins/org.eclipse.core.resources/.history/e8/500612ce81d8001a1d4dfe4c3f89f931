package io_p;

import java.io.FileInputStream;
import java.util.Arrays;

public class FileInMain {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("fff/bbb.txt");
			
			
//			int data;
//			
//			while((data = fis.read())>=0) {
//			
//				System.out.print((char)data);
//			}
			
			byte [] buf = new byte[1024];
			
			while(fis.available()>0) {
				int len = fis.read(buf);
				//System.out.println(Arrays.toString(buf));
				System.out.print(new String(buf,0,len));
			}
			
			
			fis.close();
			
			
			/// fff/bbb.txt -> dst/qqq.txt บนป็
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

