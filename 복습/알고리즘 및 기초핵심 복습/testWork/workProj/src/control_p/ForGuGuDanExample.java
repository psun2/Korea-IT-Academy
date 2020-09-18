package control_p;

public class ForGuGuDanExample {

	public static void main(String[] args) {

		int a = 20;
		System.out.println(a > 20); // false
		System.out.println(a < 20); // false
		System.out.println(a == 20); // true
		System.out.println(a >= 20); // true
		System.out.println(a <= 20); // true

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.println("--------------------------");

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i == 1 && j == 2) {
					for (int k = 2; k < 10; k++) {
						System.out.print(k + "단 \t\t");
					}
					System.out.println();
				}
				System.out.print(j + " * " + i + " = " + (j * i + "\t"));
			}
			System.out.println();
		}

		System.out.println("--------------------------");

		int kan = 3; // 각 줄에 나타날 단의 갯수
		int max = 13; // 구구단의 마지막 단
		for (int i = 1; i <= max; i += kan) {
			for (int z = i; z < i + kan; z++) {
				if (z > max)
					break;

				System.out.print(z + "단 \t\t");
			}
			System.out.println();
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + kan; k++) {
					if (k > max)
						break;

					System.out.print(k + " * " + j + " = " + (k * j + "\t"));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
