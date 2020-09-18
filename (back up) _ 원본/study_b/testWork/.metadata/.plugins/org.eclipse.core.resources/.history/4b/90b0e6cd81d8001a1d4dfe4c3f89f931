package util_p;

import java.util.Calendar;

public class CalendarMain {
	
	static void ppp(String ttt,Calendar day) {
		 ttt +=":"+ day.get(Calendar.YEAR)+"년 "+
				(day.get(Calendar.MONTH)+1)+"월 "+
				day.get(Calendar.DATE)+"일 ("+
				" 일월화수목금토".charAt(day.get(Calendar.DAY_OF_WEEK))+"요일) "+
				day.get(Calendar.HOUR_OF_DAY)+":"+
				day.get(Calendar.MINUTE)+":"+
				day.get(Calendar.SECOND)+"."+
				day.get(Calendar.MILLISECOND);
		
		System.out.println(ttt);
	}
	

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		System.out.println(now.get(0));
		System.out.println(now.get(1));
		System.out.println(now.get(2));
		System.out.println(now.get(3));
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));
		System.out.println(now.get(Calendar.AM_PM));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		System.out.println(now.get(Calendar.ZONE_OFFSET));
		
		ppp("출력",now);
		now.set(1992, 3-1, 20, 16, 23, 45);
		now.set(1992, 19-1, 182, 516, 123, 45);
		now.set(1992, 19-1, 182, 516, 123);
		now.set(1998, 6-1, 2);
		now.set(Calendar.YEAR, 2017);
		ppp("출력",now);
		
		now.add(Calendar.YEAR, 5);
		ppp("출력",now);
		
		System.out.println(now.getTimeInMillis()/(1000*60*60*24)/365+1970);
		
		now.setTimeInMillis(0);
		ppp("출력",now);
		
		
		now.set(2020, 7-1, 0);
		ppp("출력",now);
		
		System.out.println(now.getActualMaximum(Calendar.MONTH));
		System.out.println(now.getActualMaximum(Calendar.DATE));
		
		Calendar today =Calendar.getInstance();
		
		System.out.println(now.after(today));
		System.out.println(now.before(today));
		
		Calendar birth =Calendar.getInstance();
		
		birth.set(today.get(Calendar.YEAR), 3-1, 20);
		
		ppp("올해생일",birth);
		if(today.after(birth))
			birth.add(Calendar.YEAR, 1);
			
		ppp("다가올생일",birth);
		
		int birthWW = birth.get(Calendar.DAY_OF_WEEK);
		int mnt = 0;
		if(birthWW==7)
			mnt = -1;
		if(birthWW==1)
			mnt = -2;
		
		birth.add(Calendar.DATE, mnt);
		ppp("생일파티",birth);
		
		System.out.println("dday:"+
		(birth.getTimeInMillis()-today.getTimeInMillis())/1000/60/60/24);
		
	}

}
