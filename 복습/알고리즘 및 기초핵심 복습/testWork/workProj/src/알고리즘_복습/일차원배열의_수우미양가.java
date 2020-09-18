package 알고리즘_복습;

import java.util.Arrays;

public class 일차원배열의_수우미양가 {

	public static void main(String[] args) {

		// 등수별로 정렬하고
		// 평균이 100에서 ~ 90 까진 수
		// 10점단위로 수우미양가 출력

//		북두신건    91  93  92  276 92  수
//		장남건  81  83  82  246 82  우
//		장동건  71  73  79  223 74  미
//		장중건  61  63  64  188 62  양
//		장서건  51  53  58  162 54  가

		String[] name = { "장동건", "장서건", "장남건", "장중건", "북두신건" };

		int[] kor = { 71, 51, 81, 61, 91 };
		int[] eng = { 73, 53, 83, 63, 93 };
		int[] mat = { 79, 58, 82, 64, 92 };

		int[] sum = new int[name.length];
		int[] avg = new int[name.length];

		for (int i = 0; i < name.length; i++) {
			sum[i] += kor[i] + eng[i] + mat[i];
			avg[i] = sum[i] / 3;
		}

		System.out.println("총점배열 : " + Arrays.toString(sum) + ", 평균배열 : " + Arrays.toString(avg));

		int[] avgClone = avg.clone(); // 값을 정렬된 순서대로 바꿀수 있게 배열을 생성합니다.
		// 원본 배열은 index의 번호 때문에 건들지 않습니다.

		for (int i = 0; i < avgClone.length; i++) {
			int temp;
			for (int j = i + 1; j < avgClone.length; j++) {
				if (avgClone[i] < avgClone[j]) {
					temp = avgClone[i];
					avgClone[i] = avgClone[j];
					avgClone[j] = temp;
				}

			}
		}

		System.out.println("평균배열 : " + Arrays.toString(avg) + ", 정렬된 평균배열 : " + Arrays.toString(avgClone));

		// 새로운 변수 생성없이 정렬된 평균 배열을 이용하여, 정렬된 평균배열에 정렬전의 index번호를 담아 옵니다.

		for (int i = 0; i < avgClone.length; i++) {
			for (int j = 0; j < avg.length; j++) {
				if (avgClone[i] == avg[j]) // 점수가 같다면 ?
					avgClone[i] = j; // 인덱스를 가져옵니다.
			}
		}

		System.out.println("점수를 활용하여 정렬된 상태에서 정렬전의 index번호: " + Arrays.toString(avgClone));

		// 출력
		String[] grade = { "가", "가", "가", "가", "가", "가", "양", "미", "우", "수", "수" }; // 수, 우, 미, 양, 가 출력을 위한 배열 생성
		for (int i = 0; i < name.length; i++) {
			String print = name[avgClone[i]] + "\t" + kor[avgClone[i]] + "\t" + eng[avgClone[i]] + "\t"
					+ mat[avgClone[i]] + "\t" + sum[avgClone[i]] + "\t" + avg[avgClone[i]] + "\t"
					+ grade[avg[avgClone[i]] / 10];
			System.out.println(print);
		}

//		북두신건	91	93	92	276	92	수
//		장남건	81	83	82	246	82	우
//		장동건	71	73	79	223	74	미
//		장중건	61	63	64	188	62	양
//		장서건	51	53	58	162	54	가

	}

}
