package array_p;

import java.util.Arrays;

public class MulExamMain2 {

	public static void main(String[] args) {

		String[] name = { "원빈", "현빈", "김우빈", "장희빈", "미스터빈", "투빈", "커피빈", "골빈", "젤리빈", "집이빈", "터빈" };

		int[] ban = { 1, 2, 3, 2, 1, 2, 3, 1, 2, 3, 1 };

		int[][] jum = { { 76, 77, 71 }, { 56, 57, 51 }, { 96, 97, 91 }, { 66, 67, 61 }, { 86, 87, 81 }, { 79, 77, 71 },
				{ 56, 52, 51 }, { 96, 91, 91 }, { 66, 63, 61 }, { 80, 87, 81 }, { 86, 87, 78 } };

		System.out.println(name.length);
		System.out.println(ban.length);

		int[][] res = new int[name.length][4];
		// 0 - 총점, 1-평균, 2-등수, 3-자리

		// 7. 반별 등수 출력을 위한 몇개의 반인지 알아보기
		int banMax = 0; // 7. 반별 등수 출력을 위한 몇개의 반인지 알아보기
		// 1. 총점 계산
		for (int i = 0; i < jum.length; i++) {
			if (banMax < ban[i]) // 7. 반별 등수 출력을 위한 몇개의 반인지 알아보기
				banMax = ban[i];
			for (int j = 0; j < jum[i].length; j++) {
				res[i][0] += jum[i][j];
			}
			// 2. 평균 계산
			res[i][1] = res[i][0] / jum[i].length;
		}

		System.out.println("총점, 평균" + Arrays.deepToString(res));

		// 8 - 1. 반별 등수 출력을 위한 반 배열 생성
		int[] banCnt = new int[banMax + 1]; // 8 - 1. 반별 등수 출력을 위한 반 배열 생성 0반은 없으므로 + 1 을하여 1반 부터 시작 할 수 있도록

		// 3. 등수 계산
		for (int i = 0; i < res.length; i++) {
			// 8 - 1. 반별 등수 출력을 위한 반 별 인원 수 체크
			banCnt[ban[i]]++; // ban[i] 즉 i가 늘어날때 각 반이 들어온다 1 ~ 3 반 그럼 반 Cnt의 갯수 즉 1반인때 반 Cnt의 1번인덱스인 1반이 1증가
			res[i][2] = 1;
			for (int j = 0; j < res.length; j++) {
//				if (res[i][1] < res[j][1])
				// 8 - 2. 반별 등수 출력을 위한 등수 조건 변경
				if (res[i][1] < res[j][1] && ban[i] == ban[j]) // 8 - 2. 반별 등수 출력을 위한 등수 조건 변경
					res[i][2]++;
			}
		}

		System.out.println("등수" + Arrays.deepToString(res));

		System.out.println(Arrays.toString(banCnt));
		// 9 자리계산
		// 1반의 1등은 position 이 맨위인 1번 입니다.
		// 2반의 1등은 성적 + 전의 반들의 반 인원수 입니다. ex) 2반의 1등은 1반의 학생들 바로 아래 위치합니다.
		for (int i = 0; i < res.length; i++) {
			res[i][3] = res[i][2];
			for (int j = 1; j < ban[i]; j++) {
				res[i][3] += banCnt[j];
			}
		}
		System.out.println(Arrays.toString(banCnt));

		System.out.println("============================전체 등수 출력============================");
		// 6. 등수 별 출력
		for (int r = 1; r <= name.length; r++) {
			// 4. 출력
			for (int i = 0; i < name.length; i++) {
				if (r == res[i][2]) { // 6. 등수 별 출력
					// 5. 반출력
					System.out.print(ban[i] + " 반\t"); // 5. 반출력
					String print = name[i] + "\t";
					for (int j = 0; j < jum[i].length; j++) {
						print += jum[i][j] + "\t";
					}
					for (int j = 0; j < res[i].length; j++) {
						print += res[i][j] + "\t";
					}
					System.out.println(print);
				}
			}
		}

		System.out.println("==================================================================");
		System.out.println();
		System.out.println("============================반별 　　 출력============================");
		// 6. 등수 별 출력
		for (int r = 1; r <= name.length; r++) {
			// 4. 출력
			for (int i = 0; i < name.length; i++) {
				if (r == ban[i]) { // 6. 등수 별 출력
					// 5. 반출력
					System.out.print(ban[i] + " 반\t"); // 5. 반출력
					String print = name[i] + "\t";
					for (int j = 0; j < jum[i].length; j++) {
						print += jum[i][j] + "\t";
					}
					for (int j = 0; j < res[i].length; j++) {
						print += res[i][j] + "\t";
					}
					System.out.println(print);
				}
			}
		}

		System.out.println("==================================================================");
		System.out.println();
		System.out.println("============================반별 등수 출력============================");
		// 6. 등수 별 출력
		for (int r = 1; r <= name.length; r++) {
			// 4. 출력
			for (int i = 0; i < name.length; i++) {
//				if (r == res[i][2]) { // 6. 등수 별 출력
				if (r == res[i][3]) { // 10. 반 별 등수 별로 출력하기 위해 조건을 위에 8, 9 에서 구한 positio으로 잡아줍니다.
					// 5. 반출력
					System.out.print(ban[i] + " 반\t"); // 5. 반출력
					String print = name[i] + "\t";
					for (int j = 0; j < jum[i].length; j++) {
						print += jum[i][j] + "\t";
					}
					for (int j = 0; j < res[i].length; j++) {
						print += res[i][j] + "\t";
					}
					System.out.println(print);
				}
			}
		}

		System.out.println("==================================================================");
		System.out.println();
		System.out.println("===========================반별 타이틀 출력===========================");
		int banIndex = 0; // 11. 반 타이틀을 출력하기 위한 변수를 설정합니다.
		// 6. 등수 별 출력
		for (int r = 1; r <= name.length; r++) {
			// 4. 출력
			for (int i = 0; i < name.length; i++) {
//				if (r == res[i][2]) { // 6. 등수 별 출력
				if (r == res[i][3]) { // 10. 반 별 등수 별로 출력하기 위해 조건을 위에 8, 9 에서 구한 positio으로 잡아줍니다.
					if (banIndex != ban[i]) { // 11. 반 타이틀을 출력하기 위해 생성한 변수 와 반 배열을 받아 반이 일치 하지 않을 때 즉 반이 바뀔때마다 처음 한번은 계속
												// 일치 하지 않게 조건식을 짭니다.
						banIndex = ban[i]; // 11. 반 타이틀을 출력하기 위해 처음 한번 조건이 만족하면 현재의 반으로 변경합니다.
						System.out.println(banIndex + "  반 >>>>>>>");
					}
					// 5. 반출력
					System.out.print(ban[i] + " 반\t"); // 5. 반출력
					String print = name[i] + "\t";
					for (int j = 0; j < jum[i].length; j++) {
						print += jum[i][j] + "\t";
					}
					for (int j = 0; j < res[i].length; j++) {
						print += res[i][j] + "\t";
					}
					System.out.println(print);
				}
			}
		}

		System.out.println("==================================================================");
	}
}
