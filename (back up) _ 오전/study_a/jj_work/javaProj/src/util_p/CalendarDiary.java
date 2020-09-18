package util_p;

import java.util.Calendar;

public class CalendarDiary {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int  nowM = today.get(Calendar.MONTH);
		int  nowD = today.get(Calendar.DATE);
		
		today.set(Calendar.DATE, 1);
		int first = today.get(Calendar.DAY_OF_WEEK);
		
		//System.out.println(first);
		String spec = "";
		for (int i = 1; i < first; i++) {
			System.out.print("\t");
			spec+="\t";
		}
		
		int last = today.getActualMaximum(Calendar.DATE);
		
		
		for (int i = 1; i <=last; i++) {

			if(i==5) {
				spec+="어린이날";
			}
			spec+="\t";
			
			String itt = "";
			
			
			
			if(i<10)
				itt+=" ";
			itt+=i;
			
			if(i==nowD)
				itt = "["+itt+"]";
			else
				itt= " "+itt;
			
			today.set(Calendar.DATE, i);
			System.out.print(itt+"\t");
			
			int dd = today.get(Calendar.DAY_OF_WEEK);
			if(dd==7) {
				System.out.println();
				System.out.println(spec);
				spec="";
			}
		}

	}

}
