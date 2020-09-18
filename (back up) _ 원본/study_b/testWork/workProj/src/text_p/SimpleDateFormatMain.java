package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws Exception {
		Date today = new Date();
		
		String [] ppArr = {
				"y","yy","yyyy",
				"M","MM","MMM","MMMM",
				"d","dd",
				"E","EEEE","F",
				"z","Z",
				"w","ww","W","WW",
				
				"a","H","HH","h","hh",
				"m","mm",
				"s","ss",
				"S","SSS"
				
		
		
		};

		SimpleDateFormat sdf ;
		
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp, new Locale("ko"));
			System.out.println(pp+":"+sdf.format(today));
		}
		
		
		//'89“¥  nov 28¿œ (»≠) 05:07:30 
		
		String ttt = new SimpleDateFormat("''yy“¥ MMM dd¿œ (", new Locale("en")).format(today);
		ttt += new SimpleDateFormat("E) HH:mm:ss").format(today);
		System.out.println(ttt);
		
		sdf = new SimpleDateFormat("yyyyMMdd");
		today = sdf.parse("20131013");
		today = sdf.parse("20133099");
		System.out.println(today);
		
		
		
	}

}
