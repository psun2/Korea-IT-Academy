package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutMain {

	public static void main(String[] args) {
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			bos.write(12);
			bos.write(24);
			bos.write(56);
			bos.write(12);
			bos.write(100);
			bos.write(12);
			bos.write(126);
			bos.write(128);
			bos.write(254);
			bos.write(255);
			bos.write(256);
			
			byte [] arr = bos.toByteArray();
			
			bos.close();
			
			System.out.println(Arrays.toString(arr));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
