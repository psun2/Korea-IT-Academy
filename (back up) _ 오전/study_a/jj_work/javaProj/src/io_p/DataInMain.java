package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/ddd.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		
		System.out.println(dis.readFloat());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		
		dis.close();
		fis.close();

	}

}
