package basic_p;

public class Exam {

	public static void main(String[] args) {
		
		//1. 입력부
		String studName = "정우성";

		int kor = 78, eng =59, math = 93;
		double pos = 10;
		
		
		
		//2. 연산부
		int tot = kor+eng+math;
		double avg = (double)tot/3;
		double avg2 = (double)(int)(avg*100)/100;
		double avg3 = (double)(int)(avg*pos+0.5)/pos;
		
		String res = 
					avg >= 90 ? "수" :
					avg >= 80 ? "우" :
					avg >= 70 ? "미" :
					avg >= 60 ? "양" : "가" ;
					
					
		String res2;
		
		
		
		if(avg >=90) {
			res2 = "수";
			if(kor>=90 && eng >= 90 && math >= 90 ) {
				res2 += "(우등생)";
			}
		}else if(avg >=80) {
			res2 = "우";
		}else if(avg >=70) {
			res2 = "미";
		}else if(avg >=60) {
			res2 = "양";
		}else {
			res2 = "가";
		}
		
		
		avg = 91;
		String res3;
		//System.out.println((int)avg/10);
		switch((int)avg/10) {
		
			case 10:
			case 9:
				res3 = "수";
				break;
			case 8:
				res3 = "우";
				break;
			case 7:
				res3 = "미";
				break;
			case 6:
				res3 = "양";
				break;
			default:
				res3 = "가";
				break;
		}
		
		//double avg3 = (double)(int)(avg*100+0.5)/100;
		/*
		 * 					+0.005
		     76.661111  --> 76.666111 -->	76.66
		     76.662111  --> 76.667111 -->	76.66
		     76.663111  --> 76.668111 -->	76.66
		     76.664111  --> 76.669111 -->	76.66
		     76.665111  --> 76.670111 -->	76.67
		     76.666111  --> 76.671111 -->	76.67
		     76.667111  --> 76.672111 -->	76.67
		     76.668111  --> 76.673111 -->	76.67
		     76.669111  --> 76.674111 -->	76.67
		 * 
		 * */
		
		//3.  출력부
		System.out.println(studName);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(tot);
		System.out.println(avg);
		System.out.println(avg2); 
		System.out.println(avg3);
		
		
	    System.out.println("등급 : "+ res);
	    System.out.println("등급2 : "+ res2);
	    System.out.println("등급3 : "+ res3);
		//76.33333  --> 76.33
		//76.66666  --> 76.67
		
		/*
		 76.33333333333333
		 
		 7633.333333333333
		 
		 7633
		 
		 7633.0
		 
		 76.33
		 
		 
		 * */
	}

}

