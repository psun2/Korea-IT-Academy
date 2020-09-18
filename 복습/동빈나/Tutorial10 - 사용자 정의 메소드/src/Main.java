
public class Main {

	// 약수 중 K번째로 작은 수를 찾는 프로그램을 작성합니다.
	public static int function(int number, int k) {
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				k--;
				if (k == 0) {
					return i;
				}
			}
		}
		return -1;
	}

	// - 문자열에서 마지막 단어를 반환하는 함수를 작성합니다.
	public static char function2(String input) {
		return input.charAt(input.length() - 1);
	}

	// - max()를 이용하여 최대값을 저장하는 프로그램을 작성합니다.
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int function3(int a, int b, int c) {
		int result = max(a, b);
//		return result > c ? result : c;
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {

		int a = 3050;
		int b = 10;

		int result = function(a, b);
		if (result == 1) {
			System.out.println(a + "의" + b + "번째 약수는 없습니다.");
		} else {
			System.out.println("function(" + a + "  , " + b + "); // " + result);
			System.out.println(a + "의 " + b + "번째 약수 : " + result + " 입니다.");
		}

		String str = "Hello Word";
		System.out.println(str + " 의 마지막 단어 : " + function2(str));

		int x = 345, y = 567, z = 789;
		System.out.println("(" + x + ", " + y + ", " + z + ") 중에서 가장 큰 값 : " + function3(z, y, z) + " 입니다.");

	}

}
