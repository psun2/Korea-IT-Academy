package lang_p;

public class StringJuminMain {
	
	static int aToi(String str) {
		int res = 0;
		
		for (char ch : str.toCharArray()) {
			res*=10;
			res+=ch-'0';
		}
		return res;
	}
	
	static void ppp(String title, int [] day) {
		String index = "년월일";
		title+=":";
		for (int i = 0; i < day.length; i++) {
			title+=" "+day[i]+(char)index.charAt(i);
		}
		System.out.println(title);
	}

	public static void main(String[] args) {
		
		//System.out.println(100+aToi("1234"));
		
		String jumin = "920514-1234567";
		
		int k = jumin.charAt(7)-'0';
		
		System.out.println("성별:"+"여남".charAt(k%2)+"자");
		System.out.println("국적:"+"내외내".charAt((k-1)/4)+"국인");
		
		
		int [] birth = new int[3];
		
		for (int i = 0; i < birth.length; i++) {
			//birth[i]=aToi(jumin.substring(i*2,i*2+2));
			birth[i]=Integer.parseInt(jumin.substring(i*2,i*2+2));
		}
		
		birth[0]+= ((k%9==0 ? -1 : (k-1)%4	/2)+19)*100;
		
		ppp("생년월일",birth);
		
		int [] now = {2020,5,13};
		
		int [] nowBirth = {now[0],birth[1],birth[2]}; 
		ppp("올해생일",nowBirth);
		System.out.println("한국나이:"+(now[0]-birth[0]+1));
		
		int age = now[0]-birth[0];
		
		
		boolean after=now[1]<birth[1] || (now[1]==birth[1] && now[2]<birth[2]);
		//System.out.println(after);
		
		int [] mm = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int dday=0;
		if(after) {
			age--;
			
			/*
			if(now[1]==birth[1])
				dday =birth[2]-now[2];
			else
				dday = mm[now[1]]+birth[2]-now[2];
			
			for (int i = now[1]+1; i < birth[1]; i++) {
				dday+=mm[i];
			}*/
			
			//유건우씨가 잘난척 한 식  쳇 칫 
			dday =birth[2]-now[2];

			for (int i = now[1]; i < birth[1]; i++) {
				dday+=mm[i];
			}
	
		}else {
			nowBirth[0]++;
			
			dday = mm[now[1]]-now[2]+ birth[2];
			for (int i = 0; i < birth[1]; i++) {
				dday+=mm[i];
			}
			
			for (int i = now[1]+1; i < mm.length; i++) {
				dday+=mm[i];
			}
		
		}
		System.out.println("만나이:"+age);
		ppp("다가올생일",nowBirth);
		System.out.println("dday:"+dday);
		
		/*			%9	==0		-1	%4	/2			+19		*100
		1900 	1	1			0	0	0			19
		 		2	2			1	1	0
		2000 	3	3			2	2	1			20
		 		4	4			3	3	1
		 						----------------------
		1900	5	5			4	0
		 		6	6			5	1
		2000 	7	7			6	2
		 		8	8			7	3
		---------------------------------------------- 		
		1800 	9	0	-1							18
		 		0	0	-1
		 
		 
		 
		 */
		
		
		
		

	}

}
