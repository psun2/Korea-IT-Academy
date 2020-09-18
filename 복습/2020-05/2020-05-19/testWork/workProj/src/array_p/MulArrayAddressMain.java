package array_p;

import java.util.Arrays;

public class MulArrayAddressMain {

	public static void main(String[] args) {

		System.out.println("학습목표: 배열의 주소개념");
		System.out.println();

		int[] arr1 = { 11, 22, 33, 44 };
		int[] arr2, arr3;
		int[][] tot2 = { { 123, 456 }, { 789, 102, 304, 506 } };
		int[][] tot1 = { //
				{ 10000, 20000, 30000 }, // 2차원 배열에 새로운 배열을 넣 을 수 있습니다.
				new int[5], // 2차원 배열의 인덱스의 값으로 받을 배열을 바로 생성 할 수 있습니다.
				arr1, // 다른 1차원 배열을 참조 하여 가져 올 수 있습니다 ✔ 주의: 복제가 아닌 래퍼런싱(참조) 입니다.주
				tot2[0], // 다른 2차원 배열에 있는 인덱스의 배열을 참조 할 수 있습니다. ✔ 주의: 복제가 아닌 래퍼런싱(참조) 입니다.
				// arr2
				arr3 = new int[] { 45, 67, 89 } // 선언해둔 배열을 2차원 배열 안쪽에서 생성하여 값을 입력 할 수 있습니다.
		};

		System.out.println("1차원 배열 변경 전 >>>");
		System.out.println("arr1 " + Arrays.toString(arr1) + " arr1 주소 " + arr1);
		// System.out.println("arr2 "+Arrays.toString(arr2)); // 선언후 생성을 안하여 출력 할 수
		// 없습니다.
		System.out.println("arr3 " + Arrays.toString(arr3) + " arr3 주소 " + arr3);

		System.out.println("2차원 배열 변경 전 >>>");
		System.out.println("tot2 주소 >" + Arrays.toString(tot2));
		System.out.println("tot2 index >" + Arrays.deepToString(tot2));

		for (int i = 0; i < tot2.length; i++) {
			System.out.println("	to2t[" + i + "] => " + Arrays.toString(tot2[i]));
		}

		for (int i = 0; i < tot1.length; i++) {
			System.out.println("	tot1[" + i + "] => " + Arrays.toString(tot1[i]));
		}

		System.out.println();

		arr1[1] = 2222;
		arr3[2] = 4989;
		tot2[0][1] = 264;

		tot1[2][3] = 123456;
		tot1[3][0] = 8888;
		tot1[4][1] = 62026;

		System.out.println("1차원 배열 변경 후 >>>");
		System.out.println("arr1 " + Arrays.toString(arr1) + " arr1 주소 " + arr1);
		// System.out.println("arr2 "+Arrays.toString(arr2)); // 선언후 생성을 안하여 출력 할 수
		// 없습니다.
		System.out.println("arr3 " + Arrays.toString(arr3) + " arr3 주소 " + arr3);

		System.out.println("2차원 배열 변경 후 >>>");
		System.out.println("tot2 주소 >" + Arrays.toString(tot2));
		System.out.println("tot2 index >" + Arrays.deepToString(tot2));

		for (int i = 0; i < tot2.length; i++) {
			System.out.println("	to2t[" + i + "] => " + Arrays.toString(tot2[i]));
		}

		for (int i = 0; i < tot1.length; i++) {
			System.out.println("	tot1[" + i + "] => " + Arrays.toString(tot1[i]));
		}

		System.out.println("=====================================================================");

		System.out.println("결론: 배열 1 = 배열2 이라함은 기본자료형과는 다르게 복제가 아닌 참조의 형식의 개념이 됩니다.");
		System.out.println("즉 배열은 다른배열의 주소를 서로 공유하며 참조하고 참조되는 배열의 값이 바뀌면 참조하고 있는 배열의 값도 변경 됩니다.");
	}

}
