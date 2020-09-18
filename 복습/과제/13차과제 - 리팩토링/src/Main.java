import java.util.Arrays;

class Student { // Student class

	String name, kind;
	int pos;
	int[] jum;
	double[] result; // result = 총점, 환산점수, 전체등수, 분류별 등수

	Student(String kind, String name, int[] jum) {
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		calc();
	}

	void calc() {

		result = new double[4];

		for (int i : jum) {
			this.result[0] += i;
		}

//		if(jum.length == 3) 
//			this.result[1] += this.jum[0] * 0.4 + this.jum[1] * 0.3 + this.jum[2] * 0.3;
//		else
//			this.result[1] += this.jum[0] * 0.2 + this.jum[1] * 0.1 + this.jum[2] * 0.1 + this.jum[3] * 0.6;
	}

	void rank(Student[] students) {

		result[2] = 1;
		result[3] = 1;

		int count = 0;

		for (Student st : students) {

			if (st.kind.equals("일반"))
				count++; // 앞반의 인원수 chk

			if (result[1] < st.result[1]) {
				result[2]++;
				if (this.kind == st.kind)
					result[3]++;
			}
		}

//		System.out.println("count: " + count);

		position(count);

	}

	void position(int count) {

		this.pos = (int) this.result[3]; // 앞반 학생의 위치는 자신의 반등수 입니다.

		if (kind.equals("예체능"))
			this.pos = count + (int) this.result[3]; // 예체능 학생들의 위치는 앞반의 인원수 + 자신의 반 등수 입니다.

//		System.out.println("position: " + pos);

	}

	void show() {

		String print = kind + "\t" + name + "\t";

		for (int i : jum) {
			print += i + "\t";
		}

		if (kind.equals("일반"))
			print += "\t";

		for (int i = 0; i < result.length; i++) {
			if (i != 1)
				print += (int) result[i] + "\t";
			else
				print += result[i] + "\t";
		}

		System.out.println(print);

	}

}

class GeneralStudent extends Student { // Student 클래스를 상속받은 일반학생 클래스

	GeneralStudent(String name, int[] jum) {
		super("일반", name, jum);
	}

	void calc() { // Student 클래스의 calc 메소드 오버라이딩

		super.calc();

		this.result[1] += this.jum[0] * 0.4 + this.jum[1] * 0.3 + this.jum[2] * 0.3;
	}

}

class SpecialStudent extends Student { // Student 클래스를 상속받은 예체능학생 클래스

	SpecialStudent(String name, int[] jum) {
		super("예체능", name, jum);
	}

	void calc() { // Student 클래스의 calc 메소드 오버라이딩

		super.calc();

		this.result[1] += this.jum[0] * 0.2 + this.jum[1] * 0.1 + this.jum[2] * 0.1 + this.jum[3] * 0.6;
	}

}

class StudentMake {

	Student[] students;

	StudentMake(String[] name, int[][] jum) {
		create(name, jum);
	}

	void create(String[] name, int[][] jum) {

		this.students = new Student[jum.length];

		for (int i = 0; i < jum.length; i++) {
			if (jum[i].length == 3)
				students[i] = new GeneralStudent(name[i], jum[i]);
			else
				students[i] = new SpecialStudent(name[i], jum[i]);

		}

		rank(students);
	}

	void rank(Student[] students) {

		for (Student st : students) {
			st.rank(students);
		}

	}

	void show() {

		System.out.println("정렬 전");
		for (Student st : students) {
			st.show();
		}

	}

	void sortShow() {

		System.out.println("정렬 후");
		String title = "";
		for (int i = 1; i <= students.length; i++) {
			for (Student st : students) {
				if (st.pos == i) {
					if (!title.equals(st.kind)) {
						System.out.println(st.kind + " >>>>>>>>>");
						title = st.kind;
					}
					st.show();
				}
			}
		}

	}

}

public class Main {

	public static void main(String[] args) {

		// 학생 성적을 상속, 오버라이딩으로 구현하세요.
		// 일반 - 국(40), 영(30), 수(30)
		// 예체능 - 국(20), 영(10), 수(10), 예체능(60)
		// 구분, 이름, 과목, 총점, 점수, 등수 (구분별)

		String name[] = { "java", "js", "python", "c", "c#", "c++", "Node.js", "kotlin", "php", "swift" };
		int[][] jum = { { 91, 72, 43, 31 }, { 21, 42, 37 }, { 21, 72, 83 }, { 41, 52, 38, 78 }, { 11, 62, 37 },
				{ 15, 72, 93, 43 }, { 13, 22, 32 }, { 81, 25, 63 }, { 41, 29, 73 }, { 51, 62, 73, 45 } };

		StudentMake students = new StudentMake(name, jum);

		students.show();
		System.out.println();
		students.sortShow();

	}

}

//정렬 전
//예체능	java	91	72	43	31	237	48.3	5	3	
//일반	js	21	42	37		100	32.1	9	5	
//일반	python	21	72	83		176	54.9	3	2	
//예체능	c	41	52	38	78	209	64.0	1	1	
//일반	c#	11	62	37		110	34.1	8	4	
//예체능	c++	15	72	93	43	223	45.3	7	4	
//일반	Node.js	13	22	32		67	21.4	10	6	
//일반	kotlin	81	25	63		169	58.8	2	1	
//일반	php	41	29	73		143	47.0	6	3	
//예체능	swift	51	62	73	45	231	50.7	4	2	
//
//정렬 후
//일반 >>>>>>>>>
//일반	kotlin	81	25	63		169	58.8	2	1	
//일반	python	21	72	83		176	54.9	3	2	
//일반	php	41	29	73		143	47.0	6	3	
//일반	c#	11	62	37		110	34.1	8	4	
//일반	js	21	42	37		100	32.1	9	5	
//일반	Node.js	13	22	32		67	21.4	10	6	
//예체능 >>>>>>>>>
//예체능	c	41	52	38	78	209	64.0	1	1	
//예체능	swift	51	62	73	45	231	50.7	4	2	
//예체능	java	91	72	43	31	237	48.3	5	3	
//예체능	c++	15	72	93	43	223	45.3	7	4	
