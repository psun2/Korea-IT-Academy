package util_p;

import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		Date today = new Date();
		Date date1 = new Date(2016-1900, 5-1, 5);
		Date date2 = new Date(2016-1900, 123-1, 95,456,-213,-1234);
		Date date3 = new Date(0);
		System.out.println("today : "+today);
		System.out.println("date1 : "+date1);
		System.out.println("date2 : "+date2);
		System.out.println("date3 : "+date3);
		
		System.out.println(today.getTimezoneOffset());
		System.out.println(today.getYear()+1900);
		System.out.println(today.getMonth()+1);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		System.out.println(today.getTime()/(1000*60*60*24)/365+1970);
		
		date1.setYear(1996-1900);
		date1.setMonth(9954-1);
		date1.setDate(-1234513);
		date1.setHours(17);
		date1.setMinutes(987823);
		date1.setSeconds(41);
		System.out.println(date1);
		date1.setTime(0);
		System.out.println(date1);
		
		System.out.println(today.after(date1));
		System.out.println(today.before(date1));
		
		Calendar cc = Calendar.getInstance();
		CalendarMain.ppp("cc", cc);
		
		cc.setTime(date1);
		CalendarMain.ppp("cc", cc);
		cc.add(Calendar.YEAR, 15);
		CalendarMain.ppp("cc", cc);
		System.out.println(date1);
		date1 = cc.getTime();
		System.out.println(date1);
	}

}


