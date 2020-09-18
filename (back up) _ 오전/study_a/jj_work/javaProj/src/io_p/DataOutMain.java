package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/ddd.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeByte(123);
		dos.writeChar('a');
		dos.writeShort(123456);
		dos.writeInt(789456);
		dos.writeLong(112233445566778899L);
		dos.writeFloat(123.456F);
		dos.writeDouble(123.456);
		dos.writeUTF("수퍼수퍼수퍼잭");
		//dos.writeObject();
		
		dos.close();
		fos.close();

	}

}
