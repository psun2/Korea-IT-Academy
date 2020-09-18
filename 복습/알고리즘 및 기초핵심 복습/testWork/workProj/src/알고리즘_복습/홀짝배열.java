package 알고리즘_복습;

import java.util.Arrays;

public class 홀짝배열 {

	public static void main(String[] args) {

		// 배열에서 홀수 와 짝수를 구분해서 새로운 배열에 담으시오.
		int[] data = { 22, 4, 67, 12, 98, 70, 53, 81, 16, 8, 35 };

		int[] evens = new int[0];
		int[] odds = new int[0];

		System.out.println("나누기전 data 배열" + Arrays.toString(data)); // [22, 4, 67, 12, 98, 70, 53, 81, 16, 8, 35]
		System.out.println("나누기전 evens 배열" + Arrays.toString(evens)); // []
		System.out.println("나누기전 odds 배열" + Arrays.toString(odds)); // []

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) { // 2로 나뉘면 짝수입니다.
				int[] temp = new int[evens.length + 1]; // 임시배열을 선언해서, 값을 바꿔치기 할 수 있게 해줍니다.
				for (int j = 0; j < evens.length; j++) {
					temp[j] = evens[j];
				}
				temp[evens.length] = data[i];
				evens = temp;
			} else { // 나뉘지 않는다면 홀수 입니다.
				int[] temp = new int[odds.length + 1]; // 임시배열을 선언해서, 값을 바꿔치기 할 수 있게 해줍니다.
				for (int j = 0; j < odds.length; j++) {
					temp[j] = odds[j];
				}
				temp[odds.length] = data[i];
				odds = temp;
			}
		}

		System.out.println("나눈 후 evens 배열" + Arrays.toString(evens)); // [22, 4, 12, 98, 70, 16, 8]
		System.out.println("나눈 후 odds 배열" + Arrays.toString(odds)); // [67, 53, 81, 35]
		
//		나눈 후 evens 배열[22, 4, 12, 98, 70, 16, 8]
//		나눈 후 odds 배열[67, 53, 81, 35]


	}

}
