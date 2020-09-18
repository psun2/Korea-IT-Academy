package 알고리즘_복습;

public class 다이아몬드_원본 {

	public static void main(String[] args) {

		int half = 5;
		for (int i = 0; i < 9; i++) {
			int half_i = i;
			if (i >= half) {
				half_i = 8 - i;
//				System.out.println("i >= half: " + half_i); // 0, 1, 2, 3
//			} else {
//				System.out.println(half_i); // 3, 2, 1, 0
			}

			for (int j = 0; j <= 10; j++) {
				String ch = "*";

				if (half - half_i <= j && half + half_i >= j)
//					ch = "" + j;
					ch = " ";
				System.out.print(ch);
			}

//			System.out.println(half_i + "," + (half - half_i) + "," + (half + half_i));
			System.out.println();
		}

	}

}