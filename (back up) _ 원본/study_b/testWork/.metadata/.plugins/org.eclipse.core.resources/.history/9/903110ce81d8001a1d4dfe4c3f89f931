package io_p;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileMain {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		File ff = new File("fff\\aaa.txt");
		
		System.out.println(ff.exists());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		System.out.println(ff.isAbsolute());
		System.out.println(ff.isHidden());
		System.out.println(ff.getParent());
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.getName());
		System.out.println(ff.getPath());
		System.out.println(ff.canExecute());
		System.out.println(ff.canWrite());
		System.out.println(ff.length());
		System.out.println(sdf.format(ff.lastModified()));
		
		System.out.println("----------------------");
		
		ff = new File("img");
		File [] arr = ff.listFiles();
		
		for (File file : arr) {
			System.out.println(file.getPath());
		}
		//삭제
		new File("fff/ddd.txt").delete();
		
		//이동
		new File("fff/ccc.txt").renameTo(new File("dst/rrr.txt"));
		
		new File("zzz").mkdir();
		
		new File("xxx/nnn").mkdirs();
		
		try {
			new File("xxx/nnn/erty.txt").createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
