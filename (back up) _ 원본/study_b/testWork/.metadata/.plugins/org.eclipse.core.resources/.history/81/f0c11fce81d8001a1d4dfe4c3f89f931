package control_p;

public class SwitchExamMain {

	public static void main(String[] args) {
//		과목 : 국어 40%, 영어 20% , 수학 10% , 국사 30%,   가산점 :  코딩 + 0.2
//        87       62        77        86                     0.1
//ex)    87 * 40% + 62*20% + 77 * 10% + 86 * 30%  = 87.9  ->3.9555 +0.1 =   >  4.0555
		
		int kor = 87, eng = 62, mat = 77, his = 86;
		double code = 0.1;
		
		double jum = (kor*0.4 + eng*0.2+mat*0.1+his*0.3)*0.045+code;
		
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
			default:
				res = "";
				break;
		}
		
		
		System.out.println(jum+":"+res);
		
		

	}

}
