package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufMain {

	public static void main(String[] args) {
		
		
		try {
			
			byte [] arr = {1,3,5,7,9,10,20,30,40,127,-128,-127,-126,-2,-1,0};
			
			byte [] buf = new byte[3];
			
			
			ByteArrayInputStream bis = new ByteArrayInputStream(arr);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			
			while(bis.available()>0) {
				System.out.println("ÀÐ¾î¿ä");
				int len = bis.read(buf);
				bos.write(buf,0,len);
				
			}
			
			
			byte [] newArr = bos.toByteArray();
			
			bos.close();
			bis.close();
			
			System.out.println(Arrays.toString(newArr));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
