package oops;

class RecursiveCall {

	static int sum(int number) {

		number -= number % 2; // 홀수일땐 나머지가 무조건 1이되고, 1을 제거 해주면 짝수가 됩니다. 그리고 아래와 같은 조건문을 타고 재귀함수가 실행됩니다.

		if (0 < number)
			number += sum(number - 2); // 짝수들의 합이므로 -2씩 해줍니다.

		return number;
	}

	static int sum2(int number) {

		number -= number % 2; // 홀수일땐 나머지가 무조건 1이되고, 1을 제거 해주면 짝수가 됩니다. 그리고 아래와 같은 조건문을 타고 재귀함수가 실행됩니다.

		if (0 == number)
			return 0;

		return number += sum(number - 2);
	}

}

public class RecursiveCallMain {

	public static void main(String[] args) {

		// 재귀함수를 이용하여 짝수들의 합을 구하시오.

		int result = RecursiveCall.sum(11);

		System.out.println(result);

		int result2 = RecursiveCall.sum(11);

		System.out.println(result2);

	}

}
