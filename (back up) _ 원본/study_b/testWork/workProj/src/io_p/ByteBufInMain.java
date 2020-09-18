package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufInMain {

	public static void main(String[] args) {
		
		try {
			byte [] arr = {1,3,5,7,9,10,20,30,40,127,-128,-127,-126,-2,-1,0};
			
			byte [] buf = new byte[10];
			
			ByteArrayInputStream bis = new ByteArrayInputStream(arr);
			
			System.out.println("bis.available() _1 :"+bis.available());
			
			//int cnt = bis.read(buf);
			int cnt = bis.read(buf, 3,6);
			///buf ���� ������ġ: 3, �����ͼ� ���� ���� : 5
			
			
			System.out.println("cnt:"+cnt);
			System.out.println("bis.available() _2 :"+bis.available());
			System.out.println("buf:"+Arrays.toString(buf));
			
			
			
			cnt = bis.read(buf, 1,6);
			
			System.out.println("cnt:"+cnt);
			System.out.println("bis.available() _3 :"+bis.available());
			System.out.println("buf:"+Arrays.toString(buf));
			
			cnt = bis.read(buf, 1,6);
			
			System.out.println("cnt:"+cnt);
			System.out.println("bis.available() _4 :"+bis.available());
			System.out.println("buf:"+Arrays.toString(buf));
			
			
			
			bis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
