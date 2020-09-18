package 배열복습;

import java.util.Arrays;

public class CreateArray_CopyArray {

	public static void main(String[] args) {

		// 배열의 선언 방법

		System.out.println("배열의 선언과 생성 및 초기화\n");

		// 배열 선언
		int[] arr1; // 배열 선언
//		System.out.println(Arrays.toString(arr1)); // 생성이 안되어 출력 오류
//		System.out.println(arr1); // 생성이 안되어 주소가 할당 되지 않았습니다.

		// 배열 생성
		arr1 = new int[3]; // 배열 생성
		System.out.println("heap 공간에 설정된 arr1 배열의 내부의 값: " + Arrays.toString(arr1)); // [0, 0, 0]
		System.out.println("heap 공간에 설정된 arr1 배열의 주소: " + arr1); // [I@15db9742

		// 배열 값 초기화
		arr1 = new int[] { 10, 20, 30 }; // 배열 값 초기화
		System.out.println("배열값 초기화 후 heap 공간의 arr1 배열 내부의 값: " + Arrays.toString(arr1)); // [10, 20, 30]
		System.out.println("배열값 초기화 후 heap 공간에 설정된 arr1 배열의 주소: " + arr1); // [I@6d06d69c

		// 배열의 선언과 생성 을 동시에
		int[] arr2 = new int[0]; // 배열의 선언과 생성 을 동시에
		System.out.println("배열의 선언과 생성 을 동시에 진행한 arr2 배열 이때부터 배열은 주소를 가지게 됩니다." + arr2); // [I@7852e922
		System.out.println("배열의 선언과 생성 을 동시에 진행한 arr2 배열의 내부값" + Arrays.toString(arr2)); // []

		arr2 = new int[] { 10, 20, 30 }; // 배열 값 초기화
		System.out.println("배열의 값을 초기화 한 이후부터 arr2 배열의 내부값이 생성 됩니다." + Arrays.toString(arr2)); // [10, 20, 30]

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n배열의 shallow copy(얕은복사) == 주소 공유\n");
		// shallow Copy
		int[] arr3;
		arr3 = arr1;
		System.out.println("arr3 은 arr1을 shallow copy 했습니다. arr3의 주소는 arr1과 동일 합니다. arr3의 주소: " + arr3); // [I@6d06d69c
		System.out.println("arr1의 주소: " + arr1); // [I@6d06d69c

		// shallow copy 한 arr1의 내부값을 변경했을시 arr3의 변화 check
		arr1[0] = 700;
		System.out.println("arr3와 주소를 공유하는 arr1의 index를 변경했을시의 arr1: " + Arrays.toString(arr1)); // [700, 20, 30]
		System.out.println("arr3와 주소를 공유하는 arr1의 index를 변경했을시의 arr1: " + Arrays.toString(arr3)); // [700, 20, 30]

		// shallow copy 한 arr3의 내부값을 변경했을시 arr1의 변화 check
		arr3[2] = 500;
		System.out.println("arr1와 주소를 공유하는 arr3의 index를 변경했을시의 arr3: " + Arrays.toString(arr3)); // [700, 20, 500]
		System.out.println("arr1와 주소를 공유하는 arr3의 index를 변경했을시의 arr1: " + Arrays.toString(arr1)); // [700, 20, 500]

//		결론: 참조 하는 배열이라면 어느 배열의 인덱스를 교체해도 모든 참조되는 배열의 인덱스가 변경됩니다.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n배열의 deep copy(깊은복사) != 주소 공유 && 새로운 배열의 탄생\n");

		int[] arr4 = new int[arr1.length];

		System.out.println("deep copy 전 arr4의 주소와 인덱스: " + arr4 + ", " + Arrays.toString(arr4)); // [I@4e25154f, [0, 0,
																									// 0]
		System.out.println("deep copy 전 arr1의 주소와 인덱스: " + arr1 + ", " + Arrays.toString(arr1)); // [I@6d06d69c, [700,
																									// 20, 500]

		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = arr1[i];
		}

		System.out.println("deep copy 후 arr4의 주소와 인덱스: " + arr4 + ", " + Arrays.toString(arr4)); // [I@4e25154f, [700,
																									// 20, 500]
		System.out.println("deep copy 후 arr1의 주소와 인덱스: " + arr1 + ", " + Arrays.toString(arr1)); // [I@6d06d69c, [700,
																									// 20, 500]

		arr1[0] = 123;
		System.out.println("arr1의 index를 변경했을시 arr1: " + Arrays.toString(arr1)); // [123, 20, 500]
		System.out.println("arr1의 index를 변경했을시 arr4: " + Arrays.toString(arr4)); // [700, 20, 500]
		arr4[1] = 456;
		System.out.println("arr4의 index를 변경했을시 arr1: " + Arrays.toString(arr1)); // [123, 20, 500]
		System.out.println("arr4의 index를 변경했을시 arr4: " + Arrays.toString(arr4)); // [700, 456, 500]
		// 서로에게 영향을 미치지 않습니다.

		int[] arr5 = new int[0];

		System.out.println("deep copy 전 arr5의 주소와 인덱스: " + arr5 + ", " + Arrays.toString(arr5)); // [I@70dea4e, []
		System.out.println("deep copy 전 arr1의 주소와 인덱스: " + arr1 + ", " + Arrays.toString(arr1)); // [I@6d06d69c, [123,
																									// 20, 500]

		for (int i = 0; i < arr1.length; i++) { // deep copy를 위해 arr1을 순회 해야하기 때문에 사용하는 반복문

			int[] temp = new int[arr5.length + 1]; // arr4에 현재 index의 길이를 주지 않았기 때문에 임시배열인 temp를 사용하여 값을 복사할 예정입니다.

			for (int j = 0; j < arr5.length; j++) { // arr4의 배열의 길이를 늘리면서 값을 복사하기 위한 반복문
				// arr5의 현재 길이는 0 입니다. 그러므로 첫 루프에는 반복문에 진입하지 않습니다.
				temp[j] = arr5[j]; // temp의 index를 돌면서 arr5의 index를 복사 합니다.
			}
			temp[arr5.length] = arr1[i];
			// 위 에서 temp 는 arr5.length + 1 을 해주엇기 때문에 arr5 의 길이가 0일때 temp는 1이며, 값을 받을 수 있는
			// 상태가 되고
			// temp의 arr5.length 번째 인덱스 즉 첫루프엔 0번 인덱스로서 arr1[i] 의 값을 복사합니다.
			arr5 = temp; // arr5를 temp 로 바꿔 치기 해줍니다.

			// 반복문이 돌면서 arr5의 index가 점점 늘어남에따라 temp의 인덱스 길이도 늘어 납니다.
		}

		System.out.println("deep copy 후 arr5의 주소와 인덱스: " + arr5 + ", " + Arrays.toString(arr5)); // [I@5c647e05, [123,
																									// 20, 500]
		System.out.println("deep copy 후 arr1의 주소와 인덱스: " + arr1 + ", " + Arrays.toString(arr1)); // [I@6d06d69c, [123,
																									// 20, 500]

		arr1[0] = 741;
		System.out.println("arr1의 index를 변경했을시 arr1: " + Arrays.toString(arr1)); // [741, 20, 500]
		System.out.println("arr1의 index를 변경했을시 arr5: " + Arrays.toString(arr5)); // [123, 20, 500]
		arr5[1] = 852;
		System.out.println("arr4의 index를 변경했을시 arr1: " + Arrays.toString(arr1)); // [741, 20, 500]
		System.out.println("arr4의 index를 변경했을시 arr5: " + Arrays.toString(arr5)); // [123, 852, 500]

//		결론: deep copy는 배열의 주소가 달라지기 때문에 참조방식이 아닙니다. 그리하여, 두 배열의 인덱스를 교체해도 서로에게 영향을 미치지 않습니다.

	}

}
