package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/qwe.zxc");
			ObjectInputStream dis = new ObjectInputStream(fis);
			
			
			
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
			int [] arr = (int [])dis.readObject();
			System.out.println(Arrays.toString(arr));
			System.out.println(dis.readObject());
			System.out.println(dis.readObject());
			dis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
