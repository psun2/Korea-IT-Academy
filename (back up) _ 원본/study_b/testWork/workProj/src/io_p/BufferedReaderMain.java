package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class BangTan{
	String name;
	int [] jum = new int[3];
	int tot, avg;
	public BangTan(String line) {
		String [] arr = line.split(",");
		name = arr[0];
		
		tot = 0;
		for (int i = 1; i <4; i++) {
			jum[i-1] = Integer.parseInt(arr[i]);
			tot+= jum[i-1];
		}
		
		avg = tot/jum.length;
		
	}
	@Override
	public String toString() {
		
		
		String ttt = name + ",";
		
		for (int i : jum) {
			ttt+= i+",";
		}
		ttt+= tot + "," + avg+"\n";
		
		return ttt;
	}
	
	
	
	
}

public class BufferedReaderMain {

	public static void main(String[] args) {
		
		try {
			
			ArrayList<BangTan>bt = new ArrayList<BangTan>();
			
			FileReader fr = new FileReader("fff/exam.csv");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			int i = 0;
			while((line=br.readLine())!=null) {
				//System.out.println(i+":"+line);
				if(i>0) {
					
					bt.add(new BangTan(line));
				}
				i++;
			}
			
			br.close();
			fr.close();
			
			
			FileWriter fw = new FileWriter("dst/eee.csv");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (BangTan bangTan : bt) {
				bw.write(bangTan.toString());
			}
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
