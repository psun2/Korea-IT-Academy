package io_p;

import java.io.FileOutputStream;

public class FileOutMain {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("fff/aaa.txt");
			
			String str = "asdf ehjwrofkjefw efjoewfj wefjowej";
			str = "¿©±ä Âü³ª¹«½£\tÀå¼ö Ç³µ­ÀÌ¿Í\n»ç½¿ ¹ú·¹°¡ »ìÁö\n³·¿£ ¼û¾îÀÖ´Ù\t¹ã¿£ »ì±Ý»ì±Ý\n½Å³ª°Ô ³î·¯´Ù³à";
			byte [] arr = str.getBytes();
			
			fos.write(arr);
//			fos.write('a');
//			fos.write('s');
//			fos.write('d');
//			fos.write('f');
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
