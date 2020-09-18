import java.util.Arrays;

class Minority {

	static int[] result = new int[0];

	static int calculation(int number) {
		int count = 0; // 소수의 갯수를 셉니다.
		int num = 0; // 2 ~ number 까지 가면서 소수 인지 아닌지 판단 합니다.
		int parameter = number - 1;

		if (number >= 2) {
			num = calculation(number, parameter);
			if (num == 0) {
				array(number);
				count++;
				count += calculation(parameter);
			} else {
				count += calculation(parameter);
			}
		}

		return count;
	}

	static int calculation(int number, int num) { // 위 calculation 에서만 사용하는 내부적인 재귀 함수임으로 오버로딩해 줍니다.
		int count = 0;
		int parameter = num - 1;

		if (1 < num) { // 1과 자기 자신의 수를 제외 합니다.
			if (number % num == 0) {
				count++;
				count += calculation(number, parameter);
			} else {
				count += calculation(number, parameter);
			}
		}
		return count;
	}

	static int[] array(int number) {

		int[] temp = new int[result.length + 1];

		for (int i = 0; i < result.length; i++) {
			temp[i] = result[i];
		}

		temp[result.length] = number;

		result = temp;

		return result;

	}

}

public class Main {

	public static void main(String[] args) {

		int a = 10;
		int result = Minority.calculation(a);
		System.out.println(a + "의 소수는: " + Arrays.toString(Minority.result) + "\n" + result + " 개 입니다.");

		/*
		 * 10의 소수는: [7, 5, 3, 2] 4 개 입니다.
		 */

		for (int i = 0; i < Minority.result.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < Minority.result.length; j++) {
				if (Minority.result[i] > Minority.result[j]) {
					temp = Minority.result[i];
					Minority.result[i] = Minority.result[j];
					Minority.result[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(Minority.result));
		// [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
		// 73, 79, 83, 89, 97]

	}

}
