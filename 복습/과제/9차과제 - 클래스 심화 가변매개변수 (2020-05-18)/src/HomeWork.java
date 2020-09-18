import java.util.Arrays;

class Student {

	final int Separation = 3;

	String name, kind;

	int[] jum, rank;

	int tot, avg, ban;

	void init(String name, int ban, int... jum) { // int... jum => rest parameter(?)

		this.name = name;

//			┌ ✔ String[] kind = { "일반", "특기생" };
//			┣ ✔ this.kind = kind[jum.length - Separation];
//			│
//			└ ✔  주석처리 된 2줄을 익명형식의 배열(?) 의 index 값으로 맴버 변수를 초기화 할수 있으며, 코드의 줄수를 줄여 줄수 있습니다.
		this.kind = new String[] { "일반", "특기생" }[jum.length - Separation];

		this.ban = ban;

//			✔  rest parameter(?) 로 받아온 jum 배열을 this.jum 배열과 값을 바꾸어 줍니다.
		this.jum = jum; //

		for (int i : jum)
			tot += i;

		avg = tot / jum.length;

	}

	void rank(Student... arr) { // 등수 구하는 메소드

		this.rank = new int[4];
		for (int i = 0; i < rank.length; i++) {
			this.rank[i] = 1;
		}

//			rank[0] = 1; // 전체등수
//			rank[1] = 1; // 반등수
//			rank[2] = 1; // 분류 등수
//			rank[3] = 1; // 반 과  분류 가 같을때 등수

		for (int i = 0; i < arr.length; i++) {
			if (this.avg < arr[i].avg) {
				this.rank[0]++;
				if (this.ban == arr[i].ban)
					this.rank[1]++;
				if (this.kind == arr[i].kind)
					this.rank[2]++;
				if (this.ban == arr[i].ban && this.kind == arr[i].kind)
					this.rank[3]++;
			}
		}

	}

	void show() { // 출력 메소드
		String result = ban + "\t" + kind + "\t" + name + "\t";
		for (int i : jum)
			result += i + "\t";
		if (kind.equalsIgnoreCase("일반"))
			// || if (kind.equals("일반")) || if(jum.length == Separation) || if(kind == "일반")
			// ✔ uqals 대소문자를 구분하여 argument 로 보내준 문자열과 일치하는지 여부를 확인하는 함수 입니다.
			// ✔ equalsIgnoreCase 대소문자를 구분하지 않고 argument 로 보내준 문자열과 일치하는지 여부를 확인하는 함수 입니다.
			result += "\t";
		result += tot + "\t" + avg + "\t";
		for (int i : rank)
			result += i + "\t";
		System.out.println(result);
	}
}

class MakeStudent {

	Student create(String name, int ban, int... jum) { // 반환형이 Student 형태의 메소드 생성

		Student result = new Student(); // Student 의 인스턴스 생성
		result.init(name, ban, jum); // 인스턴스 생성과 동시에 Student 클래스의 맴버 변수를 초기화 하는 메소드를 호출 합니다.
		return result; // 맴버변수를 초기화한 상태로 return 합니다.
	}

}

public class HomeWork {

	public static void main(String[] args) {

		MakeStudent make = new MakeStudent();

		Student[] student = {
				make.create("일가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("이가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("삼가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("사가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("오가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("육가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("칠가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("팔가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("구가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101)),
				make.create("십가인", (int) (Math.random() * 3 + 1), (int) (Math.random() * 101),
						(int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101)) };

		for (Student st : student)
			st.rank(student);

		// 1. 전체 등수 정렬 출력
		System.out.println("전체등수");
		System.out.println("반\t분류\t이름\t국어\t영어\t수학\t특기\t총점\t평균\t전체등수\t반등수\t분류등수\t반에서의 분류등수");
		for (int i = 1; i <= student.length; i++) {
			for (Student stu : student) {
				if (stu.rank[0] == i)
					stu.show();
			}
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");

		// 2. 총원 중에서 분류가 같으면서 분류끼리의 등수로 정렬
		// 2-1 분류가 몇종류 인지...
		String[] cloneKind = new String[student.length];
		for (int i = 0; i < student.length; i++) {
			cloneKind[i] = student[i].kind;
		}

//		System.out.println(Arrays.toString(cloneKind));

		String[] kind = new String[0];
		for (int i = 0; i < student.length; i++) {
			String temp = "";
			for (int j = 0; j < cloneKind.length; j++) {
				if (student[i].kind == cloneKind[j]) {
					temp = cloneKind[j];
					cloneKind[j] = "";
				}
			}
			if (temp != "") {
				String[] temp2 = new String[kind.length + 1];
				for (int k = 0; k < kind.length; k++) {
					temp2[k] = kind[k];
				}
				temp2[kind.length] = student[i].kind;
				kind = temp2;
			}
			temp = "";
		}

//		System.out.println(Arrays.toString(kind)); // [일반, 특기생] - 2종류

		// 2-2 2차원 배열에 각각 분류에 따른 index번호 추출
		int[][] kindIndex = new int[kind.length][0];
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < student.length; j++) {
				if (kind[i] == student[j].kind) {
					int[] temp = new int[kindIndex[i].length + 1];
					for (int k = 0; k < kindIndex[i].length; k++) {
						temp[k] = kindIndex[i][k];
					}
					temp[kindIndex[i].length] = j;
					kindIndex[i] = temp;
				}
			}
		}

//		System.out.println(Arrays.deepToString(kindIndex)); // [[일반 학생의 index번호],[특기생의 index번호]]

		// 분류별 정렬 출력
		System.out.println("분류등수");
		System.out.println("반\t분류\t이름\t국어\t영어\t수학\t특기\t총점\t평균\t전체등수\t반등수\t분류등수\t반에서의 분류등수");
		for (int i = 0; i < kindIndex.length; i++) {
			for (int j = 1; j <= kindIndex[i].length; j++) {
				for (int j2 = 0; j2 < kindIndex[i].length; j2++) {
					if (j == student[kindIndex[i][j2]].rank[2])
						student[kindIndex[i][j2]].show();
				}
			}
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");

		// 3. 반 등수별 정렬 (한 반당 인원수 ?)
		// 3-1 반은 몇반까지 있는가..
		int banMax = 0;
		int banMin = 0;
		for (Student st : student) {
			if (st.ban > banMax) {
				banMax = st.ban;
			}
			if (banMin == 0)
				banMin = banMax;
			if (banMin > st.ban)
				banMin = st.ban;
		}

//		System.out.println(banMax + ", " + banMin); // 3, 1

		// 3-2 반별 인원 index 번호 추출
		int[][] banIndex = new int[banMax][0];
		for (int i = 0; i < student.length; i++) {
			int[] temp = new int[banIndex[student[i].ban - banMin].length + 1];
			for (int j = 0; j < banIndex[student[i].ban - banMin].length; j++) {
				temp[j] = banIndex[student[i].ban - banMin][j];
			}
			temp[banIndex[student[i].ban - banMin].length] = i;
			banIndex[student[i].ban - banMin] = temp;
		}

//		System.out.println(Arrays.deepToString(banIndex));

		// 출력
		System.out.println("반등수");
		System.out.println("반\t분류\t이름\t국어\t영어\t수학\t특기\t총점\t평균\t전체등수\t반등수\t분류등수\t반에서의 분류등수");
		for (int i = 0; i < banIndex.length; i++) {
			for (int j = 1; j <= banIndex[i].length; j++) {
				for (int k = 0; k < banIndex[i].length; k++) {
					if (j == student[banIndex[i][k]].rank[1])
						student[banIndex[i][k]].show();
				}
			}
		}

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");

		// 4. 반 에서 분류별로의 등수정렬
		// 4-1 같은 반에서 같은 부류 index 번호 추출
		int[][][] banKindIndex = new int[banMax][kind.length][0];

		for (int i = 0; i < banIndex.length; i++) {
			for (int j = 0; j < kind.length; j++) {
				for (int j2 = 0; j2 < banIndex[i].length; j2++) {
					if (kind[j] == student[banIndex[i][j2]].kind) {
						int[] temp = new int[banKindIndex[i][j].length + 1];
						for (int k = 0; k < banKindIndex[i][j].length; k++) {
							temp[k] = banKindIndex[i][j][k];
						}
						temp[banKindIndex[i][j].length] = banIndex[i][j2];
						banKindIndex[i][j] = temp;
					}

				}
			}
		}

//		System.out.println(Arrays.deepToString(banKindIndex)); // [[[4], [1, 7]], [[0, 2], [3, 5]], [[6, 8], [9]]]

		// 출력
		System.out.println("반 에서 분류별 등수");
		System.out.println("반\t분류\t이름\t국어\t영어\t수학\t특기\t총점\t평균\t전체등수\t반등수\t분류등수\t반에서의 분류등수");
		for (int i = 0; i < banKindIndex.length; i++) {
			for (int j = 0; j < banKindIndex[i].length; j++) {
				for (int j2 = 1; j2 <= banKindIndex[i][j].length; j2++) {
					for (int k = 0; k < banKindIndex[i][j].length; k++) {
						if (j2 == student[banKindIndex[i][j][k]].rank[3])
							student[banKindIndex[i][j][k]].show();
					}
				}
			}
		}

//		전체등수
//		반	분류		이름		국어	영어	수학	특기	총점	평균	전체등수	반등수	분류등수	반에서의 분류등수
//		3	특기생	사가인	55	83	59	87	284	71	1		1		1		1	
//		1	일반		구가인	75	92	8		175	58	2		1		1		1	
//		1	일반		칠가인	17	79	77		173	57	3		2		2		2	
//		2	일반		일가인	63	83	0		146	48	4		1		3		1	
//		2	특기생	이가인	81	17	78	5	181	45	5		2		2		1	
//		2	일반		삼가인	83	24	17		124	41	6		3		4		2	
//		2	특기생	팔가인	80	47	24	5	156	39	7		4		3		2	
//		3	특기생	십가인	8	12	66	64	150	37	8		2		4		2	
//		3	일반		오가인	58	10	12		80	26	9		3		5		1	
//		1	특기생	육가인	12	0	56	13	81	20	10		3		5		1	
//		--------------------------------------------------------------------------------------------------------------------
//		분류등수
//		반	분류		이름		국어	영어	수학	특기	총점	평균	전체등수	반등수	분류등수	반에서의 분류등수
//		1	일반		구가인	75	92	8		175	58	2		1		1		1	
//		1	일반		칠가인	17	79	77		173	57	3		2		2		2	
//		2	일반		일가인	63	83	0		146	48	4		1		3		1	
//		2	일반		삼가인	83	24	17		124	41	6		3		4		2	
//		3	일반		오가인	58	10	12		80	26	9		3		5		1	
//		3	특기생	사가인	55	83	59	87	284	71	1		1		1		1	
//		2	특기생	이가인	81	17	78	5	181	45	5		2		2		1	
//		2	특기생	팔가인	80	47	24	5	156	39	7		4		3		2	
//		3	특기생	십가인	8	12	66	64	150	37	8		2		4		2	
//		1	특기생	육가인	12	0	56	13	81	20	10		3		5		1	
//		--------------------------------------------------------------------------------------------------------------------
//		반등수
//		반	분류		이름		국어	영어	수학	특기	총점	평균	전체등수	반등수	분류등수	반에서의 분류등수
//		1	일반		구가인	75	92	8		175	58	2		1		1		1	
//		1	일반		칠가인	17	79	77		173	57	3		2		2		2	
//		1	특기생	육가인	12	0	56	13	81	20	10		3		5		1	
//		2	일반		일가인	63	83	0		146	48	4		1		3		1	
//		2	특기생	이가인	81	17	78	5	181	45	5		2		2		1	
//		2	일반		삼가인	83	24	17		124	41	6		3		4		2	
//		2	특기생	팔가인	80	47	24	5	156	39	7		4		3		2	
//		3	특기생	사가인	55	83	59	87	284	71	1		1		1		1	
//		3	특기생	십가인	8	12	66	64	150	37	8		2		4		2	
//		3	일반		오가인	58	10	12		80	26	9		3		5		1	
//		--------------------------------------------------------------------------------------------------------------------
//		반 에서 분류별 등수
//		반	분류		이름		국어	영어	수학	특기	총점	평균	전체등수	반등수	분류등수	반에서의 분류등수
//		1	일반		구가인	75	92	8		175	58	2		1		1		1	
//		1	일반		칠가인	17	79	77		173	57	3		2		2		2	
//		1	특기생	육가인	12	0	56	13	81	20	10		3		5		1		
//		2	일반		일가인	63	83	0		146	48	4		1		3		1	
//		2	일반		삼가인	83	24	17		124	41	6		3		4		2	
//		2	특기생	이가인	81	17	78	5	181	45	5		2		2		1	
//		2	특기생	팔가인	80	47	24	5	156	39	7		4		3		2	
//		3	일반		오가인	58	10	12		80	26	9		3		5		1	
//		3	특기생	사가인	55	83	59	87	284	71	1		1		1		1	
//		3	특기생	십가인	8	12	66	64	150	37	8		2		4		2	

	}

}
