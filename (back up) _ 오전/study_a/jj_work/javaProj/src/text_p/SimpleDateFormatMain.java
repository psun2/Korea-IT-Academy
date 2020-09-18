package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws Exception {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm:ss");
		System.out.println(sdf.format(now));
		
		String [] ppArr = {
				"y","yy","yyyy",
				"M","MM","MMM","MMMM",
				"d","dd","D","DD",
				"w","ww","W","WW",
				"E","EEEE","F","z","Z",
				
				"a","H","H","h","hh",
				"m","mm",
				"s","ss",
				"S","SSS"
				
		};
		
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp, new Locale("en"));
			System.out.println(pp+":"+sdf.format(now));
		}
	//// '89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
		
		String str = new SimpleDateFormat("''yy年 MMM dd일 (", new Locale("en")).format(now);
		str += new SimpleDateFormat("E) HH:mm:ss").format(now);
		System.out.println(str);
		
		sdf = new SimpleDateFormat("y-MM-dd HH:mm:ss");
		Date birth = sdf.parse("1992-23-899 46:45:21");
		System.out.println(birth);
		
		sdf = new SimpleDateFormat("yyMMdd");
		birth = sdf.parse("920320");
		System.out.println(birth);
		birth = sdf.parse("110320");
		System.out.println(birth);
		birth = sdf.parse("330320");
		System.out.println(birth);
		
		Calendar birCa = Calendar.getInstance();
		birCa.setTime(birth);
		System.out.println(birCa);
		birCa.add(Calendar.YEAR, 30);
		System.out.println(birCa);
		birth = birCa.getTime();
		System.out.println(birth);
		System.out.println(sdf.format(birth));
		
		
		now = new Date();
		sdf = new SimpleDateFormat("yyyyM");
		String pre = sdf.format(now);
		sdf = new SimpleDateFormat("yyyyMd");
		int last = sdf.parse(
				new SimpleDateFormat("yyyy").format(now)+(
				Integer.parseInt(new SimpleDateFormat("M").format(now))+1)
				+0).getDate();
		
		
		SimpleDateFormat wdf = new SimpleDateFormat("E");
		
		for(int i = 0; i <("일월화수목금토".indexOf(wdf.format(sdf.parse(pre+1)))); i++) {
			System.out.print("\t");
		}

		for(int i = 1; i<=last; i++) {
			System.out.print(i+"\t");
			
			if(wdf.format(sdf.parse(pre+i)).equals("토"))
				System.out.println();
			
			
			
		};
		
		
		
		
		
	}

}
