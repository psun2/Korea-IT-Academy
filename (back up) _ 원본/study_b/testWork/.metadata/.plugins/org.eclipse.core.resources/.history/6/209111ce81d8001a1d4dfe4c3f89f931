package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) {
		

		try {
			byte [] arr = {1,3,5,7,9,10,20,30,40,127,-128,-127,-126,-2,-1,0};
			
			ByteArrayInputStream bis = new ByteArrayInputStream(arr);
			
			System.out.println(arr.length);
			System.out.println(bis.available());
			
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
//			System.out.println(bis.read()+":"+bis.available());
			
			
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			
			while(bis.available()>0) {
				int data = bis.read();
				System.out.println((byte)data);
				bos.write(data);
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
