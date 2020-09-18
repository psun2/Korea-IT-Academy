package arr_p;

import java.util.Arrays;

//    {78,11,45,67,9,62,13,26,38,17,61,94,5}
//    숫자 중 솟수와 솟수가 아닌 것을 구분지어 배열로 출력하세요
//    각 구분의 합계, 평균을 구분 출력시 하단에 출력하세요

/*
 * 솟수 : 11,67,13,17,61,5
 * 합계, 평균
 * 
 * 제외 :78,45,9,62,26,38
 * 합계, 평균
 *  
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int [] num = {78,11,45,67,9,62,13,26,38,17,61,94,5};
		
		int [][] res = new int[2][0];  //0 솟수아님, 1 솟수
		int [] ana = new int[2];
//		
//		for (int i = 0; i < num
//				.length; i++) {
//			System.out.print(num[i]+",");
//		}
//		
//		System.out.println();
//		
		
		for (int i : num) {
			
			
			int chk = 1;  //솟수
			for (int j = 2; j <i; j++) {
				if((chk = i%j) ==0) //0 솟수아님
					break;
			}
			
			chk = 1-chk;
			
			/*
			 res[chk] = {78};
			 buf = new int [2]; 
			 
			 buf = {78,45};
			 
			 res[chk] = {78,45};
			 * */
			
			int [] buf = new int[res[chk].length+1];
			
			for (int j = 0; j < res[chk].length; j++) {
				buf[j] = res[chk][j];
			}
			buf[res[chk].length] = i; 
			res[chk] = buf;
			
			ana[chk] += i;
		}
		
		String [] title = {"소수","제외"};
		
		for (int i = 0; i < title.length; i++) {
		
			System.out.println(title[i]+":"+Arrays.toString(res[i]));
			System.out.println("합계:"+ana[i]+", 평균:"+ana[i]/res[i].length);
		}
		
	}

}
