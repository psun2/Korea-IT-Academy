package array_p;

import java.util.Arrays;

public class MulAddrExamMain {

	public static void main(String[] args) {

		String[] name = { "한가인", "한나인", "한다인", "한라인", "한마인", "한바인", "한사인" };

		int[][] jum = { { 78, 77, 79, 72 }, { 68, 67, 62 }, { 98, 97, 99 }, { 88, 87, 89, 82 }, { 97, 95, 92 },
				{ 58, 57, 59, 52 }, { 78, 77, 81 } };

		// 0- 총점, 1- 평균, 2- 전체등수, 3- 분류등수
		int[][] res = new int[jum.length][4];
//		{	// res 배열의 구조
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0},	//
//			{0, 0, 0, 0}	//
//			
//		}
		System.out.println("res 배열의 구조" + Arrays.deepToString(res));
		System.out.println();

		/// 분류별로 나누어 출력하세요
		//// 분류별 등수를 출력하세요
		String[] kind = { "일반", "특기생" };
		int[][] kindArr = new int[kind.length][0];

		// 총점과 평균을 res 배열에 삽입 하기
		for (int i = 0; i < res.length; i++) {
			int sum = 0; // 합계를 저장할 배열 생성
			for (int j = 0; j < jum[i].length; j++) {
				sum += jum[i][j];
			}
			res[i][0] = sum; // res의 i번째index 배열에 0번 인덱스에 jum 의 i번째 인덱스를 돌며 저장했던 sum 값을 부여해줍니다.
			res[i][1] = res[i][0] / jum[i].length; // 합계를 jum의 i번째 인덱스 배열의 길이로 나누어 줍니다.

			int separate = jum[i].length - 3; // 특기생과 일반생을 나누기 위해 과목 갯수를 기준으로 잡습니다.
			int[] separateArr = new int[kindArr[separate].length + 1]; // 복제할 새로운 배열을 생성합니다.
			for (int j = 0; j < kindArr[separate].length; j++) { // 분류하기 위한 반복문 입니다.
				separateArr[j] = kindArr[separate][j];
			}
			separateArr[kindArr[separate].length] = i; // separate 를 기준으로 0일때와 1일때를 가려가며, 현재의 i를 삽입합니다.
			kindArr[separate] = separateArr; // 최종적으로 [일반생 indexs][특기생 indexs] // 특기생이 아닐시 0이기 때문에 kindArr에는 일반생의 index가
												// 추가 됩니다.
		}

		System.out.println("res 배열의 총첨 과 평균" + Arrays.deepToString(res));
		System.out.println("kindArr 일반생과 특기생의 분류" + Arrays.deepToString(kindArr));
		System.out.println();

		// 등수 정해 주기
		for (int i = 0; i < res.length; i++) { // res는 2차원 배열이르모 기본적으로 for문이 무조건 두번 사용 됩니다.
			res[i][2] = 1; // 반등수 입니다. 0등은 없기 때문에 초기값을 1로 설정합니다.
			res[i][3] = 1; // 전체등수 입니다. 0등은 없기 때문에 초기값을 1로 설정합니다.
			for (int j = 0; j < res.length; j++) { // res는 2차원 배열이르모 기본적으로 for문이 무조건 두번 사용 됩니다.
				if (res[i][1] < res[j][1]) { // 등수를 정해주기위해 배열을 순회하며 본인과 다음 원소를 비교해 나갑니다.
					res[i][3]++; // 다음에 오는 값이 더 크다면 즉, 본인보다 다음배열의 평균 점수가 더 높다면 내 등수는 1씩 밀립니다.
									// 등수가 1씩 밀리기 때문에 ++을 해주어 등수를 늘려나가며, 1등은 ++을 할것이 없기때문에 최종적으로 1만 리턴합니다.

					// 분류별 등수 출력
					// 이문제에서는 2가지 case밖에 없지만, 2가지 case에서 다른점은 과목점수의 갯수입니다.
					// 즉 특별전형의 과목 갯수는 4개이고, 일반전형의 과목은 3개 입니다.
					if (jum[i].length == jum[j].length) // 펼균 점수를 비교하면서 분류가 같다면
						res[i][2]++; // 즉 과목수의 길이가 같다면 같은 반이므로, ++ 해주어 등 수 를 늘려 나갑니다.
				}
			}
		}

		System.out.println("res 배열의 등수" + Arrays.deepToString(res));
		System.out.println();

		// 출력
////		for (int i = 0; i < kind.length; i++) { // 특기생과 일반생을 정렬하여 출력하기 위한 반복문
//		// 반 등수대로 출력한다면, 특기생과 일반생이 저절로 나뉠것이며, 조건수정
//		for (int i = 0; i < kindArr.length; i++) { // 특기생과 일반생을 정렬하여 출력하기 위한 반복문
//			System.out.println(kind[i] + ">>>>");
//			for (int r = 1; r <= kindArr[i].length; r++) { // 반등수에 따라 정렬하기 위한 조건문
////				for (int j = 0; j < name.length; j++) { // 각 학생을 출력하기 위한 반복문
//				// 정렬을 등수별로 하기 위한 조건 수정
//				for (int j = 0; j < kindArr[i].length; j++) { // 각 학생을 출력하기 위한 반복문
////					String print = kind[i] + "\t" + name[j] + "\t";
////					int ban = jum[j].length - 3;
////					if (i == ban) { // 반의 정렬에 따라 출력하기 위한 조건문
//					// 정렬을 등수별로 하기 위한 조건 수정
//					int a = kindArr[i][j]; // i즉 첫 루프에는 i가 0 입니다.
////					0번 index의 배열에는 일반생들의 index 번호가 들어 있습니다.
//					if (r == res[a][2]) { // 즉 a = 일반생들의 index 번호 이고 2은 반 등수 입니다.
////						반복 문에서 r은  kindArr[i] 까지 반복 하기 때문에 
////						String print = kind[i] + "\t" + name[j] + "\t";
////						a가 분류별 index 번호 이므로 a로 교체하여 이름을 뽑을수 있도록 합니다.
//						String print = kind[i] + "\t" + name[a] + "\t";
//						for (int k = 0; k < jum[j].length; k++) { // 점수 출력을 위한 반복문
////							print += jum[j][k] + "\t";
//							print += jum[a][k] + "\t";
//						}
////						for (int k : jum[a]) {
////							print += a + "\t";
////						}
//
//						if (jum[j].length == 3) // 과목수가 다르기 때문에 출력시 길이가 달라 탭을 줌으로써 길이를 맞추는 조건문
//							print += "\t";
//
//						for (int k : res[j]) { // 총점, 평균, 반등수, 전체 등수를 출력하는 반복문
//							print += k + "\t";
//						}
//						System.out.println(print);
//					}
//				}
//			}
//		}

		/// 출력
		for (int p = 0; p < kindArr.length; p++) {
			System.out.println(kind[p] + ">>>>");
			// 등수
			for (int r = 1; r <= kindArr[p].length; r++) {

				// 사람
				for (int k = 0; k < kindArr[p].length; k++) {
					int i = kindArr[p][k];

					if (r == res[i][2]) {

						int pos = jum[i].length - 3;

						String ttt = kind[pos] + "\t" + name[i] + "\t";
						for (int j : jum[i]) {
							ttt += j + "\t";
						}

						if (pos == 0)
							ttt += "\t";

						for (int j : res[i]) {
							ttt += j + "\t";
						}
						System.out.println(ttt);
					}
				}
			}
		}
	}

}
