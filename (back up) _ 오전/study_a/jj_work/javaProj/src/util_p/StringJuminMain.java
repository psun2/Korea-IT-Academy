package util_p;

import java.util.Calendar;


class JuminHoly{
	
	int m, d;

	public JuminHoly(int m, int d) {
		super();
		this.m = m;
		this.d = d;
	}
	
	
	boolean chk(Calendar day) {
		return (m+"_"+d).equals(day.get(Calendar.MONTH)+1+"_"+day.get(Calendar.DATE));
	}
	
}

public class StringJuminMain {
	
	
	static void ppp(String title,Calendar day) {
		String res = day.get(Calendar.YEAR)+"-"+
				(day.get(Calendar.MONTH)+1)+"-"+
				day.get(Calendar.DATE)+" ("+
				"�Ͽ�ȭ�������".charAt(day.get(Calendar.DAY_OF_WEEK)-1)+") ��"+
				"����".charAt(day.get(Calendar.AM_PM))+" "+	
				day.get(Calendar.HOUR_OF_DAY)+":"+	
				day.get(Calendar.MINUTE)+":"+	
				day.get(Calendar.SECOND)+"("+	
				day.get(Calendar.MILLISECOND)+")";
		
		System.out.println(title+":"+res);
	}
	
	
	

	public static void main(String[] args) {
		
		
		
		String jumin = "920127-1234567";
		
		int k = jumin.charAt(7)-'0';
		
		System.out.println("����:"+"����".charAt(k%2)+"��");
		System.out.println("����:"+"���ܳ�".charAt((k-1)/4)+"����");
		
		
		int [] birthArr = new int[3];
		
		for (int i = 0; i < birthArr.length; i++) {
			//birth[i]=aToi(jumin.substring(i*2,i*2+2));
			birthArr[i]=Integer.parseInt(jumin.substring(i*2,i*2+2));
		}
		
		birthArr[0]+= ((k%9==0 ? -1 : (k-1)%4	/2)+19)*100;
		
		
		
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(birthArr[0],birthArr[1]-1, birthArr[2],0,0,0);
		
		ppp("�������",birth);
		int age = now.get(Calendar.YEAR)-birth.get(Calendar.YEAR);
		System.out.println("�ѱ�����:"+(age+1));
		birth.set(Calendar.YEAR, now.get(Calendar.YEAR));
		ppp("���ػ���",birth);
		if(now.before(birth)) {
			age--;
		}else {
			birth.add(Calendar.YEAR, 1);
		}
		
		System.out.println("������:"+age);
		ppp("�ٰ��û���",birth);
		
		JuminHoly [] arr = {
				new JuminHoly(3, 20),
				new JuminHoly(8, 15),
				new JuminHoly(10, 9),
				new JuminHoly(1, 27),
				new JuminHoly(1, 26),
				new JuminHoly(1, 25)
		};
		
		for (JuminHoly hh : arr) {
			if(hh.chk(birth)) {
				birth.add(Calendar.DATE, -1);
			}
		}
		
		int ww = birth.get(Calendar.DAY_OF_WEEK);
		if(ww==1) birth.add(Calendar.DATE, -2);
		if(ww==7) birth.add(Calendar.DATE, -1);
		
		ppp("����",birth);
		System.out.println("dday:"+(birth.getTimeInMillis()-now.getTimeInMillis())/(1000*60*60*24));

	}

}
