package text_p;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class JuminDiaryMain {

	public static void main(String[] args) throws Exception {
		
		String jumin = "200620-1234567";
		
		String ym = jumin.substring(0,4);
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMd");
		SimpleDateFormat ww = new SimpleDateFormat("E");
		DecimalFormat df = new DecimalFormat("00");
		
		int last = (int)(long)df.parse(
				new SimpleDateFormat("d").format(
				sdf.parse(jumin.substring(0,2)+
				df.format(((long)df.parse(jumin.substring(2,4))+1))+"0"	)));
		
		String week = "일월화수목금토";
		
		for (char ch : week.toCharArray()) {
			System.out.print(ch+"\t");
		}
		System.out.println("\n---------------------------------------------------");
		
		for (int i = 0; i <week.indexOf(ww.format(sdf.parse(ym+1))); i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <=last; i++) {
			System.out.print(i+"\t");
			
			if(ww.format(sdf.parse(ym+i)).equals("토")) {
				System.out.println();
			}
			
		}
	}

}
