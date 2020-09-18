
public class Main {

	public static void main(String[] args) {

		int score = 95;

		if (score >= 95) {
			System.out.println("A+입니다.");
		} else if (score >= 80) {
			System.out.println("B+입니다.");
		} else if (score >= 70) {
			System.out.println("C+입니다.");
		} else {
			System.out.println("F입니다.");
		}

		String a = "Man";
		int b = 0;

//		자바는 String을 비교할때 equals()을 이용합니다.
//		그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
//		String은 class기반의 비원시자료형 입니다.

//		equals() 는 대소문자를 구분합니다.
		if (a.equals("Man")) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("남자가 아닙니다.");
		}

		if (b == 3) {
			System.out.println("b는 3입니다.");
		} else {
			System.out.println("b는 3이 아닙니다.");
		}

//		equalsIgnoreCase() 는 대소문자를 구분하지 않습니다.
		if (a.equalsIgnoreCase("man") && b == 0) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

		int i = 1, sum = 0;
		System.out.println("sum의 초기 값은 : " + sum + " 입니다.");
		while (i <= 1000) {
			sum += i;
			i++;
		}
		System.out.println("1부터 1000까지의 합은 : " + sum + "입니다.");

//		for문 : 초기화 부분, 조건 부분, 연산 부분
		for (int j = N; j > 0; j--) {
			for (int k = j; k > 0; k--) {
				System.out.print("★");
			}
			System.out.println(" j : " + j);
		}

//		원의 넓이 : x^2 + y^2 = r^2
		for (int j = -R; j <= R; j++) {
			for (int k = -R; k <= R; k++) {
				if (j * j + k * k <= R * R) {
					System.out.print("●");
				} else {
					System.out.print("○");
				}
			}
			System.out.println(" j : " + j);
		}

		int count = 0;
		for (;;) {
			System.out.println("출력");
			count++;
			if (count == 10) {
				break;
			}
		}

	}

	final static int N = 30;

	final static int R = 15;
}
