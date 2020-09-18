package 알고리즘_복습;

import java.util.Arrays;

public class 약분갯수_revers {

	public static void main(String[] args) {

//		22,4,67,12,98,70,53,82,16,8,32 ---> 약분의 갯수가 높은 순으로 정렬하세요
//		22 => 2,11 : 2개
//		12 => 2,3,4,6 : 4개

//		약분 = 1과 자신의 수를 뺀 수중 나눠서 0 이되는수
//		0:70    6
//		1:98    4
//		2:12    4
//		3:32    4
//		4:16    3
//		5:22    2
//		6:8 2
//		7:82    2
//		8:4 1
//		9:67    0
//		10:53   0

		int[] arr = { 22, 4, 67, 12, 98, 70, 53, 82, 16, 8, 32 };

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[i] = 1;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0)
					result[i]++;
			}
		}

		System.out.println("정렬전 arr: " + Arrays.toString(arr)); // [22, 4, 67, 12, 98, 70, 53, 82, 16, 8, 32]
		System.out.println("정렬전 result: " + Arrays.toString(result)); // [3, 2, 1, 5, 5, 7, 1, 3, 4, 3, 5]

		for (int i = 0; i < result.length; i++) {
			int temp;
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] < result[j]) {
					temp = result[i];
					result[i] = result[j];
					result[j] = temp;

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("정렬후 arr: " + Arrays.toString(arr)); // [70, 98, 12, 32, 16, 22, 8, 82, 4, 67, 53]
		System.out.println("정렬후 result: " + Arrays.toString(result)); // [7, 5, 5, 5, 4, 3, 3, 3, 2, 1, 1]

		for (int i = 0; i < result.length; i++) {
			System.err.println(arr[i] + "의 약분 갯수는 : " + result[i]);
		}

//		32의 약분 갯수는 : 5
//		16의 약분 갯수는 : 4
//		22의 약분 갯수는 : 3
//		8의 약분 갯수는 : 3
//		82의 약분 갯수는 : 3
//		4의 약분 갯수는 : 2
//		67의 약분 갯수는 : 1
//		53의 약분 갯수는 : 1

	}

}
