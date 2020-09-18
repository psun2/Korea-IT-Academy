package array_p;

import java.util.Arrays;

public class ArrayCopyMAin {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30 };

		int[] arr2 = arr1; // shallow copy => 주소 복사 즉 arr1의 index의 원소를 바꾸면 같이 바뀝니다.

		int[] arr3 = new int[arr1.length]; // deep copy - 1

		for (int i = 0; i < arr1.length; i++) { // deep copy - 2
			arr3[i] = arr1[i]; // arr3 이라는 새로운 주소를 가진 배열의 index의 요소를 arr1의 index 요소를 복사 해옵니다.
			// deep copy는 원본 배열이 바뀌어도 copy된 배열은 바뀌지 않습니다.
		}

		// TODO clone
		int[] arr4 = arr1.clone();

		// clone() 함수는 deep copy입니다. 주소를 복사해 오는 것이 아니라, 똑같은 인덱스의 요소를 복사합니다.

		System.out.println("arr1: " + Arrays.toString(arr1) + ", 주소: " + arr1);
		// arr1: [10, 20, 30], 주소: [I@15db9742
		System.out.println("arr2: " + Arrays.toString(arr2) + ", 주소: " + arr2);
		// arr2: [10, 20, 30], 주소: [I@15db9742
		System.out.println("arr3: " + Arrays.toString(arr3) + ", 주소: " + arr3);
		// arr3: [10, 20, 30], 주소: [I@6d06d69c
		System.out.println("arr4: " + Arrays.toString(arr4) + ", 주소: " + arr3);
		// arr4: [10, 20, 30], 주소: [I@6d06d69c

		arr1[1] = 2222;
		System.out.println("arr1: " + Arrays.toString(arr1) + ", 주소: " + arr1);
		// arr1: [10, 2222, 30], 주소: [I@15db9742
		System.out.println("arr2: " + Arrays.toString(arr2) + ", 주소: " + arr2);
		// arr2: [10, 2222, 30], 주소: [I@15db9742
		System.out.println("arr3: " + Arrays.toString(arr3) + ", 주소: " + arr3);
		// arr3: [10, 20, 30], 주소: [I@6d06d69c
		System.out.println("arr4: " + Arrays.toString(arr4) + ", 주소: " + arr3);
		// arr4: [10, 20, 30], 주소: [I@6d06d69c

//		arr1 을 참조하는  arr2는  arr1 의 값이 바뀌면 arr2의 값도 바뀝니다.

		System.out.println();

		System.out.println("배열의 인덱스 추가");

		int[] no = { 11, 22 };
		System.out.println(no.length); // 2
		System.out.println("no" + Arrays.toString(no) + no);

		int[] temp = new int[no.length + 1]; // 원본배열의 1 만큼 추가된 길이를 가진 다른 배열을 생성합니다.

		for (int i = 0; i < no.length; i++) {
			temp[i] = no[i]; // 새로운 배열을 반복문을 돌리면서 deep copy 해옵니다.
		}
		temp[no.length] = 1234; // 새로운 배열의 마지막 요소 즉 원본배열의 길이는 새로운 배열의 마지막 index 이며 이 마지막 index 는 원본 배열에 없는 새로운
								// index 입니다.
		no = temp; // 원본배열에 새로만든 배열을 shallow copy를 하여 원본을 교체 해 줍니다.
		System.out.println("no" + Arrays.toString(no) + no);

		System.out.println();

		System.out.println("배열에서 홀 짝을 추출하여 새로운 배열 만들기");

		int[] datas = { 22, 4, 67, 12, 98, 70, 53, 81, 16, 8, 35 };

		int[] evens = {}; // 짝수가 담길 배열

		int[] odds = {}; // 홀수가 담길 배열

		for (int i = 0; i < datas.length; i++) {
			int cnt = 0;
			if (datas[i] % 2 == 0) {
				cnt++;
			}
			if (cnt > 0) {
				int[] tempEvens = new int[evens.length + 1];
				for (int j = 0; j < evens.length; j++) {
					tempEvens[j] = evens[j];
				}
				tempEvens[evens.length] = datas[i];
				evens = tempEvens;
			} else {
				int[] tempOdds = new int[odds.length + 1];
				for (int j = 0; j < odds.length; j++) {
					tempOdds[j] = odds[j];
				}
				tempOdds[odds.length] = datas[i];
				odds = tempOdds;
			}
			cnt = 0;
		}

		System.out.println(Arrays.toString(evens));
		System.out.println(Arrays.toString(odds));

		System.out.println("다른방법");

		// 짝수 배열
		int evenLength = 0;
		int oddLength = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] % 2 == 0) { // 짝수만 만들 배열의 길이를 구합니다.
				evenLength++;
			} else {
				oddLength++;
			}
		}

		System.out.println(evenLength); // 짝수 배열의 길이
		System.out.println(oddLength); // 홀수 배열의 길이

		int[] otherEvens = new int[evenLength];
		int[] otherOdds = new int[oddLength];

		int evenTarget = 0; // otherEvens 배열의 초기 index 값을 설정합니다.
		int oddTarget = 0; // // oddTarget 배열의 초기 index 값을 설정합니다.
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] % 2 == 0) { // 2로 나누어 지면 otherEvens 배열에 추가 하고
				otherEvens[evenTarget++] = datas[i]; // 0부터 시작하여 데이터가 추가될때마다 인덱스가 늘어나는 로직을 구성합니다.
			} else { // 아니면 otherOdds 배열에 추가하합니다.
				otherOdds[oddTarget++] = datas[i]; // 0부터 시작하여 데이터가 추가될때마다 인덱스가 늘어나는 로직을 구성합니다.
			}
		}

		System.out.println(Arrays.toString(otherEvens));
		System.out.println(Arrays.toString(otherOdds));

	}

}
