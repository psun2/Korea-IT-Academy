
public class Main {

	// 반복함수
	// 5!(팩토리얼) = 5 * 4 * 3 * 2 * 1
	public static int factorial(int number) {
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	// 재귀함수
	// 5!(팩토리얼) = 5 * 4 * 3 * 2 * 1
	public static int factorial2(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial2(number - 1); // 0까지는 안가네 ? 가장작은 단위가 1이라고 합니다.

	}

	public static void main(String[] args) {

		int number = 5;
		System.out.println(number + "!(팩토리얼)은 " + factorial(number) + " 입니다.");
		System.out.println(number + "!(팩토리얼)은 " + factorial2(number) + " 입니다.");

	}

}
