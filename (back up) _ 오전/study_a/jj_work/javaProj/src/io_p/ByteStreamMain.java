package io_p;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) throws Exception {

		byte [] inArr = {3,4,66,1,-2,4,3,-5,-99,3,7};
		
		int data;
		System.out.println("1�� >>>>");
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr);
		//bis.available() : steam�� ���� �ִ� ������ ����
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
		System.out.println(bis.read()+":"+bis.available());///stream�� ���� ����Ÿ�� ������ read ��û�� : -1
		System.out.println(bis.read()+":"+bis.available());
		bis.close();
		
		System.out.println("2�� >>>>");
		bis = new ByteArrayInputStream(inArr);
		
		while(bis.available()>0) {
			System.out.print((byte)bis.read()+",");
		}
		
		bis.close();
		
		
		System.out.println("\n\n3�� >>>>");
		bis = new ByteArrayInputStream(inArr);
		
		byte [] buf = new byte[5];
		
		//int cnt = bis.read(buf);		
		
		int cnt = bis.read(buf,1,3 );
		//������ ���� =      buf,  buf�� ������ġ, stream���� ������ ����()
		System.out.println(cnt+":"+Arrays.toString(buf));
		
		cnt = bis.read(buf,2,3 );  //steam �����ʹ� ���� ���� ������ ������� ������
		//������ ���� =  buf,  buf�� ������ġ, stream���� ������ ����()
		System.out.println(cnt+":"+Arrays.toString(buf));
		
		bis.close();
		
		
		
		

	}

}
