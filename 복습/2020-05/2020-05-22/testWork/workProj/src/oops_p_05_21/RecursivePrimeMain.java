package oops_p_05_21;

class RecursivePrime {

	static int prime(int number) {
		int cnt = 0; // 소수의 갯수를 count 합니다.

		if (prime(number, number - 1)) // 조건이 true일때 즉, 소수일때
			cnt++; // 카운터를 1씩 증가합니다.
		if (number == 1) // number 즉 1씩 줄면서 재귀하다가 1이 되면 더이상 할 것이 없으므로
			return 0; // 1은 소수가 아니기 때문에 return 0을 합니다.

		return cnt += prime(--number); // retuen할때 cnt 값을 더해 number가 1씩 줄면서 계속 재귀합니다.
	}

	static boolean prime(int number, int num) {
		if (num < 2) // num 이 1씩 줄면서 재귀하다가 2보다 작아진다 즉 소수이다. return 합니다 true
			return true;
		if (number % num == 0) // 만약 한번이라도 나뉘어 0이되면 소수가 아니기 때문에 false로 반환합니다.
			return false;

		return prime(number, --num); // 현재의 값에서 1씩 줄면서 계속 return 합니다.
	}

}

public class RecursivePrimeMain {

	public static void main(String[] args) {

		int a = 100;

		System.out.println(RecursivePrime.prime(a));

		// 일반 포문으로의 소수 갯수환산
		int primeCnt = 0;
		for (int i = 2; i < a; i++) {
			int cnt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				System.out.print(i + ",");
				primeCnt++;
			}
		}

		System.out.println("\n" + primeCnt + " 개");

	}

}
