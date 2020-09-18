package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInMian {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/eee.txt");
		ObjectInputStream dis = new ObjectInputStream(fis);
		
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		
		
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		ArrayList arr = (ArrayList)dis.readObject();
		
		System.out.println("-----------------------");
		for (Object obj : arr) {
			System.out.println(obj);
		}
		System.out.println("-----------------------");
		AAA a1= (AAA)dis.readObject();
		System.out.println(a1);
		dis.close();
		fis.close();


	}

}
