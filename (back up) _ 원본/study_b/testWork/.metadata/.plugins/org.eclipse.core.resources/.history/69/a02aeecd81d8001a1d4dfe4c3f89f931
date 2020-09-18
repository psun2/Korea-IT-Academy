package text_p;

import java.text.DecimalFormat;

public class DecimalFormatMain {

	public static void main(String[] args) throws Exception {

		DecimalFormat df = new DecimalFormat();
		
		double dd = (double)df.parse("123,456.789");
		
		System.out.println(dd+100);
		
		//dd = Double.parseDouble("123,456.789");
		//System.out.println(dd+100);
		
		//dd = (double)df.parse("123__4?56.789");
		
		
		double [] ddArr = {
				1234,-1234,
				1234.45678, -1234.45678,
				987654.3210,-987654.3210,
				.45678, -.45678,
				.43210,-43210, 0	
		};
		
		String [] ppArr = {
				"0", "#", "000000000", "########",
				"######0000",//"#0#0#0#0#0",//"00000#####",
				".000",".0000000",".###",".########",
				"#,##","#,###","#,##0.000",
				"#@##0.00","#@###","ÇÏÇÏÇÏ#,##0","#,##0ÈåÈåÈåÈåÈå",
				"#,###.00%","¾ç¼ö#,##0;À½¼ö0.000","¡ã0.00;¡å"
		};
		
		for (String pp : ppArr) {
			System.out.println(pp+" >>>");
			
			df = new DecimalFormat(pp);
			
			for (double d: ddArr) {
				System.out.println(d+" -> "+df.format(d));
			}
		}
		
		
		int [] jum = {67,78,89,98,76,54,78,77,90,56};
		
		df = new DecimalFormat("¡ã0;¡å");
		
		
		for (int i : jum) {
			System.out.println(df.format(i-70).charAt(0));
		}
		
	}

}
