package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/ccc.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			//System.out.println(dis.readObject());
			
			dis.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
