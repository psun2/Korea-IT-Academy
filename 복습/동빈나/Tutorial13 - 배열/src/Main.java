import java.util.Scanner;

public class Main {

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요: ");
		int number = scanner.nextInt(); // 배열의 길이를 입력받습니다.

		int[] array = new int[number]; // 배열 생성

		for (int i = 0; i < number; i++) { // number => 입력받은 배열의 길이 // 즉 array.length 와 같습니다.
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요(양수): ");
			array[i] = scanner.nextInt(); // 스캐너를 이용해 배열의 각 index에 입력 값을 입력합니다.
		}

		scanner.close(); // 스캐너의 사용이 종료되어 close() 함수를 이용해 사용을 안하게끔 합니다.

		int result = -1; // 임시적인 초기값
		for (int i = 0; i < number; i++) { // number 은 입력 받은 배열을 길이 입니다. 즉 array.length 와 같습니다.
			result = max(result, array[i]); // 배열을 순회하면서 값을 계속 비교 합니다. 반복문이 끝나면
		} // result 는 배열의 index 중 가장 큰 값이 됩니다.

		System.out.println("입력한 모든 정수 중에서 가장 큰 값은: " + result + " 입니다.");

	}

}
