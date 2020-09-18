package control_p;

public class HomeWork2 {

	public static void main(String[] args) {

//		3	6	9 게임
//		1 ~ 20

		int max = 20;
		int plus = 3;
		for (int i = 1; i <= max; i += plus) {
			for (int j = i; j < i + plus; j++) {
				if (j > max)
					break;

				if (j / 10 <= 0) {
					if (j % 3 == 0) {
						System.out.print("짝");
					} else {
						System.out.print(j + "\t");
					}
				} else if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
					System.out.print("짝 \t");
				} else {
					System.out.print(j + "\t");
				}
			}
			System.out.println();
		}

		max = 100;
		plus = 3;
		for (int i = 1; i <= max; i += plus) {
			for (int j = i; j < i + plus; j++) {
				if (j > max)
					break;

				if (j / 10 <= 0) {
					if (j % 3 == 0) {
						System.out.print("짝");
					} else {
						System.out.print(j + "\t");
					}
				} else if ((j % 10 == 3 || j % 10 == 6 || j % 10 == 9) && (j / 10 == 3 || j / 10 == 6 || j / 10 == 9)) {
					System.out.print("짝짝 \t");
				} else if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
					System.out.print("짝 \t");
				} else if (j / 10 == 3 || j / 10 == 6 || j / 10 == 9) {
					System.out.print("짝 \t");
				} else {
					System.out.print(j + "\t");
				}
			}
			System.out.println();
		}
		
	

	}
}