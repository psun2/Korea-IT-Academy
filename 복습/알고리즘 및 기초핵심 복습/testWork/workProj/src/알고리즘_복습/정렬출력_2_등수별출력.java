package 알고리즘_복습;

import java.util.Arrays;

public class 정렬출력_2_등수별출력 {

	public static void main(String[] args) {

//		한다인	98	294	97	98	99	1	
//		한마인	97	284	95	94	92	2	
//		한라인	88	346	87	86	89	3	
//		한사인	78	236	77	78	81	4	
//		한가인	78	306	77	76	79	5	
//		한나인	68	197	67	65	62	6	
//		한바인	58	226	57	56	59	7	

		String[] name = { "한가인", "한나인", "한다인", "한라인", "한마인", "한바인", "한사인" };

		int[][] jum = { { 78, 77, 79, 72 }, { 68, 67, 62 }, { 98, 97, 99 }, { 88, 87, 89, 82 }, { 97, 95, 92 },
				{ 58, 57, 59, 52 }, { 78, 77, 81 } };

		// 성적계산
		int[][] result = new int[name.length][3]; // [합계, 평균, (등수 추가)]

		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				result[i][0] += jum[i][j];
			}
			result[i][1] = result[i][0] / jum[i].length;
		}

		System.out.println(Arrays.deepToString(result));

		// 등수 계산
		for (int i = 0; i < result.length; i++) {
			result[i][2] = 1;
			for (int j = 0; j < result.length; j++) {
				if (result[i][1] < result[j][1])
					result[i][2]++;
			}
		}
		System.out.println(Arrays.deepToString(result));

		// 출력
		for (int r = 1; r <= name.length; r++) {

			String print = "";

			for (int i = 0; i < result.length; i++) {

				if (r == result[i][2]) {

					print += name[i] + "\t";

					for (int j = 0; j < result[i].length; j++) {

						print += jum[i][j] + "\t" + result[i][j] + "\t";

					}

				}

			}

			System.out.println(print);
		}

//		한다인	98	294	97	98	99	1	
//		한마인	97	284	95	94	92	2	
//		한라인	88	346	87	86	89	3	
//		한사인	78	236	77	78	81	4	
//		한가인	78	306	77	76	79	5	
//		한나인	68	197	67	65	62	6	
//		한바인	58	226	57	56	59	7	
	}

}
