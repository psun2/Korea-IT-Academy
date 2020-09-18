package io_p;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutMain {

	public static void main(String[] args) throws IOException {

		
		
		String str="ehfuiewhfowe weh 123456789 \n수퍼수퍼수퍼잭 파워파워 파워잭 악당들이 나타나믄";

		
		FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
		
//		for (char ch : str.toCharArray()) {
//			fos.write(ch);
//		}
		
		byte [] buf = str.getBytes();
		fos.write(buf);
		
		fos.close();
	}

}
