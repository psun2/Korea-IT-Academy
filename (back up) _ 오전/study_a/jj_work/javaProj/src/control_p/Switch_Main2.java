package control_p;

public class Switch_Main2 {

	public static void main(String[] args) {

//      과목 : 국어 40%, 영어 20% , 수학 10% , 국사 30%,   가산점 :  코딩 + 0.2
//      87       62        77        86                     0.1
//ex)    87 * 40% + 62*20% + 77 * 10% + 86 * 30%  = 87.9  ->3.9555 +0.1 =   >  4.0555
//
//평점만점 : 4.5 로 환산 하여 등급을 구하시오

		int kor = 87, eng = 76, mat = 56, his = 89;
		double code = 0.1;
		
		double jum = (kor*0.4 + eng*0.2 + mat*0.1+his*0.3 )*0.045+code;
		
		String res;
		switch((int)(jum*2)) {
			case 9:
				res = "A+";
				break;
			case 8:
				res = "A";
				break;
			case 7:
				res = "B+";
				break;
			case 6:
				res = "B";
				break;
			case 5:
				res = "C+";
				break;
			case 4:
				res = "C";
				break;
			case 3:
				res = "D+";
				break;
			case 2:
				res = "D";
				break;
			
			default :
				res = "F";
				break;
		}
		
		System.out.println(jum+","+(int)(jum*2)+":"+res);
		
		jum = 1.7;
		String res2;
		switch((int)jum) {
			
			case 4:
				res2 = "A";
				break;
			
			case 3:
				res2 = "B";
				break;
			
			case 2:
				res2 = "C";
				break;
			
			case 1:
				res2 = "D";
				break;
			
			default :
				res2 = "F";
				break;
		}
		
		
		if(res2 != "F" && jum-(int)jum >=0.5)
			res2+="+";
		
		
		System.out.println(jum+","+(int)jum+":"+res2);
		
		
		jum = 1.3;
		String res3;
		
		
		
		if(jum<1) {
			res3 = "F";
			
		}else {
			
			res3=""+(char)('E'-(int)jum);
			if(jum-(int)jum >=0.5)
				res3+="+";
		}
		
		
		
		
		
		System.out.println(jum+","+(int)jum+":"+res3);
		
		
		
	}

}
