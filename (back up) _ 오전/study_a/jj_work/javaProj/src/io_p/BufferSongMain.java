package io_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class BufferSongMain {

	public static void main(String[] args) throws Exception {
		///  파일 정보 

				/*
				 * 1- 노래제목
				 * 2- 장르   -  가요 / 와요 / 왜요 /
				 * 3- 가수
				 * 4- 가사
				 */
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("가요", "dst/song/gayo");
		map.put("와요", "dst/song/wayo");
		map.put("왜요", "dst/song/waeyo");
		
		for (int i = 0; i < 5; i++) {
			
			FileReader fr = new FileReader("fff/sss/bb_"+i+".txt");
			BufferedReader br = new BufferedReader(fr);
			String ttt = br.readLine();
			String genre = br.readLine();
			System.out.println(genre);
			
			FileWriter fw = new FileWriter(map.get(genre)+"/bb_"+i+".txt");
			fw.write(ttt+"\n");
			fw.write(genre+"\n");
			
			while((ttt=br.readLine())!=null) {
				fw.write(ttt+"\n");
			}
			
			fw.close();
			br.close();
			fr.close();
		}

	}

}
