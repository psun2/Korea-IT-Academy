package arr_p;

import java.util.Arrays;

public class SortMain {

	public static void main(String[] args) {
		
		int a = 10, b= 20;
		
		System.out.println("a:"+a+",b:"+b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a:"+a+",b:"+b);
		
		int [] arr = {20,12,56,7,63,9};
		
		System.out.println("정렬전:"+Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] <arr[j]) {
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
						
			}
		}
		
		System.out.println("정렬후:"+Arrays.toString(arr));
		
		
		

	}

}
