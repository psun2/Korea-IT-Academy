package array_p;

import java.util.Arrays;

public class PrimeNumberMain {

	public static void main(String[] args) {

		int[] numbers = { 78, 11, 45, 67, 9, 62, 13, 26, 38, 17, 61, 94, 5 };

		String[] title = { "일반", "소수" };

		int[][] result = new int[title.length][0];

		// 일반 과 소수의 구분
		for (int i : numbers) {
			int count = 1; // 14 ~ 17 번 코드로 인하여 소수가 아닐시 count 는 0
			for (int j = 2; j < i; j++) { // 소수 일 시 count 는 1을 반환합니다.
				if ((count = i % j) == 0) {
					break;
				}
			}

			int[] temp = new int[result[count].length + 1]; // result 의 count index의 길이 + 1 인 temp 배열 생성
			for (int k = 0; k < result[count].length; k++) { // result 의 count index 번 만큼 반복 => 첫루프는 0이기 때문에 for문 을
				// 진입하지 않습니다.
				temp[k] = result[count][k]; // 임시배열인 temp의 k 번재 인덱스를 result 의 count 인덱스의 k 인덱스의 값을 복사합니다.
			}
			temp[result[count].length] = i; // 임시배열인 temp의 result 배열의 count인덱스의 길이 죽, 첫 루프엔 0번 인덱스가 됩니다. i 값을 줌으로써
			// 현재 조건에 맞는 인덱스에 각각 나뉘게 됩니다.
			result[count] = temp; // result 배열의 count 인덱스에 있는 배열에 temp를 복사합니다.

		}

		System.out.println("result: " + Arrays.deepToString(result));

		// 출력과 함계 평균 계산
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i] + ": " + Arrays.toString(result[i]));
			int sum = 0;
//			for (int j = 0; j < result.length; j++) { // forEach 사용 가능
//				sum += result[i][j];
//			}
			for (int j : result[i]) { // result 의 i번째 에 있는 index 배열 을 순회하며 sum에 값을 누적 시켜 더 해줍니다.
				sum += j;
			}
			System.out.println(title[i] + " 총합: " + sum + ", " + " 평균: " + sum / result[i].length);
		}

		System.out.println();

		// 출력과 함계 평균 계산 (위와 반대로 출력)
		for (int i = title.length - 1; i >= 0; i--) {
			System.out.println(title[i] + ": " + Arrays.toString(result[i]));
			int sum = 0;
//			for (int j = 0; j < result.length; j++) { // forEach 사용 가능
//				sum += result[i][j];
//			}
			for (int j : result[i]) { // result 의 i번째 에 있는 index 배열 을 순회하며 sum에 값을 누적 시켜 더 해줍니다.
				sum += j;
			}
			System.out.println(title[i] + " 총합: " + sum + ", " + " 평균: " + sum / result[i].length);
		}

	}

}
