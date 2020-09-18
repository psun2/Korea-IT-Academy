class Student2 {

	String name, kind;
	int[] jum, result; // result = 총점, 평균, 분류 등수
	int pos;

	Student2(String name, int... jum) { // 맴버변수 초기화 constructor
		this.name = name;
		this.kind = new String[] { "일반", "특기생" }[jum.length - 3];
		this.jum = jum;
		calc();
	}

	void calc() { // 총점과 평균 계산

		result = new int[3];

		for (int i : jum) {
			result[0] += i;
		}
		result[1] = result[0] / jum.length;
	}

	void rank(Student2[] st) { // 등수 계산

		result[2] = 1;

		for (Student2 student : st) {
			if (this.result[1] < student.result[1] && this.kind == student.kind)
				result[2]++;
		}

		position(st);

	}

	void position(Student2[] st) { // 위치 계산
		int cateCnt = 0;

		for (Student2 student : st) { // 앞반 학생 인원수 chk
			if (student.kind.equals("일반"))
				cateCnt++;
		}

		pos += result[2];

		if (this.kind.equals("특기생"))
			pos = cateCnt + result[2];

	}

	void show() { // 출력메소드
		String result = kind + "\t" + name + "\t";

		for (int i : jum)
			result += i + "\t";

		if (this.kind.equals("일반"))
			result += "\t";

		for (int i : this.result)
			result += i + "\t";

		System.out.println(result);

//		System.out.println(pos);
	}
}

class StudentMake {

	Student[] student;

	StudentMake(String[] name, int[][] jum) {

		this.student = new Student[name.length];

		createInctance(name, jum);

	}

	void createInctance(String[] name, int[][] jum) {

		// 인스턴스 생성과 생성자를 이용한 맴버변수 초기화
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student(name[i], jum[i]);
		}

		// 등수 계산
		for (int i = 0; i < student.length; i++) {
			student[i].rank(student);
		}

	}

	void show() {
		// 출력
		String temp = "";
		for (int i = 1; i <= student.length; i++) {
			for (Student st : student) {
				if (i == st.pos) {
					if (temp != st.kind) {
						System.out.println(st.kind + ">>>>>>");
						temp = st.kind;
					}
					st.show();
				}
			}
		}
	}

}

public class Main2 {

	public static void main(String[] args) {

		String name[] = { "java", "js", "python", "c", "c#", "c++", "Node.js", "kotlin", "php", "swift" };
		int[][] jum = { { 91, 72, 43, 31 }, { 21, 42, 37 }, { 21, 72, 83 }, { 41, 52, 38, 78 }, { 11, 62, 37 },
				{ 15, 72, 93, 43 }, { 13, 22, 32 }, { 81, 25, 63 }, { 41, 29, 73 }, { 51, 62, 73, 45 } };

		StudentMake student = new StudentMake(name, jum);

		student.show();

//		일반>>>>>>
//		일반		python	21	72	83		176	58	1	
//		일반		kotlin	81	25	63		169	56	2	
//		일반		php		41	29	73		143	47	3	
//		일반		c#		11	62	37		110	36	4	
//		일반		js		21	42	37		100	33	5	
//		일반		Node.js	13	22	32		67	22	6	
//		특기생>>>>>>
//		특기생	java	91	72	43	31	237	59	1	
//		특기생	swift	51	62	73	45	231	57	2	
//		특기생	c++		15	72	93	43	223	55	3	
//		특기생	c		41	52	38	78	209	52	4	

	}

}
