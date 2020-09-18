package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteInOutMain {

	public static void main(String[] args) throws Exception {
		byte [] inArr = {3,4,66,1,-2,4,3,-5,-99,3,7};

		byte [] outArr;
		byte [] buf = new byte[5];
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//buf를 이용하여 최소 횟수로 받아오세요
		
		while(bis.available()>0) {
			System.out.println("세보자");
			int len = bis.read(buf);
			bos.write(buf,0, len);
			
		}
		
		outArr = bos.toByteArray();
		
		bos.close();
		bis.close();
		
		
		System.out.println(Arrays.toString(outArr));
	}

}
