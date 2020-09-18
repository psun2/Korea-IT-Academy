package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


class ASDFG implements Serializable{
	
	private static final long serialVersionUID = 1234L;
	
	String str;
	int aaa;
	public ASDFG(String str, int aaa) {
		super();
		this.str = str;
		this.aaa = aaa;
	}
	@Override
	public String toString() {
		return "ASDFG [str=" + str + ", aaa=" + aaa + "]";
	}
	
	
}

public class ObjectOutMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/qwe.zxc");
			ObjectOutputStream dos = new ObjectOutputStream(fos);
			
			dos.writeBoolean(true);
			dos.writeChar('a');
			dos.writeDouble(123.456);
			dos.writeInt(123);
			dos.writeFloat(789.654f);
			dos.writeLong(998877665544332211L);
			dos.writeUTF("¿ì¸®´Â ½´ÆÛ½´ÆÛ ½´ÆÛÀè");
			dos.writeUTF("¿©±â Âü³ª¹« ½£");
			dos.writeObject(new int[] {11,22,33,44});
			
			ArrayList arr = new ArrayList();
			arr.add(123);
			arr.add("assddg");
			arr.add(true);
			arr.add(123.456);
			arr.add(new String[] {"È«¼ºÇõ","±è¿¬Áö","µµ¸ÁÀÚ"});
			dos.writeObject(arr);
			dos.writeObject(new ASDFG("Àå¼öÇ³µ­ÀÌ", 98765));
			
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

