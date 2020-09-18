package io_p;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File ff = new File("D:\\lee\\public\\study_a\\jj_work\\javaProj\\fff\\aaa.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(ff.exists());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		System.out.println(ff.isAbsolute());
		System.out.println(ff.isAbsolute());
		System.out.println(new File("fff/ccc.txt").isHidden());
		System.out.println(new File("fff/exam.txt").isHidden());
		System.out.println(new File("fff/exam.txt").canExecute());
		System.out.println(new File("fff/exam.txt").canRead());
		System.out.println(new File("fff/exam.txt").canWrite());
		System.out.println(new File("fff/exam.txt").length());
		System.out.println(new File("fff/exam.txt").getParent());
		System.out.println(new File("fff/exam.txt").getAbsolutePath());
		System.out.println(new File("fff/exam.txt").getName());
		System.out.println(new File("fff/exam.txt").getPath());
		System.out.println(sdf.format(ff.lastModified()));
		
		System.out.println("list ---------------------------");
		File ddd = new File("fff");
		File [] arr = ddd.listFiles();
		
		for (File f : arr) {
			String ext = f.getName().substring(f.getName().lastIndexOf(".")+1);
			System.out.println(f.getName()+"\t"+f.isFile()+"\t"+ext);
			
		}
		
		System.out.println("list ---------------------------");
		new File("dst/qwer.txt").delete();
		new File("dst/zxcv.txt").createNewFile();
		new File("dst/child_01.jpg").renameTo(new File("dst/song/first.jpg"));
		
		
		new File("fff/uuu").mkdir();
		//new File("fff/ttt/ggg").mkdir();
		new File("fff/ttt/ggg").mkdirs();
		new File("fff/ttt/kkk").mkdirs();
		new File("fff/ttt/kkk").delete();
	}

}


