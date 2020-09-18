package arr_p;

import java.util.Arrays;

public class DynamicMul {

	public static void main(String[] args) {

		int [] arr1 = {123,456,789};
		
		int [][] arr2 = {
				{98,76,65,54,43},
				new int[8]
		};
		
		int [] arr3;
		
		int [][] arr = {
				{100,200,300},
				{11,22,33,44,55},
				new int[4],
				arr1,
				//arr2		차원이 맞아야 함
				arr2[0],
				//arr3		값(배열의 주소) 가 없는 변수 사용불가
				new int[] {135,246}	
		};
		
		int [][] arr4 = new int[2][3];
		
		int [][] arr5 = new int[3][];
		
		System.out.println("arr:"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+Arrays.toString(arr[i]));
		}
		System.out.println("arr4:"+Arrays.toString(arr4));
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4["+i+"]:"+Arrays.toString(arr4[i]));
		}
		System.out.println("arr5:"+Arrays.toString(arr5));
		for (int i = 0; i < arr5.length; i++) {
			System.out.println("arr5["+i+"]:"+Arrays.toString(arr5[i]));
		}
		
		//int [][] arr6 = new int[][3];
		int [][][][] arr7 = new int[2][][][];
		int [][][][] arr8 = new int[2][3][][];
		//int [][][][] arr9 = new int[2][][4][];
		//int [][][][] arr10 = new int[2][1][][5];
		arr5[0] = new int[3];
		arr5[1] = new int[] {1020,3040};
		
		System.out.println("arr5:"+Arrays.toString(arr5));
		for (int i = 0; i < arr5.length; i++) {
			System.out.println("arr5["+i+"]:"+Arrays.toString(arr5[i]));
		}
	}

}



