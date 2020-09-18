package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

class AAA implements Serializable{
	String name = "Á¤¿ì¼º";
	int [] jum = {76,77,78};
	int tot, avg, rank;
	@Override
	public String toString() {
		return "AAA [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", rank="
				+ rank + "]";
	}
	
	
}


public class ObjectOutMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/eee.txt");
		ObjectOutputStream dos = new ObjectOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeByte(123);
		dos.writeChar('a');
		dos.writeShort(123456);
		dos.writeInt(789456);
		dos.writeLong(112233445566778899L);
		dos.writeFloat(123.456F);
		dos.writeDouble(123.456);
		dos.writeUTF("¼öÆÛ¼öÆÛ¼öÆÛÀè");
		
		ArrayList arr = new ArrayList();
		arr.add(123);
		arr.add("ÄíÇÛÇÛ");
		arr.add(true);
		arr.add(new int[] {11,22,33});
		arr.add(new ArrayList());
		arr.add(123.456);
		
		dos.writeObject(arr);
		dos.writeObject(new AAA());
		
		dos.close();
		fos.close();

	}

}
