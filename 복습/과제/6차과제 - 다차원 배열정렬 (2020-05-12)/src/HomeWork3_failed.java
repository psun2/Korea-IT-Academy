import java.util.Arrays;

public class HomeWork3_failed {

	public static void main(String[] args) {

		/*
		 * 다음은 주문 메뉴의 배열이다 각 날짜의 주문 합계를 출력하세요
		 * 
		 * 주문번호 : 0 - 아메리카노 (2000) 1 - 아프리카노 (2300) 2 - 아시아노 (2700)
		 * 
		 * 아메리카노 ,아프리카노, 아시아노 4/10 - 1 2 0 4/11 - 2 0 1 4/12 - 0 3 0 4/13 - 1 1 1
		 * 
		 * 
		 * 4/10 - 6600 4/11 - 6700 4/12 - 6900 4/13 - 7000
		 * 
		 */

		String[][] menuAndDay = { { "아메리카노", "아프리카노", "아시아노" }, { "4/10", "4/11", "4/12", "4/13" } };
		int[][] priceAndMenu = { { 2000, 2300, 2700 }, { 1, 2, 0 }, { 2, 0, 1 }, { 0, 3, 0 }, { 1, 1, 1 } };

		System.out.println(Arrays.deepToString(menuAndDay));
		System.out.println(Arrays.deepToString(priceAndMenu));

		for (int i = 0; i < priceAndMenu.length; i++) {
			System.out.println("주문번호: ");
			for (int j = 0; j < priceAndMenu[i].length; j++) {
				String result = j + " - " + menuAndDay[i][j] + " (" + priceAndMenu[i][j] + ")";
				System.out.println(result);

			}
			break;
		}

		System.out.println();

		int len = menuAndDay[0].length;
		for (int i = 0; i < len; i++) {
			System.out.print("\t"+menuAndDay[0][i]);
		}

		System.out.println();

		for (int i = 0; i < menuAndDay[1].length; i++) {
			System.out.print(menuAndDay[1][i] + " - ");
			for (int j = 0; j < 1; j++) {
				for (int j2 = 0; j2 < priceAndMenu[j].length; j2++) {
					if (j2 == priceAndMenu[j].length - 1)
						System.out.print("\t"+priceAndMenu[j + (i + 1)][j2]);
					else
						System.out.print("\t"+priceAndMenu[j + (i + 1)][j2] + ", ");
				}
				System.out.println();
			}

		}

		System.out.println();
		
		for (int i = 0; i < menuAndDay[1].length; i++) {
			System.out.print(menuAndDay[1][i] + " - ");
			for (int j = 0; j < 1; j++) {
				for (int j2 = 0; j2 < priceAndMenu[j].length; j2++) {
					
				}
				System.out.println();
			}

		}
		
//		for (int i = 0; i < menuAndDay.length; i++) {
//			for (int j = 0; j < priceAndMenu.length; j++) {
//				
//			}
//		}
		
	}

}
