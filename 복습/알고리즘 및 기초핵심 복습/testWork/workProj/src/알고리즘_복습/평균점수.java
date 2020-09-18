package 알고리즘_복습;

import java.util.Arrays;

import control_p.For369Main;

public class 평균점수 {

	public static void main(String[] args) {

		// 점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		// 70점 이상인 사람들의 합계와 평균을 구하세요

		int[] arr = { 87, 65, 82, 46, 98, 65, 72, 34, 91, 79, 45, 67 };

		// 70 이상인자와 미만인자를 2차원 배열에 담기
		int[][] sort = new int[2][0];

		for (int i : arr) {
			int count = 0;
			if (i >= 70) {
				count++;
			}
			int[] temp = new int[sort[count].length + 1];
			for (int j = 0; j < sort[count].length; j++) {
				temp[j] = sort[count][j];
			}
			temp[sort[count].length] = i;
			sort[count] = temp;
		}

		System.out.println(Arrays.deepToString(sort));

		// 2차원 배열의 0번 인덱스에는 총점을 1번 인덱스에는 평균을 구해 담슴니다.
		int[][] result = new int[2][1];

		for (int i = 0; i < sort[1].length; i++) {
			result[0][0] += sort[1][i];
		}

		result[1][0] = result[0][0] / sort[1].length;

		System.out.println(Arrays.deepToString(result));

		for (int i = 0; i < result.length; i++) {
			String print = "";
			for (int j = 0; j < result[i].length; j++) {
				for (int js : sort[1]) {
					print += "평균이 70점 이상인 사람의 점수는 " + js + " 이며" + "\t";
				}
				print += result[i][j] + "\t";
			}
			System.out.println(print);
		}

		
		
	}

}
