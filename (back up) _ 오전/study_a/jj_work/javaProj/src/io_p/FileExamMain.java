package io_p;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
class FFStud{
	String name;
	ArrayList<Integer> jum;
	int tot, avg, rank;
	public FFStud(String str) {
		super();
		String [] arr = str.trim().split("_");
		this.name = arr[0];
		
		jum = new ArrayList<Integer>();
		
		for (String ss : arr[1].split(",")) {
			jum.add(Integer.parseInt(ss));
		}
		
		calc();
	}
	
	void calc() {
		tot = 0;
		for (Integer i : jum) {
			tot += i;
		}
		avg = tot/jum.size();
	}
	
	void rankCalc(ArrayList<FFStud> studs) {
		rank = 1;
		for (FFStud ffStud : studs) {
			if(avg < ffStud.avg)
				rank++;
		}
	}

	@Override
	public String toString() {
		String res = name + ",";
		
		for (Integer i : jum) {
			res += i+",";
		}
		
		res += tot + "," + avg + "," + rank+"\n";
		return res;
	}
	
	
	
}
public class FileExamMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("fff/exam.txt");
		
		int data;
		String ttt ="";
		while((data=fr.read())!=-1) {
			ttt+=(char)data;
		}
		//System.out.println(ttt);
		
		ArrayList<FFStud> studs = new ArrayList<FFStud>();
		for (String string : ttt.split("\n")) {
			studs.add(new FFStud(string));
		}
		
		for (FFStud ffStud : studs) {
			ffStud.rankCalc(studs);
			//System.out.println(ffStud);
		}
		fr.close();
		FileWriter fw = new FileWriter("fff/examRes.csv");
		for (FFStud ffStud : studs) {			
			fw.write(ffStud+"");
		}
		
		fw.close();
	}

}
