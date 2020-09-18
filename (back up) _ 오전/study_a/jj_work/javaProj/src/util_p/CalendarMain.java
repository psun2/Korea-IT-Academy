package util_p;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();

		System.out.println(now);
		System.out.println(now.get(0));
		System.out.println(now.get(1));
		System.out.println(now.get(2));
		System.out.println(now.get(3));
		System.out.println();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println("일월화수목금토".charAt(now.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println(now.get(Calendar.AM_PM));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
		
		ppp(now);
		now.set(1992, 3-1, 20);
		ppp(now);
		now.set(1992, 3-1, 20,  20,15,42);
		ppp(now);
		now.set(1992, 3-1, 20,  5,30);
		ppp(now);
		now.set(1992, 20-1, 100, 30,-23);
		ppp(now);
		now.set(1992, 3-1, 1,  3,4, 5);
		ppp(now);
		now.set(1992, 3-1, 0,  3,4, 5);
		ppp(now);
		now.set(1993, 3-1, 0,  3,4, 5);
		ppp(now);
		
		now.set(Calendar.YEAR, 1996);
		ppp(now);
		now.set(Calendar.DATE, 5);
		ppp(now);
		
		//일 : 1
		now.set(Calendar.DAY_OF_WEEK, 3);
		ppp(now);
		
		System.out.println(now.getActualMaximum(Calendar.YEAR));
		System.out.println(now.getActualMaximum(Calendar.MONTH));
		System.out.println(now.getActualMaximum(Calendar.DATE));
		now.set(Calendar.MONTH, 4-1);
		System.out.println(now.getActualMaximum(Calendar.DATE));
		
		long timeStamp = now.getTimeInMillis();
		System.out.println(timeStamp);
		System.out.println(timeStamp/(1000*60*60*24)/365+1970);
		//now.setTimeInMillis(0);
		ppp(now);
		now.add(Calendar.YEAR, 5);
		ppp(now);
		
		Calendar today = Calendar.getInstance();
		
		System.out.println(now.getTimeInMillis()<today.getTimeInMillis());
		
		System.out.println(now.before(today));
		System.out.println(now.after(today));
		
	}
	
	static void ppp(Calendar day) {
		String res = day.get(Calendar.YEAR)+"-"+
				(day.get(Calendar.MONTH)+1)+"-"+
				day.get(Calendar.DATE)+" ("+
				"일월화수목금토".charAt(day.get(Calendar.DAY_OF_WEEK)-1)+") 오"+
				"전후".charAt(day.get(Calendar.AM_PM))+" "+	
				day.get(Calendar.HOUR_OF_DAY)+":"+	
				day.get(Calendar.MINUTE)+":"+	
				day.get(Calendar.SECOND)+"("+	
				day.get(Calendar.MILLISECOND)+")";
		
		System.out.println(res);
	}

}
