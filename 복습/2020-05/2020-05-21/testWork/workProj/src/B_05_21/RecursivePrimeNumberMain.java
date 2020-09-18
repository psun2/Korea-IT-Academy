package B_05_21;

// 재귀함수를 사용하여, random 한 정수 중 소수의 갯수를 구하시오.
// 소수 : 1과 자기 자신의 수로만 나뉘는 수

public class RecursivePrimeNumberMain {
// 아무리 봐도 이해가 잘 가지 않습니다.

	static int primeCnt(int no) { // 1. 값을 입력 받습니다. => 값을 입력받은 수중 1씩 줄면서 소수인 수는 몇개 인지
		int res = primeChk(no, no - 1);

		if (no > 2)
			res += primeCnt(no - 1);
		else if (no == 2)
			res = 1;

		return res;
	}

	static int primeChk(int no, int i) { // 2. for문으로 따지만 안쪽 for문에 역할을 하며, no 는 i의 역할 i 는 j의 역할을 합니다.

		int res = no % i;

		if (i > 2 && res != 0)
			res = primeChk(no, i - 1);

		return res;
	}

	public static void main(String[] args) {

		int res = primeCnt(10);
		System.out.println("main: " + res); // 소수 일시 1 , 아닐시 0 반환

		// 일반 포문으로의 소수 갯수환산
		int primeCnt = 0;
		for (int i = 2; i < 100; i++) {
			int cnt = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0)
				primeCnt++;
		}

		System.out.println(primeCnt);

	}

}