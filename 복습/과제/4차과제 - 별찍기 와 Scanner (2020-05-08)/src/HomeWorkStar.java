
public class HomeWorkStar {

	public static void main(String[] args) {
		System.out.println("블랙다이아몬드");

		// top
		for (int i = 0; i < 5; i++) {
			// top__left

			for (int j = 0; j < 5 - i; j++) {
				System.out.print("＊");

			}

			// top__center
			for (int k = 0; k <= (i * 2); k++) {
				System.out.print("　");
			}

			// top__right
			for (int l = 0; l < 5 - i; l++) {
				System.out.print("＊");
			}

			System.out.println();
		}

		// bottom
		for (int i = 0; i < 4; i++) {

			// bottom__left
			for (int j = 0; j <= i + 1; j++) {
				System.out.print("＊");
			}

			// bottom__center
			for (int j = 0; j < 7 - (i * 2); j++) {
				System.out.print("　");

			}

			// bottom__right
			for (int l = 0; l <= i + 1; l++) {
				System.out.print("＊");
			}

			System.out.println();
		}

		System.out.println("--------------------------");
		System.out.println("모래시계");

		// top
		for (int i = 0; i < 4; i++) {

			// top__left
			for (int j = 0; j <= i; j++) {
				System.out.print("＊");
			}

			// top__center
			for (int j = 0; j < 7 - (i * 2); j++) {
				System.out.print("　");

			}

			// top__right
			for (int l = 0; l <= i; l++) {
				System.out.print("＊");
			}

			System.out.println();
		}

		// bottom
		for (int i = 0; i < 4; i++) {
			// bottom__left

			for (int j = 0; j < 3 - i; j++) {
				System.out.print("＊");

			}

			// bottom__center
			for (int k = 0; k <= 2 + (i * 2); k++) {
				System.out.print("　");
			}

			// bottom__right
			for (int l = 0; l < 3 - i; l++) {
				System.out.print("＊");
			}

			System.out.println();
		}

		System.out.println("--------------------------");

		System.out.println("별 모래시계");

		// top
		for (int i = 0; i < 4; i++) {

			// top__left
			for (int j = 0; j <= i; j++) {
				System.out.print("　");
			}

			// top__center
			for (int j = 0; j < 7 - (i * 2); j++) {
				System.out.print("＊");

			}

			// top__right
			for (int l = 0; l <= i; l++) {
				System.out.print("　");
			}

			System.out.println();
		}

		// bottom
		for (int i = 0; i < 3; i++) {
			// bottom__left

			for (int j = 0; j <= 2 - i; j++) {
				System.out.print("　");

			}

			// bottom__center
			for (int k = 0; k <= 2 + (i * 2); k++) {
				System.out.print("＊");
			}

			// bottom__right
			for (int l = 0; l <= 2 - i; l++) {
				System.out.print("　");
			}

			System.out.println();
		}

		System.out.println("--------------------------");

		System.out.println("별");

		// top
		for (int i = 0; i < 3; i++) {
			// top__left
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("　");
			}
			// top__center
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("＊");
			}
			// top__right
			for (int l = 0; l <= 10 - i; l++) {
				System.out.print("　");
			}
			System.out.println();
		}

		// center
		// center__top
		for (int i = 0; i < 4; i++) {
			// center__top-left
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("　");
			}
			// center__top-center
			for (int k = 0; k < 22 - (i * 2); k++) {
				System.out.print("＊");
			}
			// center__top-right
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("　");
			}
			System.out.println();
		}

		// center__bottom
		for (int i = 0; i < 3; i++) {
			// center__bottom-left
			for (int j = i; j < 2; j++) {
				System.out.print("　");
			}
			// center__bottom-center
			for (int k = 0; k < 18 + (i * 2); k++) {
				System.out.print("＊");
			}
			// center__bottom-right
			for (int j = i; j < 2; j++) {
				System.out.print("　");
			}
			System.out.println();
		}

		// bottom
		for (int i = 0; i < 3; i++) {
			// bottom__left
			for (int j = 0; j < 8 + i; j++) {
				System.out.print("　");
			}
			// bottom__center
			for (int k = 0; k < 5 - (i * 2); k++) {
				System.out.print("＊");
			}
			// bottom__right
			for (int l = 0; l <= 8 + i; l++) {
				System.out.print("　");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");

		System.out.println("별2");

		// top
		for (int i = 0; i < 3; i++) {
			// top__left
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("＊");
			}
			// top__center
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("　");
			}
			// top__right
			for (int l = 0; l <= 10 - i; l++) {
				System.out.print("＊");
			}
			System.out.println();
		}

		// center
		// center__top
		for (int i = 0; i < 4; i++) {
			// center__top-left
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("＊");
			}
			// center__top-center
			for (int k = 0; k < 22 - (i * 2); k++) {
				System.out.print("　");
			}
			// center__top-right
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("＊");
			}
			System.out.println();
		}

		// center__bottom
		for (int i = 0; i < 3; i++) {
			// center__bottom-left
			for (int j = i; j < 2; j++) {
				System.out.print("＊");
			}
			// center__bottom-center
			for (int k = 0; k < 18 + (i * 2); k++) {
				System.out.print("　");
			}
			// center__bottom-right
			for (int j = i; j < 2; j++) {
				System.out.print("＊");
			}
			System.out.println();
		}

		// bottom
		for (int i = 0; i < 3; i++) {
			// bottom__left
			for (int j = 0; j < 8 + i; j++) {
				System.out.print("＊");
			}
			// bottom__center
			for (int k = 0; k < 5 - (i * 2); k++) {
				System.out.print("　");
			}
			// bottom__right
			for (int l = 0; l <= 8 + i; l++) {
				System.out.print("＊");
			}
			System.out.println();
		}
	}

}
