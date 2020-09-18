package 알고리즘_복습;

import java.util.Arrays;

public class 한번만겹치는수찾기_배열의중복제거 {

	public static void main(String[] args) {

		// 한번만 겹치는 수를 찾아 출력하시오.

		int[] ones = { 78, 12, 45, 67, 78, 12, 67, 5, 78, 12, 56, 78, 78, 9 };
		
		int[] temp = ones.clone(); // 비교항 배열과 동일한 배열을 복제합니다. deep copy로 ...

		System.out.println(Arrays.toString(ones)); // [78, 12, 45, 67, 78, 12, 67, 5, 78, 12, 56, 78, 78, 9]

		int[] result = new int[0];

		for (int i = 0; i < ones.length; i++) {
			int count = 0;
			for (int j = 0; j < ones.length; j++) {
				if (ones[i] == temp[j]) {
					count++;
					temp[j] = 0; // 조건에 맞을때 마다 복제한 배열의 index 값을 0으로 바꾸어 줍니다. why ?
				} // 어차피 count가 2 가 아니면 한번만 겹치는 배열의 값이 아니기 때문에 필요가 없고,
			} // count가 2 이여도 원본배열에 다음 겹치는건 비교가 의미가 없기 때문에 ....
			if (count == 2) {
				int[] temp2 = new int[result.length + 1];
				for (int j = 0; j < result.length; j++) {
					if (ones[i] != result[j]) {
						temp2[j] = result[j];
					}
				}
				temp2[result.length] = ones[i];
				result = temp2;
			}
		}

		System.out.println(Arrays.toString(result)); // [67]
		
//		결론: 원본배열인 ones 에서 한번만 겹치는 수는 67 하나 입니다.
//		[67]

	}

}
