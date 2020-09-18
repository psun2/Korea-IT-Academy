package 알고리즘_복습;

import java.util.Arrays;

public class 정렬출력_1_기본출력 {

	public static void main(String[] args) {

//		한가인	306	76	306	76	
//		한나인	197	65	197	65	
//		한다인	294	98	294	98	
//		한라인	346	86	346	86	
//		한마인	284	94	284	94	
//		한바인	226	56	226	56	
//		한사인	236	78	236	78

		String[] name = { "한가인", "한나인", "한다인", "한라인", "한마인", "한바인", "한사인" };

		int[][] jum = { { 78, 77, 79, 72 }, { 68, 67, 62 }, { 98, 97, 99 }, { 88, 87, 89, 82 }, { 97, 95, 92 },
				{ 58, 57, 59, 52 }, { 78, 77, 81 } };

		// 성적계산
		int[][] result = new int[name.length][2]; // [합계, 평균]

		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				result[i][0] += jum[i][j];
			}
			result[i][1] = result[i][0] / jum[i].length;
		}

		System.out.println(Arrays.deepToString(result));

		// 출력
		for (int i = 0; i < name.length; i++) {
			String print = name[i] + "\t";
			for (int j = 0; j < result[i].length; j++) {
				print += result[i][j] + "\t";
			}
			for (int j = 0; j < result[i].length; j++) {
				print += result[i][j] + "\t";
			}
			System.out.println(print);
		}
		
//		한가인	306	76	306	76	
//		한나인	197	65	197	65	
//		한다인	294	98	294	98	
//		한라인	346	86	346	86	
//		한마인	284	94	284	94	
//		한바인	226	56	226	56	
//		한사인	236	78	236	78

	}

}
