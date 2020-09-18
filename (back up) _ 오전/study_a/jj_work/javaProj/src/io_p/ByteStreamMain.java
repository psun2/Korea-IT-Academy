package io_p;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) throws Exception {

		byte [] inArr = {3,4,66,1,-2,4,3,-5,-99,3,7};
		
		int data;
		System.out.println("1차 >>>>");
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr);
		//bis.available() : steam에 남아 있는 데이터 갯수
		data = bis.read();
		System.out.println(data+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println(bis.read()+":"+bis.available());
		System.out.println("------------------------");
		System.out.println(bis.read()+":"+bis.available());///stream에 보낼 데이타가 없을때 read 요청시 : -1
		System.out.println(bis.read()+":"+bis.available());
		bis.close();
		
		System.out.println("2차 >>>>");
		bis = new ByteArrayInputStream(inArr);
		
		while(bis.available()>0) {
			System.out.print((byte)bis.read()+",");
		}
		
		bis.close();
		
		
		System.out.println("\n\n3차 >>>>");
		bis = new ByteArrayInputStream(inArr);
		
		byte [] buf = new byte[5];
		
		//int cnt = bis.read(buf);		
		
		int cnt = bis.read(buf,1,3 );
		//가져온 갯수 =      buf,  buf의 시작위치, stream에서 가져올 갯수()
		System.out.println(cnt+":"+Arrays.toString(buf));
		
		cnt = bis.read(buf,2,3 );  //steam 데이터는 꺼낸 다음 순서로 순차대로 가져옴
		//가져온 갯수 =  buf,  buf의 시작위치, stream에서 가져올 갯수()
		System.out.println(cnt+":"+Arrays.toString(buf));
		
		bis.close();
		
		
		
		

	}

}
