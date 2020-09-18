import java.util.Arrays;

public class HomeWork {

	public static void main(String[] args) {

//	    {78,11,45,67,9,62,13,26,38,17,61,94,5}
//	    숫자 중 솟수와 솟수가 아닌 것을 구분지어 배열로 출력하세요
//	    각 구분의 합계, 평균을 구분 출력시 하단에 출력하세요

		/*
		 * 솟수 : 11,67,13,17,61,5 합계, 평균
		 * 
		 * 제외 :78,45,9,62,26,38 합계, 평균
		 * 
		 */

		int[] numbers = { 78, 11, 45, 67, 9, 62, 13, 26, 38, 17, 61, 94, 5 };

		int[] decimals = {}; // 소수가 담길 배열

		int[] nonDecimals = {}; // 소수가 아닌 숫자가 담길 배열

		System.out.println("솟수가 아닌 배열");

		for (int i = 0; i < numbers.length; i++) { // 소수가 아닌 배열을 만드는 반복문
			for (int j = 2; j < numbers[i]; j++) {
				int[] temp = new int[nonDecimals.length + 1];
				if (numbers[i] % j == 0) {
					for (int k = 0; k < nonDecimals.length; k++) {
						temp[k] = nonDecimals[k];
					}
					temp[nonDecimals.length] = numbers[i];
					nonDecimals = temp;
					break; // 한번 조건이 성공하면 더이상 볼 필요가 없기 때문에 break문으로 현재 반복문을 종료 합니다.
				}
			}

		}

		System.out.println(Arrays.toString(nonDecimals));

		System.out.println("평균 과 합계");
		int sum = 0, avg = 0;
		for (int i = 0; i < nonDecimals.length; i++) {
			sum += nonDecimals[i];
		}
		System.out.println("합계: " + sum + "\t평균: " + sum / nonDecimals.length);

		System.out.println("솟수인 배열");

		for (int i = 0; i < numbers.length; i++) { // 솟수인 배열을 만드는 반복문
			int cnt = 0; // numbers 의 index 값이 nonDecimals에 있다면 cnt 가 1씩 증가합니다.
			for (int j = 0; j < nonDecimals.length; j++) {
				if (nonDecimals[j] == numbers[i]) {
					cnt++;
				}
			}
			if (cnt == 0) { // cnt가 0 인경우 즉 두 배열에서 겹치는 요소가 없는 index의 값이 이쪽으로 오게 됩니다.
				int[] temp = new int[decimals.length + 1]; // for문 안에서 생성되는 가상의 배열을 생성합니다.
				// 이 배열의 길이는 decimals 초기 의 0에 1을 더해줍니다.
				// 반복문이 종료 될때 decimals 배열의 길이가 1씩 증가하기때문에 조건이 만족한다면 값을 계속 받을 수 있게 temp 배열의 길이가
				// 1씩 증가합니다.
				for (int j = 0; j < decimals.length; j++) { // 제일 처음 false이기 때문에 반복문을 시작하지 않습니다.
					temp[j] = decimals[j];
				}
				temp[decimals.length] = numbers[i]; // temp에 현재의 numbers 값을 넣어 줍니다.
				decimals = temp; // decimals 배열에 temp을 참조하게 합니다.
			}
			cnt = 0; // 다음 index의 값 체크를 위해 cnt를 0으로 초기화 합니다.
		}

		System.out.println(Arrays.toString(decimals));

		System.out.println("평균 과 합계");

		sum = 0;
		avg = 0;
		for (int i = 0; i < decimals.length; i++) {
			sum += decimals[i];
		}
		System.out.println("합계: " + sum + "\t평균: " + sum / decimals.length);

//		솟수가 아닌 배열
//		[78, 45, 9, 62, 26, 38, 94]
//		평균 과 합계
//		합계: 352	평균: 50
//		솟수인 배열
//		[11, 67, 13, 17, 61, 5]
//		평균 과 합계
//		합계: 174	평균: 29

	}

}
