package arr_p;

public class MulExam {

	public static void main(String[] args) {
		String [] name = {"한가인","두가인","삼가인","송가인","오가인","육가인"};
		
		int [][] jum = {
				{76,77,71,76},
				{56,59,51,52,58},
				{96,99,91,90},
				{86,89,81,82,88},
				{78,83,90,99,43},
	            {86,74,89,75}
		};
		
		int [][]rrr = new int[name.length][4];  // {0,0,0,0}
		/*   
		 {합계,평균,등수,분류등수
		   {0, 0, 0, 0},  rrr[0]
		   {0, 0, 0, 0},  rrr[1]
		   {0, 0, 0, 0},  rrr[2]
		   {0, 0, 0, 0}   rrr[3]
		 }
		  
		 */
		
		for (int i = 0; i < jum.length; i++) {
			
			for (int j = 0; j <jum[i].length; j++) {
				rrr[i][0]+=jum[i][j];
			}
			rrr[i][1]=rrr[i][0]/jum[i].length;
			
		}
		
		
		for (int me = 0; me < rrr.length; me++) {
			
			rrr[me][2] = 1; //전체등수
			rrr[me][3] = 1; //분류등수
			for (int you = 0; you < rrr.length; you++) {
				
				if(rrr[me][1]<rrr[you][1]) {  //상대방 평균보다 내가 낮음 
					                           //등수 조절
					rrr[me][2]++;	//전체등수
					if(jum[me].length == jum[you].length)
						           //나와 상대방의 분류가 같은지
						rrr[me][3]++;
				}
			}
		}
		
		String [] kind = {"예체능","일반"};
		
		///분류 별 등수순서(전체, 분류)대로  등급
		for (int k = 0; k < kind.length; k++) {
			
			System.out.println(k+" . "+kind[k]+">>>>");
			
			//등수
			for (int r = 1; r <= name.length; r++) {
				
			//System.out.println(r);
			
				//학생
				for (int i = 0; i < jum.length; i++) {
					
					//분류 == 학생분류
					if(5-jum[i].length==k && rrr[i][2] == r ) {
						
						String res = kind[5-jum[i].length]+"\t";
						res += name[i]+"\t";
						
						for (int j = 0; j < jum[i].length; j++) {
							res += jum[i][j]+"\t";
						}
						
						if(jum[i].length==4)
							res += "\t";
						
						for (int j = 0; j < rrr[i].length; j++) {
							res += rrr[i][j]+"\t";
						}
						
						System.out.println(res);
					}
				}
			}
			
		}
		
		
		
		/*
		 다음은 주문 메뉴의 배열이다
		 각 날짜의 주문 합계를 출력하세요
		 
		 주문번호 : 
		 0 - 아메리카노 (2000)
		 1 - 아프리카노 (2300)
		 2 - 아시아노	 (2700)
		 
		 		아메리카노 ,아프리카노, 아시아노
		 4/10 -     1       2        0
		 4/11 -     2       0        1
		 4/12 -     0       3        0
		 4/13 -     1       1        1
		 
		 
		 4/10 -    6600
		 4/11 -    6700
		 4/12 -    6900
		 4/13 -    7000
		 
		 * */
		
		
		
		

	}

}
