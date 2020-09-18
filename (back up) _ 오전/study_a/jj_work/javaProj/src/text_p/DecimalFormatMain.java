package text_p;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatMain {

	public static void main(String[] args) throws Exception {

		DecimalFormat df = new DecimalFormat();
		
		double dd = (double)df.parse("123,789.456");
		
		System.out.println("dd:"+dd);
		
		
		//dd = Double.parseDouble("123,789.456");
		
		System.out.println(df.format(456.789)+100);
		
		df = new DecimalFormat("#,##0.00");
		dd = (double)df.parse("123,789.456");
		
		System.out.println("dd:"+dd);
		System.out.println(df.format(987654.123456));
		System.out.println("--------------------------------");
		String [] ppStr = {
			"0"	, "#", "00000000", "########",
			"####0000", //"#0#0#0#0",//"0000#####"
			".00", ".##", "#.##",
			"#,###","#,###.##","#,##.##",
			"#@###","#,##0원","하하#,##0",
			"-#,##0","#,##0%",
			"#,##0;00", "양수#,##0;음수", "▲#,##0;▼"
		};
		
		double [] ddArr = {
				1234, -1234,
				123.45678, -1234.5678,
				987654.43210,-987654.43210,
				.45678,-.45678,
				.43210,-.43210, 0
		};
		
		for (String pp: ppStr) {
			System.out.println(pp +" >>>");
			df = new DecimalFormat(pp);
			for (double d : ddArr) {
				System.out.println("  "+d+":"+df.format(d));
			}
		}
		System.out.println("--------------------------------");
		int [] jum = {67,78,89,98,76,54,78,77,90,56};
		
		for (int i : jum) {
			System.out.println(i+":"+df.format(i-70).charAt(0));
		}

	}

}
