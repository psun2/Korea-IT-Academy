package io_p;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		String str="ehfuiewhfowe weh 123456789 \n���ۼ��ۼ����� �Ŀ��Ŀ� �Ŀ��� �Ǵ���� ��Ÿ����";

		
		FileWriter fos = new FileWriter("fff/ccc.txt");
		
		for (char ch : str.toCharArray()) {
			fos.write(ch);
		}
		

		
		fos.close();

	}

}
