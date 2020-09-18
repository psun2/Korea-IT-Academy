package array_p;

import java.util.Arrays;

public class MulArrayAddressMain {

	public static void main(String[] args) {

		int [] arr1 = {11,22,33,44};
		int [] arr2, arr3;
		int [][] tot2 = {
				{123,456},
				{789,102,304,506}
		};
		int [][] tot1 = {
				{10000,20000,30000},
				new int[5],
				arr1,
				tot2[0],
				//arr2
				arr3 = new int[] {45,67,89}
		};
		System.out.println("변경전 >>>");
		System.out.println("arr1 "+Arrays.toString(arr1)+arr1);
		//System.out.println("arr2 "+Arrays.toString(arr2));
		System.out.println("arr3 "+Arrays.toString(arr3)+arr3);
		
		System.out.println("tot2 >"+Arrays.toString(tot2));
		for (int i = 0; i < tot2.length; i++) {
			System.out.println("   tot2["+i+"] "+Arrays.toString(tot2[i]));
		}
		
		System.out.println("tot1 >"+Arrays.toString(tot1));
		for (int i = 0; i < tot1.length; i++) {
			System.out.println("   tot1["+i+"] "+Arrays.toString(tot1[i]));
		}
		
		arr1[1] = 2222;
		arr3[2] = 4989;
		tot2[0][1] = 264;
		
		tot1[2][3] = 123456;
		tot1[3][0] = 8888;
		tot1[4][1] = 62026;
		System.out.println("변경후 >>>");
		System.out.println("arr1 "+Arrays.toString(arr1)+arr1);
		System.out.println("arr3 "+Arrays.toString(arr3)+arr3);
		
		System.out.println("tot2 >"+Arrays.toString(tot2));
		for (int i = 0; i < tot2.length; i++) {
			System.out.println("   tot2["+i+"] "+Arrays.toString(tot2[i]));
		}
		
		System.out.println("tot1 >"+Arrays.toString(tot1));
		for (int i = 0; i < tot1.length; i++) {
			System.out.println("   tot1["+i+"] "+Arrays.toString(tot1[i]));
		}
	}

}
