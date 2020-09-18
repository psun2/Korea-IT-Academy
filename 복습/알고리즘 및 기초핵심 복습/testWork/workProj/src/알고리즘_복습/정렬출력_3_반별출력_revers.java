package 알고리즘_복습;

import java.util.Arrays;

public class 정렬출력_3_반별출력_revers {

	public static void main(String[] args) {

//		일반>>>>
//		일반		한다인	98	97	99		294	98	1	1	
//		일반		한마인	97	95	92		284	94	2	2	
//		일반		한사인	78	77	81		236	78	4	3	
//		일반		한나인	68	67	62		197	65	6	4	
//		특기생>>>>
//		특기생	한라인	88	87	89	82	346	86	3	1	
//		특기생	한가인	78	77	79	72	306	76	5	2	
//		특기생	한바인	58	57	59	52	226	56	7	3		

		String[] name = { "한가인", "한나인", "한다인", "한라인", "한마인", "한바인", "한사인" };

		int[][] jum = { { 78, 77, 79, 72 }, { 68, 67, 62 }, { 98, 97, 99 }, { 88, 87, 89, 82 }, { 97, 95, 92 },
				{ 58, 57, 59, 52 }, { 78, 77, 81 } };

		String[] kind = { "일반", "특기생" };

		int[][] kindArr = new int[kind.length][0];

		// 성적계산
		int[][] result = new int[name.length][4]; // [합계, 평균, 전체등수, (분류 등수추가)]

		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				result[i][0] += jum[i][j];
			}
			result[i][1] = result[i][0] / jum[i].length;
		}

		System.out.println(Arrays.deepToString(result));

		// 등수 계산 (분류등수 계산 추가)
		for (int i = 0; i < result.length; i++) {
			result[i][2] = 1;
			result[i][3] = 1;
			for (int j = 0; j < result.length; j++) {
				if (result[i][1] < result[j][1]) {
					result[i][2]++;
					if (jum[i].length == jum[j].length)
						result[i][3]++;
				}

			}
		}

		System.out.println(Arrays.deepToString(result));

		// 종류별 과목의 갯수가 같은 사람들의 인덱스 나누기
		for (int i = 0; i < result.length; i++) {

			int idnex = jum[i].length - 3;

			int[] temp = new int[kindArr[idnex].length + 1];

			for (int k = 0; k < kindArr[idnex].length; k++) {
				temp[k] = kindArr[idnex][k];
			}

			temp[kindArr[idnex].length] = i;
			kindArr[idnex] = temp;
		}

		System.out.println(Arrays.deepToString(kindArr));

		// 출력
		String ban = "";
		for (int i = 0; i < kindArr.length; i++) {

			if (ban != kind[i]) {
				System.out.println(kind[i] + ">>>>");
				ban = kind[i];
			}

			for (int r = 1; r <= kindArr[i].length; r++) {

				String print = kind[i] + "\t";

				for (int j = 0; j < kindArr[i].length; j++) {
					if (r == result[kindArr[i][j]][3]) {

						print += name[kindArr[i][j]] + "\t";

						for (int k : jum[kindArr[i][j]]) {
							print += k + "\t";
						}
						if (i == 0)
							print += "\t";
						for (int k : result[kindArr[i][j]]) {
							print += k + "\t";
						}
						break;
					}
				}
				System.out.println(print);
			}

		}

//		일반>>>>
//		일반		한다인	98	97	99		294	98	1	1	
//		일반		한마인	97	95	92		284	94	2	2	
//		일반		한사인	78	77	81		236	78	4	3	
//		일반		한나인	68	67	62		197	65	6	4	
//		특기생>>>>
//		특기생	한라인	88	87	89	82	346	86	3	1	
//		특기생	한가인	78	77	79	72	306	76	5	2	
//		특기생	한바인	58	57	59	52	226	56	7	3	

	}

}
