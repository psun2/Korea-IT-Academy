class Student2 { // Student class

	String name, kind;
	int[] jum, result; // result = 총점, 평균, 등수

	Student2(String kind, String name, int[] jum) {
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

	void rank(Student2[] students) {

		result[2] = 1;

		for (Student2 st : students) {
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

class GeneralStudent2 extends Student2 { // Student 클래스를 상속받은 일반학생 클래스

	GeneralStudent2(String name, int[] jum) {
		super("일반", name, jum);
	}

	void calc() { // Student 클래스의 calc 메소드 오버라이딩

		super.calc();

		this.result[1] += this.jum[0] * 0.4 + this.jum[1] * 0.3 + this.jum[2] * 0.3;
	}

}

class SpecialStudent2 extends Student2 { // Student 클래스를 상속받은 예체능학생 클래스

	SpecialStudent2(String name, int[] jum) {
		super("예체능", name, jum);
	}

	void calc() { // Student 클래스의 calc 메소드 오버라이딩

		super.calc();

		this.result[1] += this.jum[0] * 0.2 + this.jum[1] * 0.1 + this.jum[2] * 0.1 + this.jum[3] * 0.6;
	}

}

class StudentMake {

	Student2[] students;

	StudentMake(String[] name, int[][] jum) {
		create(name, jum);
	}

	void create(String[] name, int[][] jum) {

		this.students = new Student2[name.length];

		if (jum[0].length - 3 == 0) {
			for (int i = 0; i < students.length; i++) {
				students[i] = new GeneralStudent2(name[i], jum[i]);
			}
		} else {
			for (int i = 0; i < students.length; i++) {
				students[i] = new SpecialStudent2(name[i], jum[i]);
			}
		}

		rank(students);
	}

	void rank(Student2[] students) {

		for (Student2 st : students) {
			st.rank(students);
		}

	}

	void show() {

		String title = "";
		for (Student2 st : students) {
			if (!title.equals(st.kind)) {
				System.out.println(st.kind + " 정렬전 >>>>>>>>>>");
				title = st.kind;
			}
			st.show();
		}

		title = "";
		for (int i = 1; i <= students.length; i++) {
			for (Student2 st : students) {
				if (st.result[2] == i) {
					if (!title.equals(st.kind)) {
						System.out.println("\n" + st.kind + " 정렬후 >>>>>>>>>>");
						title = st.kind;
					}
					st.show();
				}
			}
		}
	}

}

public class Main2 {

	public static void main(String[] args) {

		// 학생 성적을 상속, 오버라이딩으로 구현하세요.
		// 일반 - 국(40), 영(30), 수(30)
		// 예체능 - 국(20), 영(10), 수(10), 예체능(60)
		// 구분, 이름, 과목, 총점, 점수, 등수 (구분별)

		String gName[] = { "java", "js", "python", "c", "c#", "c++", "Node.js", "kotlin", "php", "swift" };
		int[][] gJum = { { 91, 72, 43 }, { 21, 42, 37 }, { 21, 72, 83 }, { 41, 52, 38 }, { 11, 62, 37 }, { 15, 72, 93 },
				{ 13, 22, 32 }, { 81, 25, 63 }, { 41, 29, 73 }, { 51, 73, 35 } };

		StudentMake generalStudents = new StudentMake(gName, gJum);

		generalStudents.show();

		String sName[] = { "java", "js", "python", "c", "c#", "c++", "Node.js", "kotlin", "php", "swift" };
		int[][] sJum = { { 91, 72, 43, 46 }, { 31, 42, 37, 56 }, { 21, 72, 83, 72 }, { 41, 52, 38, 35 },
				{ 11, 62, 37, 47 }, { 15, 72, 93, 16 }, { 13, 22, 32, 77 }, { 81, 25, 63, 65 }, { 41, 29, 73, 32 },
				{ 51, 73, 45, 22 } };

		StudentMake specialStudent = new StudentMake(sName, sJum);

		System.out.println();

		specialStudent.show();

		Student2 s1 = new Student2("dd", gName[0], gJum[0]);
		GeneralStudent2 s2 = new GeneralStudent2(gName[0], gJum[0]);
		SpecialStudent2 s3 = new SpecialStudent2(sName[0], sJum[0]);

		System.out.println(generalStudents == specialStudent); // false
		System.out.println(s1.getClass() == s2.getClass()); // false
		System.out.println(s1.getClass() == s3.getClass()); // false
//		System.out.println(s2.getClass() == s3.getClass()); // false
		System.out.println(s1 instanceof Student2); // true
		System.out.println(s2 instanceof Student2); // true
		System.out.println(s3 instanceof Student2); // true
		System.out.println(s2 instanceof GeneralStudent2); // true
		System.out.println(s3 instanceof SpecialStudent2); // true
		System.out.println(generalStudents.students == specialStudent.students); // false 이렇게 하면 주소 비교 밖에 되지 않습니다.

		System.out.println(generalStudents.students instanceof Student2[]); // true
		System.out.println(generalStudents.students instanceof GeneralStudent2[]); // false
		System.out.println(generalStudents.students instanceof SpecialStudent2[]); // false

		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < generalStudents.students.length; i++) {
			System.out.println(generalStudents.students[i] instanceof Student2); // true
			System.out.println(generalStudents.students[i] instanceof GeneralStudent2); // true
			System.out.println(generalStudents.students[i] instanceof SpecialStudent2); // false
		}

		// 위 의 결과로 인해 GeneralStudent2 클래스와 SpecialStudent2 클래스는 Student2를 상속 받으므로, 각자의
		// instance type 될 수 도 있지만,
		// 상위 부모인 Student2 의 instance type이 될 수 있습니다.

		// getClass 의 결과 서로의 class Name은 다르지만
		// 부모의 확장이므로, type은 Student2 도 될수 있으며, 상속받은 type이 될 수 도 있습니다.

		GeneralStudent2[] test = new GeneralStudent2[10];

//		for (int i = 0; i < test.length; i++) {
//			test[i] = new SpecialStudent2(sName[0], sJum[0]); // Type mismatch
//		}

//		상속자는 똑같지만, 각각의 class 가 다르므로, 서로를 배열에 담을 수 없습니다.

	}

}
