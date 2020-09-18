package io_p;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("1차 >>>>>>>>>>>>");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(123);
		bos.write(-48);
		bos.write(7);
		bos.write(254);
		bos.write(128);
		bos.write(0);
		
		byte [] outArr = bos.toByteArray();
		
		System.out.println(Arrays.toString(outArr));
		
		bos.close();
		
		
		System.out.println("2차 >>>>>>>>>>>>");
		
		byte [] arr1 = {11,22,33,44,55,66,77};
		byte [] arr2 = {12,23,34,45,56,67,78,89};
		bos = new ByteArrayOutputStream();
		//bos.write(arr1);
		bos.write(arr1,3,2); //44,55
		//     arr의 3 번째부터 2개
		bos.write(arr1,2,4);//33,44,55,66
		bos.write(arr2,4,3);//56,67,78
		bos.write(arr2,1,2);//23,34
		
		outArr = bos.toByteArray();
		
		System.out.println(Arrays.toString(outArr));
		
		bos.close();

	}

}

