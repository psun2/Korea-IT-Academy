//import java.util.Arrays;

public class HomeWork1 {

	public static void main(String[] args) {

		String[][] name; // 배열 생성
		name = new String[3][3]; // 배열 주소 할당
		name = new String[][] { { "김영재", "홍길동", "아무개" }, { "현빈", "원빈", "조빈" }, { "장동건", "장서건", "장남건" } }; // 배열 초기화

		int[][][] studyClass = { { // 1반 => studyClass 의 0번 index (i)
				{ 71, 82, 93 }, // 1번학생 점수 => studyClass 의 0번 index 의 0번 index (j) (j length = 0, 1, 2)
				{ 11, 22, 33 }, // 2번학생 점수
				{ 61, 52, 43 }, // 3번학생 점수
				}, { // 2반
						{ 44, 55, 66 }, // 1번학생 점수
						{ 41, 52, 63 }, // 2번학생 점수
						{ 74, 85, 96 }, // 3번학생 점수
				}, { // 3반
						{ 47, 58, 96 }, // 1번학생 점수
						{ 77, 88, 99 }, // 2번학생 점수
						{ 71, 82, 93 }, // 3번학생 점수
				} };

		int[][][] result = new int[studyClass.length][3][3]; // 총점, 평균, 등수

//		{ // result 
//			{ // result 의 0번 index (i)
//				{총점 X3},{평균 X3},{등수 X3}
//			},
//			{
//				{총점 X3},{평균 X3},{등수 X3}
//			},
//			{
//				{총점 X3},{평균 X3},{등수 X3}
//			}
//		}

		// 기본연산
		for (int i = 0; i < studyClass.length; i++) {
			for (int j = 0; j < studyClass[i].length; j++) {
				for (int k = 0; k < studyClass[i][j].length; k++) {
					result[i][j][0] += studyClass[i][j][k]; // 총점
				}
				result[i][j][1] = result[i][j][0] / studyClass[i][j].length; // 평균
			}
		}

//		System.out.println(Arrays.deepToString(result));

		// 등수계산
		for (int i = 0; i < studyClass.length; i++) { // 등수
			for (int j = 0; j < studyClass[i].length; j++) {
				result[i][j][2] = 1;
				for (int k = 0; k < studyClass[i][j].length; k++) {
					if (result[i][j][1] < result[i][k][1])
						result[i][j][2]++;
				}

			}
		}

//		System.out.println(Arrays.deepToString(result));

		// 출력
		for (int j = 0; j < studyClass.length; j++) {

			System.out.println((j + 1) + " 반");

			System.out.println("이름\t국어\t수학\t영어\t총점\t평균\t등수");

			for (int i = 1; i <= studyClass.length; i++) {

				for (int k = 0; k < studyClass.length; k++) {

					if (result[j][k][2] == i) {

						String res = name[j][k] + "\t"; // 이름 출력

						for (int l = 0; l < studyClass[j][k].length; l++) { // 점수 출력

							res += studyClass[j][k][l] + "\t";
						}

						for (int l = 0; l < result[j][k].length; l++) { // 총점, 평균, 등수 출력

							res += result[j][k][l] + "\t";
						}
						System.out.println(res);
					}

				}

			}
			System.out.println();
		}

//		1 반
//		이름	국어	수학	영어	총점	평균	등수
//		김영재	71	82	93	246	82	1	
//		아무개	61	52	43	156	52	2	
//		홍길동	11	22	33	66	22	3	
//
//		2 반
//		이름	국어	수학	영어	총점	평균	등수
//		조빈	74	85	96	255	85	1	
//		현빈	44	55	66	165	55	2	
//		원빈	41	52	63	156	52	3	
//
//		3 반
//		이름	국어	수학	영어	총점	평균	등수
//		장서건	77	88	99	264	88	1	
//		장남건	71	82	93	246	82	2	
//		장동건	47	58	96	201	67	3	

	}
}