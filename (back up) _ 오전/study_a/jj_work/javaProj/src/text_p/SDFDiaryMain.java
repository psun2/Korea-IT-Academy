package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class SDFDiary{
	String year;

	public SDFDiary(String year) throws ParseException {
		super();
		this.year = year;
		
		for (int i = 1; i <=12; i++) {
			monthPPP(i);
		}
	};
	
	void monthPPP(int mm) throws ParseException {
		System.out.println("\t\t"+year+"년 "+mm+"월");
		String pre = year+mm+"-";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyM-d");
		int last = Integer.parseInt(
				new SimpleDateFormat("d").format(
						sdf.parse(year+(mm+1)+"-"+0)));

		SimpleDateFormat wdf = new SimpleDateFormat("E");
		
		for(int i = 0; 
			i <("일월화수목금토".indexOf(wdf.format(sdf.parse(pre+1)))); 
			i++) {
			System.out.print("\t");
		}

		for(int i = 1; i<=last; i++) {
			System.out.print(i+"\t");

			if(wdf.format(sdf.parse(pre+i)).equals("토"))
				System.out.println();
	
		};
		
		System.out.println("\n");
	}
	
}

public class SDFDiaryMain {
	
	public static void main(String[] args) throws ParseException {
		new SDFDiary(new SimpleDateFormat("yyyy").format(new Date()));

	}

}
