package util_p;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {

		Date today = new Date();
		
		System.out.println(today);
		Date birth = new Date(1992-1900,3-1,20,16,24,32);
		System.out.println(birth);
		birth = new Date(1992-1900,24-1,51,96,24,32);
		System.out.println(birth);
		
		System.out.println(new Date(2002-1900, 6-1, 2));
		System.out.println(new Date(2013-1900, 10-1, 11,6,48));
		System.out.println(new Date(0));
		
		System.out.println(today.getYear()+1900);
		System.out.println(today.getMonth()+1);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		System.out.println(today.getTime()/(1000*60*60*24)/365+1970);
		
		birth.setYear(1996-1900);
		birth.setMonth(3-1);
		birth.setDate(20);
		birth.setHours(8);
		birth.setMinutes(45);
		birth.setSeconds(52);
		birth.setTime(0);
		System.out.println(birth);

		System.out.println(today.after(birth));
		System.out.println(today.before(birth));
		
		int last = new Date(today.getYear(),today.getMonth()+1,0).getDate();
		
		
		System.out.println(last);
		today.setDate(1);
		for (int i = 0; i <today.getDay(); i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <=last; i++) {
			System.out.print(i+"\t");
			today.setDate(i);
			if(today.getDay()==6)
				System.out.println();
		}
		
		
	}

}
