package arr_p;

import java.util.Arrays;

public class ReduceMain {

	public static void main(String[] args) {
		int [] num = {78,12,45,67,9,62,184,26,38,75,61,94};
		
		int [] two = new int[0], three = new int[0];
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]%2==0) {
				int [] buf = new int[two.length+1];
				
				for (int j = 0; j < two.length; j++) {
					buf[j] = two[j];
				}
				buf[two.length] = num[i];
				two = buf;
			}
			
			if(num[i]%3==0) {
				int [] buf = new int[three.length+1];
				
				for (int j = 0; j < three.length; j++) {
					buf[j] = three[j];
				}
				buf[three.length] = num[i];
				three = buf;
			}
			
			
			//System.out.println(num[i]);
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(two));
		System.out.println(Arrays.toString(three));
		
		System.out.println("--------------------------------");
		
		int [] num2 = {78,12,45,67,9,62,184,26,38,75,61,94};
		
		int [] two2 = new int[0], three2 = new int[0];
		
		
		for (int i = 0; i < num2.length; i++) {
		
			int [] addr;
			if(num2[i]%2==0) {
				addr = two2;
			}
			else{
				addr = three2;
			}
			
			
			
			int [] buf = new int[addr.length+1];
			
			for (int j = 0; j < addr.length; j++) {
				buf[j] = addr[j];
			}
			buf[addr.length] = i;
			addr = buf;
			
			//System.out.println(Arrays.toString(addr));
			
			if(num2[i]%2==0) {
				
				two2 = addr;
			}
			else{	
				three2 = addr;
			}
			
			
			//System.out.println(num[i]);
		}
		
		System.out.println(Arrays.toString(two2));
		for (int i = 0; i < two2.length; i++) {
			System.out.print(num2[ two2[i] ]+",");
		}
		System.out.println();
		
		
		System.out.println(Arrays.toString(three2));
		for (int i = 0; i < three2.length; i++) {
			System.out.print(num2[ three2[i] ]+",");
		}
		
		
		
		
		System.out.println("\n--------------------------------");
		
		int [] num3 = {78,12,45,67,9,62,184,26,38,75,61,94};
		
		int [][] res = new int[2][0];
		
		for (int i = 0; i < num3.length; i++) {
		
			int no = num3[i]%2;
			
			int [] buf = new int[res[no].length+1];
			
			for (int j = 0; j < res[no].length; j++) {
				buf[j] = res[no][j];
			}
			buf[res[no].length] = i;
			res[no] = buf;
				
		}
		
		String [] index = {"짝수","홀수"}; 
		
		for (int j = 0; j < res.length; j++) {
			System.out.print(index[j]+":");
			for (int i = 0; i < res[j].length; i++) {
				System.out.print(num2[ res[j][i] ]+",");
			}
			System.out.println();
		}
		
		//{78,11,45,67,9,62,13,26,38,17,61,5}
		// 숫자중 솟수와 솟수가 아닌 것을 구분지여 배열로 출력하세요
		// 각 구분의 합계, 평균을 구분 출력시 하단에 출력하세요
		
		/*
		 * 솟수 : 11,67,13,17,61,5
		 * 합계 , 평균
		 * 
		 * 제외 :78,45,9,62,26,38
		 * 합계 , 평균
		 * 
		 * */

	}

}
