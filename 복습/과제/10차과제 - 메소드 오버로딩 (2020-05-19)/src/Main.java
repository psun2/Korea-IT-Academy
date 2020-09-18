import java.util.Arrays;

class Student {
	MakeStudent ms;
	String name, kind;
	int[] jum, result; // jum = {국, 영, 수}, result = {총점, 평균, 반등수, 전체등수}
	int position, cateNum;

	void init(Student[] students) {
		result[2] = 1;
		result[3] = 1;
		for (Student st : students) {
			if (this.result[1] < st.result[1]) {
				result[3]++;
				if (this.kind == st.kind)
					result[2]++;
			}
		}

		this.position = result[2] - 1; // 본인의 index 번호를 구하기 위하여, 순위는 1부터 시작하기 때문에 -1을 해주면 index 번호가 나오게 됩니다.

		this.ms.cateIndex[cateNum][position] = this;

		if (this.kind.equals("특기생")) // cateNum == 1
			position += ms.cateCnt[0]; // 여기의 값을 구하기 위해 MakeStudent 클래스에서 자신을 인자값으로 보내줘야 합니다.
										// ms.cateCnt[0] 을 더해주는 이유는 일반생의 숫자와 같습니다.

	}

	void init() {
		result = new int[4];
		for (int i : this.jum)
			this.result[0] += i;
		this.result[1] = this.result[0] / this.jum.length;
	}

	void init(String name, int[] jum, MakeStudent ms) {
		this.cateNum = jum.length - 3;
		this.name = name;
		this.jum = jum;
		this.ms = ms;
		this.kind = new String[] { "일반", "특기생" }[cateNum];
		init();
	}

	void show() {
		String print = this.kind + "\t" + this.name + "\t";
		for (int i : jum)
			print += i + "\t";
		if (kind.equals("일반")) // cateNum == 0
			print += "\t";
		for (int i : result)
			print += i + "\t";
		System.out.println(print);
	}
}

class MakeStudent {

	String[] cate = { "일반", "특기생" };
	int[] cateCnt = new int[cate.length];
	Student[][] cateIndex = new Student[cate.length][];

	Student init(String name, int[] jum) {
		Student result = new Student();
		result.init(name, jum, this);
		cateCnt[jum.length - 3]++; // 일반생의 숫자와 특기생의 숫자를 나눌수 있습니다.
		return result;
	}

	void init() {
		for (int i = 0; i < cateCnt.length; i++) {
			cateIndex[i] = new Student[cateCnt[i]];
		}

	}

	void show() {
		for (int i = 0; i < cate.length; i++) {
			System.out.println(cate[i] + " >>>>>");
			for (Student st : cateIndex[i]) {
				st.show();
			}
		}
	}

}

public class Main {

	public static void main(String[] args) {

		String[] name = { "일오정", "이오정", "삼오정", "사오정", "오오정", "육오정", "칠오정", "팔오정", "구오정", "십오정" };

		int[][] score = { { 29, 82, 83 }, { 94, 85, 66, 77 }, { 81, 29, 73 }, { 84, 67, 69, 67 }, { 41, 72, 83 },
				{ 84, 57, 66, 27 }, { 81, 32, 73 }, { 14, 65, 56, 77 }, { 71, 12, 83 }, { 64, 57, 86, 71 } };

		MakeStudent make = new MakeStudent();

		Student[] student = new Student[10];

		for (int j = 0; j < student.length; j++) {
			student[j] = make.init(name[j], score[j]);
		}

		make.init(); // 2차원 배열에 일반생과 특기생의 인원수 별 배열을 생성합니다.
						// Student의 모든 인스턴스가 생성후에 한번만 실행하면 됩니다.

		for (int i = 0; i < student.length; i++) {
			student[i].init(student);
		}

		// 1번 방법 - cate 가 같을때 (kind 이용) 등수별로 출력
		for (String cate : make.cate) {
			System.out.println(cate + " >>>>>>");
			for (int i = 1; i <= student.length; i++) {
				for (Student st : student) {
					if (cate == st.kind && i == st.result[2])
						st.show();
				}
			}
		}

		System.out.println("--------------------------------------------------------------------------------");

//		2번 방법 - 위치로 출력
		String kindIndex = "";
		for (int i = 0; i < student.length; i++) {
			for (Student st : student) {
				if (i == st.position) {
					if (!kindIndex.equals(st.kind)) {
						kindIndex = st.kind;
						System.out.println(st.kind + " >>>>>");
					}
					st.show();
				}
			}
		}

		System.out.println("--------------------------------------------------------------------------------");

//		3번 방법 - index의 번호의 해당하는 index에 클래스의 주소를 넣어 출력 합니다.
		make.show();
		
		
//		일반 >>>>>>
//		일반		오오정	41	72	83		196	65	1	4	
//		일반		일오정	29	82	83		194	64	2	5	
//		일반		칠오정	81	32	73		186	62	3	6	
//		일반		삼오정	81	29	73		183	61	4	7	
//		일반		구오정	71	12	83		166	55	5	9	
//		특기생 >>>>>>
//		특기생	이오정	94	85	66	77	322	80	1	1	
//		특기생	사오정	84	67	69	67	287	71	2	2	
//		특기생	십오정	64	57	86	71	278	69	3	3	
//		특기생	육오정	84	57	66	27	234	58	4	8	
//		특기생	팔오정	14	65	56	77	212	53	5	10	
//		--------------------------------------------------------------------------------
//		일반 >>>>>
//		일반		오오정	41	72	83		196	65	1	4	
//		일반		일오정	29	82	83		194	64	2	5	
//		일반		칠오정	81	32	73		186	62	3	6	
//		일반		삼오정	81	29	73		183	61	4	7	
//		일반		구오정	71	12	83		166	55	5	9	
//		특기생 >>>>>
//		특기생	이오정	94	85	66	77	322	80	1	1	
//		특기생	사오정	84	67	69	67	287	71	2	2	
//		특기생	십오정	64	57	86	71	278	69	3	3	
//		특기생	육오정	84	57	66	27	234	58	4	8	
//		특기생	팔오정	14	65	56	77	212	53	5	10	
//		--------------------------------------------------------------------------------
//		일반 >>>>>
//		일반		오오정	41	72	83		196	65	1	4	
//		일반		일오정	29	82	83		194	64	2	5	
//		일반		칠오정	81	32	73		186	62	3	6	
//		일반		삼오정	81	29	73		183	61	4	7	
//		일반		구오정	71	12	83		166	55	5	9	
//		특기생 >>>>>
//		특기생	이오정	94	85	66	77	322	80	1	1	
//		특기생	사오정	84	67	69	67	287	71	2	2	
//		특기생	십오정	64	57	86	71	278	69	3	3	
//		특기생	육오정	84	57	66	27	234	58	4	8	
//		특기생	팔오정	14	65	56	77	212	53	5	10
		
		
	}

}
