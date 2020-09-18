import java.util.Arrays;

class Student {
	int ban; // 학생 반
	String name, gender; // 학생 이름
	int[] jum, result, rank; // jum = 국,영, 수 // result = 총점, 평균, rank = 반등수, 전체등수

	// 맴버 변수 ban 과 name 의 초기화 메소드
	void init(int ban, String name, String gender) {
		this.ban = ban;
		this.name = name;
		this.gender = gender;
	}

	// 점수를 입력 받는 메소드
	void jumInit(int kor, int eng, int math) {
		this.jum = new int[] { kor, eng, math };
	}

	// 총점과 평균을 구해주는 메소드
	void sumAvg() {
		this.result = new int[0];
		int[] temp = new int[this.result.length + 1];
		for (int i : this.jum) {
			temp[this.result.length] += i;
		}

		this.result = temp;

		int[] temp2 = new int[this.result.length + 1];
		for (int i = 0; i < this.result.length; i++) {
			temp2[i] = this.result[i];
		}
		temp2[this.result.length] = this.result[this.result.length - 1] / this.jum.length;

		this.result = temp2;

	}

	// 정보 출력 메소드
	void print() {
		String result = ban + "반" + "\t" + gender + "\t" + name + "\t";
		for (int i : this.jum) {
			result += i + "\t";
		}
		for (int i : this.result) {
			result += i + "\t";
		}
		for (int i : this.rank) {
			result += i + "\t";
		}

		System.out.println(result);
	}

}

public class HomeWork_Student {

	public static void main(String[] args) {

		//// 학생클래스를 정의, 선언, 생성, 호출 하여 학생정보를 출력하세요

		// --- 반, 이름, 성별, 점수 [국어, 영어, 수학], 총점, 평균, 등수

		String[] name = { "한가인", "한나인", "한다인", "한라인", "한마인", "한바인", "한사인", "한아인", "한자인", "한차인" };

		String[] gender = { "남", "여", "남", "여", "남", "여", "남", "여", "남", "여" };

//		int[] ban = { 1, 2, 3, 3, 2, 1, 2, 3, 1, 2 };

		Student[] student = new Student[name.length];

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student(); // 인스턴스 생성
			int banNo = (int) (Math.random() * 3 + 1); // 랜덤한 반 설정
			student[i].init(banNo, name[i], gender[i]); // 학생의 이름 과 반 맴버 변수 초기화
			int kor = (int) (Math.random() * 100 + 1); // 랜덤한 국어점수
			int eng = (int) (Math.random() * 100 + 1); // 랜덤한 영어 점수
			int math = (int) (Math.random() * 100 + 1); // 랜덤한 수학 점수
			student[i].jumInit(kor, eng, math); // jum 메소드를 이용하여 점수를 받습니다.
			student[i].sumAvg(); // sumAvg 메소드를 사용하여, 학생의 총점과 평균을 구합니다.
		}

		// 반 등수와 전체 등수
		for (int i = 0; i < student.length; i++) {
			student[i].rank = new int[0];
			int allRank = 1; // 전체 등수를 매기기 위한 값
			int rank = 1; // 반 등수를 매기기 위한 값
			for (int j = 0; j < student.length; j++) {
				if (student[i].result[1] < student[j].result[1]) {
					allRank++;
					if (student[i].ban == student[j].ban)
						rank++;
				}
			}
			int[] temp = new int[student[i].rank.length + 1];
			for (int j = 0; j < student[i].rank.length; j++) {
				temp[j] = student[i].rank[j];
			}
			temp[student[i].rank.length] = rank;
			student[i].rank = temp;

			int[] temp2 = new int[student[i].rank.length + 1];
			for (int j = 0; j < student[i].rank.length; j++) {
				temp2[j] = student[i].rank[j];
			}
			temp2[student[i].rank.length] = allRank;
			student[i].rank = temp2;
		}

		// 첫반과 끝반
		int banMax = 0; // 끝 반
		int banMin = 0; // 첫 반
		for (int i = 0; i < student.length; i++) {
			if (banMax < student[i].ban) {
				banMax = student[i].ban;
			} else {
				banMin = student[i].ban;
			}
		}

//		System.out.println(banMin);

		// 반이 같은 사람의 index를 알아내기
		int[][] banArr = new int[banMax][0];
		for (int i = 0; i < student.length; i++) {
			int index = student[i].ban - 1;
			int[] temp = new int[banArr[index].length + 1];
			for (int j = 0; j < banArr[index].length; j++) {
				temp[j] = banArr[index][j];
			}
			temp[banArr[index].length] = i;
			banArr[index] = temp;
		}

//		System.out.println(Arrays.deepToString(banArr));

		// 출력
		int banIndex = 0;
		for (int i = 0; i < banArr.length; i++) {
			if (banIndex == 0)
				System.out.println("반\t이름\t국어\t영어\t수학\t총점\t평균\t반 석차\t전교석차\t");
			for (int j = 1; j <= banArr[i].length; j++) { // 등수
				for (int j2 = 0; j2 < banArr[i].length; j2++) { // 같은반의 등수 비교
					if (banIndex != student[banArr[i][j2]].ban) {
						System.out.println(student[banArr[i][j2]].ban + "반 >>>>>");
						banIndex = student[banArr[i][j2]].ban;
					}
					if (student[banArr[i][j2]].rank[0] == j)
						student[banArr[i][j2]].print();
				}
			}
		}

//		반	이름	국어	영어	수학	총점	평균	반 석차	전교석차	
//		1반 >>>>>
//		1반	여	한라인	86	50	62	198	66	1	3	
//		1반	남	한가인	16	41	53	110	36	2	8	
//		1반	여	한바인	10	71	10	91	30	3	9	
//		2반 >>>>>
//		2반	남	한사인	81	64	70	215	71	1	2	
//		2반	남	한마인	62	73	54	189	63	2	4	
//		2반	여	한차인	34	67	46	147	49	3	5	
//		2반	남	한자인	12	21	12	45	15	4	10	
//		3반 >>>>>
//		3반	여	한나인	98	87	90	275	91	1	1	
//		3반	여	한아인	10	77	49	136	45	2	6	
//		3반	남	한다인	85	28	2	115	38	3	7

	}
}