package basic;

public class Exam {

	public static void main(String[] args) {
		//번호, 성명, 국어, 영어, 수학, 총점, 평균
		
		int num = 25;
		String name = "현빈";
		int kor =90, eng = 100, mat = 100;
		
		double pos = 100;
		
		int tot = kor + eng +mat;
		double avg = (double)tot/3; //  avg = (double)256/3 
									//  avg = 256.0/3
							        //  avg = 85.33333333333333
		/* 
		  85.33333333333333
		  8533.333333333333
		  8533
		  8533.0
		  85.33
		 */
		
		//85.333333 => 85.33
		//86.666666 => 85.67
		double avg2 = (double)(int)(avg*pos+0.5)/pos;
		
		String res = avg >= 90 ? "수" :
					avg >= 80 ? "우" :
					avg >= 70 ? "미" :
					avg >= 60 ? "양" :"가";
					
					
		String res2;
		if(avg >= 90) {
			res2 = "수";
			if(kor >=90 && eng >=90 && mat >=90)
				res2 += "(우등생)";
			
		}else if(avg >= 80) {
				res2 = "우";
		}else if(avg >= 70) {
			res2 = "미";
		}else if(avg >= 60) {
			res2 = "양";
		}else {
			res2 = "가";
		}
		
		
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
			default :
				res3 = "가";
				break;
		}
						
		System.out.println(num);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(tot);
		System.out.println("평균1:"+avg);
		System.out.println("평균2:"+avg2); //85.33
		System.out.println("등급:"+res);
		System.out.println("등급2:"+res2);
		System.out.println("등급3:"+res3);
		///평균으로 수우미양가 출력하세요
		
	}

}
