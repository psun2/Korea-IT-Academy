package 알고리즘_복습;

import java.util.Arrays;

public class 정렬출력_4_반_등수별출력_revers {

	public static void main(String[] args) {

//		1  반 >>>>>>>
//		1   골빈    	   96  91  91  278 92  1   1
//		1   미스터빈    86  87  81  254 84  2   2
//		1   터빈         86  87  78  251 83  3   3
//		1   원빈         76  77  71  224 74  4   4
//		2  반 >>>>>>>
//		2   투빈         79  77  71  227 75  1   5
//		2   장희빈      66  67  61  194 64  2   6
//		2   젤리빈      66  63  61  190 63  3   7
//		2   현빈         56  57  51  164 54  4   8
//		3  반 >>>>>>>
//		3   김우빈      96  97  91  284 94  1   9
//		3   집이빈      80  87  81  248 82  2   10
//		3   커피빈      56  52  51  159 53  3   11

		String[] name = { "원빈", "현빈", "김우빈", "장희빈", "미스터빈", "투빈", "커피빈", "골빈", "젤리빈", "집이빈", "터빈" };

		int[] ban = { 1, 2, 3, 2, 1, 2, 3, 1, 2, 3, 1 };

		int[][] jum = { { 76, 77, 71 }, { 56, 57, 51 }, { 96, 97, 91 }, { 66, 67, 61 }, { 86, 87, 81 }, { 79, 77, 71 },
				{ 56, 52, 51 }, { 96, 91, 91 }, { 66, 63, 61 }, { 80, 87, 81 }, { 86, 87, 78 } };

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(ban));
		System.out.println(Arrays.deepToString(jum));

		// 합계와 평균
		int[][] result = new int[name.length][0]; // 합계와 평균을 담을 배열

		for (int i = 0; i < jum.length; i++) {

			int[] temp = new int[result[i].length + 2];

			for (int j = 0; j < jum[i].length; j++) {

				temp[result[i].length] += jum[i][j]; // 합계 계산

			}

			temp[result[i].length + 1] = temp[result[i].length] / jum[i].length; // 평균 계산

			result[i] = temp; // 바꿔 치기 작업

		}

		System.out.println(Arrays.deepToString(result));

		// 등수 계산(전교, 반)
		for (int i = 0; i < result.length; i++) {
			int rank = 1;
			int allRank = 1;
			for (int j = 0; j < result.length; j++) {
				if (result[i][1] < result[j][1]) {
					allRank++;
					if (ban[i] == ban[j]) {
						rank++;
					}

				}
			}

			int[] rankTemp = new int[result[i].length + 1];

			for (int k = 0; k < result[i].length; k++) {
				rankTemp[k] = result[i][k];
			}

			rankTemp[result[i].length] = rank;
			result[i] = rankTemp;

			int[] allRankTemp = new int[result[i].length + 1];

			for (int k = 0; k < result[i].length; k++) {
				allRankTemp[k] = result[i][k];
			}

			allRankTemp[result[i].length] = allRank;
			result[i] = allRankTemp;

		}

		System.out.println(Arrays.deepToString(result));

		// 전교등수의 index 와 반등 수의 index를 위치를 바꾸어 주고 싶다면...
		for (int i = 0; i < result.length; i++) {
			int temp;
			temp = result[i][2];
			result[i][2] = result[i][3];
			result[i][3] = temp;
		}

		System.out.println(Arrays.deepToString(result));
//		[[224, 74, 7, 4], [164, 54, 10, 4], [284, 94, 1, 1], [194, 64, 8, 2], [254, 84, 3, 2], [227, 75, 6, 1], [159, 53, 11, 3], [278, 92, 2, 1], [190, 63, 9, 3], [248, 82, 5, 2], [251, 83, 4, 3]]
//		[[224, 74, 4, 7], [164, 54, 4, 10], [284, 94, 1, 1], [194, 64, 2, 8], [254, 84, 2, 3], [227, 75, 1, 6], [159, 53, 3, 11], [278, 92, 1, 2], [190, 63, 3, 9], [248, 82, 2, 5], [251, 83, 3, 4]]

		// 반
		int banMin = 0;
		int banMax = 0;
		for (int i = 0; i < ban.length; i++) {
			for (int j = 0; j < ban.length; j++) {
				if (ban[i] < ban[j]) {
					banMax = ban[j];
					banMin = ban[i];
				}
			}
		}

		System.out.println(banMin); // 1
		System.out.println(banMax); // 3

		// 반
		int[][] index = new int[banMax][0]; // 정렬을 위한 index를 담을 배열

		for (int j = 0; j < ban.length; j++) {

			int[] temp = new int[index[ban[j] - 1].length + 1];

			for (int k = 0; k < index[ban[j] - 1].length; k++) {

				temp[k] = index[ban[j] - 1][k];

			}

			temp[index[ban[j] - 1].length] = j;

			index[ban[j] - 1] = temp;

		}

		System.out.println(Arrays.deepToString(index)); // 같은 반의 index 번호를 모아 놓음.

		// 출력
		int banIndex = 0;

		for (int i = 0; i < index.length; i++) { // 같은 반의 인덱스를 모아놓은 2차 배열을 순회합니다.

			for (int r = 1; r <= index[i].length; r++) { // 각반의 등수는 1등부터 index를 모아놓은 2차배열의 해당 반수만큼 있습니다.

				String print = "";

				for (int j = 0; j < index[i].length; j++) { // 각 반의 index를 순회합니다.

//					if (r == result[index[i][j]][2]) { // 등수 즉 r 이 1일때 result의 index[i][j]][2]
					// 현재 index의[i][j] 라 함은 그 반의 인덱스 번호이고
					// [2] 은 각반의 등수를 나타내는 index 번호 이므로 즉 i는 고정 하고 j를 순회하며 조건이 맞는 경우를
					// 탐색합니다.

					if (r == result[index[i][j]][3]) { // 반등수와 전체등수의 index 가 바뀌어서 출력하는 조건

						if (banIndex != ban[index[i][j]]) {

							print += ban[index[i][j]] + " 반 >>>>\n";

							banIndex = ban[index[i][j]];

						}

						print += ban[index[i][j]] + "반" + "\t" + name[index[i][j]] + "\t";

						for (int k : jum[index[i][j]])

							print += k + "\t";

						for (int k : result[index[i][j]])

							print += k + "\t";

					}
				}

				System.out.println(print);

			}
		}

		// 반등수와 전교 등수 index 차이 비교
//		1 반 >>>>
//		1	골빈		96	91	91	278	92	1	2	
//		1	미스터빈	86	87	81	254	84	2	3	
//		1	터빈		86	87	78	251	83	3	4	
//		1	원빈		76	77	71	224	74	4	7	
//		2 반 >>>>
//		2	투빈		79	77	71	227	75	1	6	
//		2	장희빈	66	67	61	194	64	2	8	
//		2	젤리빈	66	63	61	190	63	3	9	
//		2	현빈		56	57	51	164	54	4	10	
//		3 반 >>>>
//		3	김우빈	96	97	91	284	94	1	1	
//		3	집이빈	80	87	81	248	82	2	5	
//		3	커피빈	56	52	51	159	53	3	11	

		// 반등수와 전교 등수 index 차이 비교
//		1 반 >>>>
//		1	골빈		96	91	91	278	92	2	1	
//		1	미스터빈	86	87	81	254	84	3	2	
//		1	터빈		86	87	78	251	83	4	3	
//		1	원빈		76	77	71	224	74	7	4	
//		2 반 >>>>
//		2	투빈		79	77	71	227	75	6	1	
//		2	장희빈	66	67	61	194	64	8	2	
//		2	젤리빈	66	63	61	190	63	9	3	
//		2	현빈		56	57	51	164	54	10	4	
//		3 반 >>>>
//		3	김우빈	96	97	91	284	94	1	1	
//		3	집이빈	80	87	81	248	82	5	2	
//		3	커피빈	56	52	51	159	53	11	3

	}

}
