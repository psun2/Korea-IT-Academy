class Student { // Student class

	String name, kind;
	int[] jum, result; // result = 총점, 평균, 등수

	Student(String kind, String name, int[] jum) {
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		calc();
	}

	void calc() {

		result = new int[3];

		for (int i : jum) {
			this.result[0] += i;
		}

	}

	void rank(Student[] students) {

		result[2] = 1;

		for (Student st : students) {
			if (result[1] < st.result[1])
				result[2]++;
		}

	}

	void show() {

		String print = kind + "\t" + name + "\t";

		for (int i : jum) {
			print += i + "\t";
		}

		if (kind.equals("일반"))
			print += "\t";

		for (int i : result) {
			print += i + "\t";
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

public class Main {

	public static void main(String[] args) {

		// 학생 성적을 상속, 오버라이딩으로 구현하세요.
		// 일반 - 국(40), 영(30), 수(30)
		// 예체능 - 국(20), 영(10), 수(10), 예체능(60)
		// 구분, 이름, 과목, 총점, 점수, 등수 (구분별)

		String gName[] = { "java", "js", "python", "c", "c#", "c++", "Node.js", "kotlin", "php", "swift" };
		int[][] gJum = { { 91, 72, 43 }, { 21, 42, 37 }, { 21, 72, 83 }, { 41, 52, 38 }, { 11, 62, 37 }, { 15, 72, 93 },
				{ 13, 22, 32 }, { 81, 25, 63 }, { 41, 29, 73 }, { 51, 73, 35 } };

		GeneralStudent[] generalStudents = new GeneralStudent[gName.length];

		for (int i = 0; i < generalStudents.length; i++) {
			generalStudents[i] = new GeneralStudent(gName[i], gJum[i]);
		}

		for (GeneralStudent gs : generalStudents) {
			gs.rank(generalStudents);
		}

		String title = "";
		for (GeneralStudent gs : generalStudents) {
			if (!title.equals(gs.kind)) {
				System.out.println(gs.kind + " 정렬전 >>>>>>>>>>");
				title = gs.kind;
			}
			gs.show();
		}

		title = "";
		for (int i = 1; i <= generalStudents.length; i++) {
			for (GeneralStudent gs : generalStudents) {
				if (gs.result[2] == i) {
					if (!title.equals(gs.kind)) {
						System.out.println("\n" + gs.kind + " 정렬후 >>>>>>>>>>");
						title = gs.kind;
					}
					gs.show();
				}
			}
		}

		String sName[] = { "java", "js", "python", "c", "c#", "c++", "Node.js", "kotlin", "php", "swift" };
		int[][] sJum = { { 91, 72, 43, 46 }, { 31, 42, 37, 56 }, { 21, 72, 83, 72 }, { 41, 52, 38, 35 },
				{ 11, 62, 37, 47 }, { 15, 72, 93, 16 }, { 13, 22, 32, 77 }, { 81, 25, 63, 65 }, { 41, 29, 73, 32 },
				{ 51, 73, 45, 22 } };

		SpecialStudent[] specialStudents = new SpecialStudent[gName.length];

		for (int i = 0; i < specialStudents.length; i++) {
			specialStudents[i] = new SpecialStudent(sName[i], sJum[i]);
		}

		for (SpecialStudent ss : specialStudents) {
			ss.rank(specialStudents);
		}

		title = "";
		for (SpecialStudent ss : specialStudents) {
			if (!title.equals(ss.kind)) {
				System.out.println("\n" + ss.kind + " 정렬전 >>>>>>>>>>");
				title = ss.kind;
			}
			ss.show();
		}

		title = "";
		for (int i = 1; i <= specialStudents.length; i++) {
			for (SpecialStudent ss : specialStudents) {
				if (ss.result[2] == i) {
					if (!title.equals(ss.kind)) {
						System.out.println("\n" + ss.kind + " 정렬후 >>>>>>>>>>");
						title = ss.kind;
					}
					ss.show();
				}
			}
		}

	}

}
