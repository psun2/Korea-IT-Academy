
public class Note {

	public static void main(String[] args) {

		String name[] = { "원빈", "현빈", "김우빈", "장희빈", "미스터빈" };

		int[][] jum = { { 76, 77, 71 }, { 56, 57, 51 }, { 96, 97, 91 }, { 66, 67, 61 }, { 86, 87, 81 }

		};

//		System.out.println(Arrays.deepToString(jum));

		int[][] res = new int[jum.length][3];
		// 0 - 총점, 1 - 평균, 2 - 등수

		// 2.1 기본연산
		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				res[i][0] += jum[i][j];
			}
			res[i][1] = res[i][0] / jum[i].length;
		}

//		System.out.println(Arrays.deepToString(res));

		// 2.2 등수계산
		for (int i = 0; i < res.length; i++) {
			res[i][2] = 1;
			for (int j = 0; j < res.length; j++) {
				if (res[i][1] < res[j][1])
					res[i][2]++;
			}
		}

		// System.out.println(Arrays.deepToString(res));

		// 출력
		for (int r = 1; r <= jum.length; r++) {

			for (int i = 0; i < jum.length; i++) {

				if (res[i][2] == r) {
					String ttt = name[i] + "\t";
					for (int j = 0; j < jum[i].length; j++) {
						ttt += jum[i][j] + "\t";
					}
					for (int j = 0; j < res[i].length; j++) {
						ttt += res[i][j] + "\t";
					}
					System.out.println(ttt);
				}

			}

		}


	}

}
