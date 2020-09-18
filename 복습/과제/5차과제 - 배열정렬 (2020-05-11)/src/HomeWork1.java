//import java.util.Arrays;

public class HomeWork1 {

	public static void main(String[] args) {

		System.out.println("정렬전");

		String[] name = { "장동건", "장서건", "장남건", "장중건", "북두신건" };
		int[] kor = { 71, 51, 81, 61, 91 };
		int[] eng = { 73, 53, 83, 63, 93 };
		int[] mat = { 79, 58, 82, 64, 92 };

		int[] sum = new int[name.length];
		int[] avg = new int[name.length];
		String[] grade = new String[name.length];

		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = sum[i] / 3;

			switch (avg[i] / 10) {
			case 10:
			case 9:
				grade[i] = "수";
				break;
			case 8:
				grade[i] = "우";
				break;
			case 7:
				grade[i] = "미";
				break;
			case 6:
				grade[i] = "양";
				break;
			default:
				grade[i] = "가";
			}
		}

		for (int i = 0; i < name.length; i++) {
			if (i == 0) {
				System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t등급\n");
			}
			String ttt = name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t" + avg[i] + "\t"
					+ grade[i];
			System.out.println(ttt);
		}

//		System.out.println(Arrays.toString(avg));

		// 평균을 이용하여 점수가 높은 순서대로 출력 등급계산 [과제]
		
		System.out.println("\n정렬후");

		int[] sort = new int[name.length];
		for (int i = 0; i < avg.length; i++) {
			sort[i] = avg[i];
		}

		for (int i = 0; i < avg.length; i++) {
			int a = 0;
			for (int j = i + 1; j < avg.length; j++) {
				if (sort[i] < sort[j]) {
					a = sort[i];
					sort[i] = sort[j];
					sort[j] = a;
				}
			}
		}

		int[] sortIndex = new int[sort.length];
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length; j++) {
				if (sort[i] == avg[j]) {
					sortIndex[i] = j;
				}
			}
		}

//		System.out.println(Arrays.toString(sortIndex));
		
		for (int i = 0; i < name.length; i++) {
			if (i == 0) {
				System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t등급\n");
			}
			String ttt = name[sortIndex[i]] + "\t" + kor[sortIndex[i]] + "\t" + eng[sortIndex[i]] + "\t" + mat[sortIndex[i]] + "\t" + sum[sortIndex[i]] + "\t" + avg[sortIndex[i]] + "\t"
					+ grade[sortIndex[i]];
			System.out.println(ttt);
		}

	}
}