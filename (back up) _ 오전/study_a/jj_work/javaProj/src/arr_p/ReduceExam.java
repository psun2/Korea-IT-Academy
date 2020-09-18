package arr_p;

import java.util.Arrays;

public class ReduceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] name = {
				"정우성","정좌성","정중성","정남성","북두신성"
		}; 
		
		
		int [][] jum = {
			{78,83,90,99},
			{86,89,81,82},
			{56,59,51,52},
			{96,99,91,90},
			{76,77,71,76},
		};
		
		int [][] res = new int[name.length][2];
		
		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				
				res[i][0] += jum[i][j];
			}
			res[i][1] = res[i][0]/ jum[i].length;
		}
		
		
		//int [] pass = new int[0], fail = new int[0];
		
		int [][] pf = new int[2][0]; //합격자:0, 불합격자:1
		
		for (int i = 0; i < res.length; i++) {
//			int no = 1;
//			if(res[i][1]>=80) {	
//				no = 0;
//			}
			int no = 1 - res[i][1] / 80;	
			int [] buf = new int[pf[no].length+1];
			
			for (int j = 0; j < pf[no].length; j++) {
				buf[j] = pf[no][j];
			}
			buf[pf[no].length] = i;
			pf[no] = buf;
				
		}
		
		System.out.println(Arrays.toString(pf[0]));
		
		int c;
		for (int i = 0; i < pf[0].length; i++) {
			
			for (int j = i+1; j < pf[0].length; j++) {
				
				if(res[ pf[0][i] ][1]<res[ pf[0][j] ][1]) {
					c = pf[0][i];
					pf[0][i] = pf[0][j];
					pf[0][j] = c;
				}
			}
		}
		
		
		
		
		
		
		String [] index = {"합격자","불합격자"}; 
		for (int k = 0; k < index.length; k++) {
			System.out.println(index[k]);
			
			for (int i = 0; i < pf[k].length; i++) {
				int no = pf[k][i];
				
				String ttt = no+"\t"+name[no]+"\t";
				
				for (int j = 0; j < jum[no].length; j++) {
					ttt += jum[no][j]+"\t";
				}
				
				for (int j = 0; j < res[no].length; j++) {
					ttt += res[no][j]+"\t";
				}
				
				System.out.println(ttt);
			}
		}

	}
	
	/*
	 과목 갯수를 이용하여 분류하세요  일반, 예체능 
	 - 총점, 평균, 등급, 전체등수, 분류별등수 를 구하세요
	 - 분류별 구분 후  등수를 이용하여 오름차순 출력하세요
	 - 분류 가 끝날때마다
	      과목별 총점, 평균, 최대, 최소 를 출력하세요
	      
0 . 예체능>>>>   국어  영어  수학  과학  특기
예체능	송가인	86	89	81	82	88	426	85	2	1	
예체능	오가인	78	83	90	99	43	393	78	4	2	
예체능	두가인	56	59	51	52	58	276	55	6	3
		총점		
		평균		
		최대          86	83
		최소	
1 . 일반>>>>국어  영어  수학  과학
일반	삼가인	96	99	91	90		376	94	1	1	
일반	육가인	86	74	89	75		324	81	3	2	
일반	한가인	76	77	71	76		300	75	5	3     
	총점		
	평균		
	최대          96	83
	최소		        
	        
	 * */
	

}
