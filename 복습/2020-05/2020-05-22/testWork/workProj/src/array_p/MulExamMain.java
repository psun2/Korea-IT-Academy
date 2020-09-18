package array_p;

public class MulExamMain {

	public static void main(String[] args) {

		String name[] = { "원빈", "현빈", "김우빈", "장희빈", "미스터빈" };

		int[][] jum = { { 76, 77, 71 }, { 56, 57, 51 }, { 96, 97, 91 }, { 66, 67, 61 }, { 86, 87, 81 } };

		int[][] res = new int[jum.length][3];
		// 0 - 총점, 1 - 평균, 2 - 등수

		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				res[i][0] += jum[i][j];
			}
			res[i][1] = res[i][0] / jum[i].length;
		}

		// 등수 계산
		for (int i = 0; i < res.length; i++) {
			res[i][2] = 1;
			for (int j = 0; j < res[i].length; j++) {
				if (res[i][1] < res[j][1])
					res[i][2]++;
			}
		}

		// 출력

		for (int i = 1; i <= res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				if (res[j][2] == i) {
					String ttt = name[i] + "\t";
					for (int j2 = 0; j2 < jum[j].length; j2++) {
						ttt += jum[j][j2] + "\t";
					}
					for (int j2 = 0; j2 < res[j].length; j2++) {
						ttt += jum[j][j2] + "\t";
					}
					System.out.println(ttt);
				}
			}
		}

	}

}
