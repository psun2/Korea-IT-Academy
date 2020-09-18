package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/ccc.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeBoolean(true);
			dos.writeChar('a');
			dos.writeDouble(123.456);
			dos.writeInt(123);
			dos.writeFloat(789.654f);
			dos.writeLong(998877665544332211L);
			dos.writeUTF("¿ì¸®´Â ½´ÆÛ½´ÆÛ ½´ÆÛÀè");
			dos.writeUTF("¿©±â Âü³ª¹« ½£");
			//dos.writeObject(new int[] {11,22,33,44});
			
			dos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
