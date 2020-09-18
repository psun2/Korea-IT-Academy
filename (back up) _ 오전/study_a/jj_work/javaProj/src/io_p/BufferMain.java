package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("fff/exam.txt");

		int data;
		int cnt = 0;
		while((data=fr.read())!=-1) {
			cnt++;
			System.out.print((char)data);
		}
		
		System.out.println("\n\n:"+cnt);
		
		fr.close();
		
		System.out.println("---------------------------");
		
		fr = new FileReader("fff/exam.txt");

		BufferedReader br = new BufferedReader(fr);
		
		cnt = 0;
		String line;
		
		while((line=br.readLine())!=null) {
			cnt++;
			System.out.println(cnt+":"+line);
		}
		
		System.out.println("\n\n:"+cnt);
		
		br.close();
		fr.close();
	
		///  파일 정보 

		/*
		 * 1- 노래제목
		 * 2- 장르   -  가요 / 와요 / 왜요 /
		 * 3- 가수
		 * 4- 가사
		 */
		
		
		
	}

}
