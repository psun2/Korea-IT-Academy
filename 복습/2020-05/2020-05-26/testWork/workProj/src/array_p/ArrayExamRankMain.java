package array_p;

public class ArrayExamRankMain {

	public static void main(String[] args) {

		// 1. 입력부
		String[] name = { "장동건", "장서건", "장남건", "장중건", "북두신건" };
		int[] kor = { 71, 51, 81, 61, 91 };
		int[] eng = { 73, 53, 83, 63, 93 };
		int[] mat = { 79, 58, 82, 64, 92 };

		int[] sum = new int[name.length];
		int[] avg = new int[name.length];
		int[] rank = new int[name.length];

		// 2. 연산부
		// 2. 1 기본연산
		for (int i = 0; i < sum.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = sum[i] / 3;
		}

		// 2. 2 등수 연산
		for (int i = 0; i < avg.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < avg.length; j++) {
				if (avg[i] < avg[j])
					rank[i]++;
			}
		}

		// 3. 출력부
		String[] index = { "가", "가", "가", "가", "가", "가", "양", "미", "우", "수", "수" };
		for (int i = 1; i <= name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if (rank[j] == i) { // j 가 1 일때 i 도 1일때만 true가 되서 결국 랭킹순으로 정렬이 됩니다.//
					String ttt = name[j] + "\t" + kor[j] + "\t" + eng[j] + "\t" + mat[j] + "\t" + sum[j] + "\t" + avg[j]
							+ "\t" + index[avg[j] / 10] + "\t" + rank[j];
					System.out.println(ttt);
				}

			}
		}
	}
}
