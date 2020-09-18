package io_p;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		String str="ehfuiewhfowe weh 123456789 \n수퍼수퍼수퍼잭 파워파워 파워잭 악당들이 나타나믄";

		
		FileWriter fos = new FileWriter("fff/ccc.txt");
		
		for (char ch : str.toCharArray()) {
			fos.write(ch);
		}
		

		
		fos.close();

	}

}
