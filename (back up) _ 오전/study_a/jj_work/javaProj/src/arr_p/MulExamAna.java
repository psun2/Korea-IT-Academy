package arr_p;

import java.util.Arrays;

public class MulExamAna {

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
		
		///총점 평균 계산
		for (int i = 0; i < jum.length; i++) {
			
			for (int j :jum[i]) {
				rrr[i][0]+=j;
			}
			rrr[i][1]=rrr[i][0]/jum[i].length;
			
		}
		
		
		
		///등수계산
		for (int [] me :rrr) {
			
			me[2] = 1; //전체등수
			
			for (int [] you :rrr) {
				
				if(me[1]<you[1]) {  //상대방 평균보다 내가 낮음 
					                           //등수 조절
					me[2]++;	//전체등수
					
				}
			}
		}
		
		
		
		String [] cateTitle = {"예체능","일반"};
		int [][] cate = new int[cateTitle.length][0];
		
		for (int j = 0; j < jum.length; j++) {

			int num = 5 - jum[j].length;
			
			int [] buf = new int[cate[num].length+1];
			
			for (int i = 0; i < cate[num].length; i++) {
				buf[i] = cate[num][i];
						
			}
			buf[cate[num].length] = j;
			cate[num] = buf;	
		}
		
		
		
		
		
		
		
		
		String [] anaTitle = {"총점","평균","최대","최소"};
		int [][][] ana = new int[cateTitle.length][anaTitle.length][];
		
		for (int i = 0; i < ana.length; i++) {
			for (int j = 0; j < ana[i].length; j++) { //예체능과 일반의 과목 수를 자동으로 처리
				ana[i][j] = new int[5-i];
			}
			
			for (int j = 0; j < 5-i; j++) {
				ana[i][3][j] = 999;	//최소값  초기화 (모든과목)
			}
			
			
			for (int k : cate[i]) {  
				
				rrr[k][3] = 1; //분류등수
				for (int you : cate[i]) {
					
					if(rrr[k][1]<rrr[you][1]) {  //상대방 평균보다 내가 낮음 
						                           //등수 조절
						rrr[k][3]++;	//구분등수
						
					}
				}
				
				

				for (int j = 0; j < jum[k].length; j++) {
					
					ana[i][0][j] += jum[k][j] ;  //총점
					
					if(ana[i][2][j]<jum[k][j])   //최대
						ana[i][2][j]=jum[k][j];
					
					if(ana[i][3][j]>jum[k][j])   //최소
						ana[i][3][j]=jum[k][j];
				}
	
			}
			for (int j = 0; j < 5-i; j++) {  //평균
				ana[i][1][j] = ana[i][0][j]/cate[i].length ;
			}
			
		}
		
		
		//등수 구하고 나서 등수로 오름차순 정렬
		for (int[] is : cate) {
			
			for (int me = 0; me < is.length; me++) {
				
				for (int you = me+1; you < is.length; you++) {
					
					//내 등수가 상대방의 등수보다 더 큰수라면
					if(rrr[is[me]][3]>rrr[is[you]][3]) {
						//순서 바꾸기
						int buf = is[me];
						is[me] = is[you];
						is[you] = buf;
					}
					
				}
			}
			
		}
		
		
		
		
		for (int i = 0; i < cate.length; i++) {
			System.out.println(cateTitle[i]+">>>");
			
			for (int n : cate[i]) {
				String ttt = name[n]+"\t";
				
				for (int j : jum[n]) {
					ttt += j+"\t";
				}
				
				if(i==1) {
					ttt += "\t";
				}
				
				for (int j : rrr[n]) {
					ttt += j+"\t";
				}
				
				System.out.println(ttt);
			}
			System.out.println("---------------------------------------------------------------------------");
			for (int a = 0; a < ana[i].length; a++) {
				
				String ttt = anaTitle[a]+"\t";
				
				for (int js : ana[i][a]) {
					ttt += js +"\t";
				}
				
				System.out.println(ttt);
				
			}
			
			
		}
		

	}

}
