
public class Main {

//	피보나치 수열
//	1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...

	// 반복함수
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;

		if (number == 1) {
			return one;
		} else if (number == 2) {
			return two;
		} else {
			for (int i = 2; i < number; i++) {
				// 2부터 시작하는 이유: i 의 0번째와 1번째는 1로 고정인 피보나치 수열의 특징입니다.
//				<= number 가 아닌이유: i 는 0부터 반복을 시작하기 때문에 
//				예를 들어 5번째 원소를 찾으려면 컴퓨터는 4번째 원소를 찾으면 되기 때문입니다.
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}

	// 재귀함수
	public static int fibonacci2(int number) {
		int one = 1;
		int two = 1;

		if (number == 1)
			return one;
		else if (number == 2)
			return two;
		else
			return fibonacci2(number - 1) + fibonacci2(number - 2);
	}

	public static void main(String[] args) {

		int number = 5;
		System.out.println("피보나치 수열의" + number + "번째 원소는: " + fibonacci(number) + " 입니다.");
		System.out.println("피보나치 수열의" + number + "번째 원소는: " + fibonacci2(number) + " 입니다.");

//		number 가 커질때 재귀 함수는 기하급수적으로 알고리즘이 늘어나 무한 반복에 빠지게 됩니다.

	}

}
