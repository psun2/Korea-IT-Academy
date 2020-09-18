package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufOutMain {

	public static void main(String[] args) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			byte [] arr1 = {11,12,13,14,15,16,17,18,19};
			byte [] arr2 = {21,22,23,24,25,26,27,28,29};
			byte [] arr3 = {31,32,33,34,35,36,37,38,39};
			
			
			
			bos.write(arr1,2,5);  //arr1, 2번째부터, 5개
			bos.write(arr2,7,2);  //arr2, 7번째부터, 2개
			bos.write(arr3);
			
			byte [] newArr = bos.toByteArray();
			System.out.println(Arrays.toString(newArr));
			
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


