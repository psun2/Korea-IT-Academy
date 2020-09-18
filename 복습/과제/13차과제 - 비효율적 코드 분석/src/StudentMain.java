class Student {

	String name, kind;
	int rank, tot;
	double score;

	Student(String kind, String name) {
		this.name = name;
		this.kind = kind;
	}

	void init() {
		calc();
	}

	void calc() {
	}

	void rankCalc(Student[] arr) {
		rank = 1;
		for (Student studs : arr) {
			if (score < studs.score && kind.equals(studs.kind)) {
				rank++;
			}
		}
	}

	void ppp() {
	}

}

class generalStudent extends Student {
	int kor, eng, math;

	generalStudent(String name, int kor, int eng, int math) {
		super("일반", name);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		init();
	}

	void calc() {
		tot = kor + eng + math;
		score = (double) (int) ((kor * 0.2 + eng * 0.2 + math * 0.2) * 10) / 10;
	}

	void ppp() {
		String ttt = kind + "\t" + name + "\t";

		ttt += kor + "\t" + eng + "\t" + math + "\t" + "\t";
		ttt += tot + "\t" + score + "\t" + rank;
		System.out.println(ttt);
	}
}

class AnPStudent extends Student {

	int kor, eng, math, art;

	AnPStudent(String name, int kor, int eng, int math, int art) {
		super("특기", name);
		this.kor = kor;
		this.eng = eng;
		this.art = art;
		this.math = math;
		init();
	}

	void calc() {
		tot = kor + eng + math + art;
		score = (double) (int) ((kor * 0.2 + eng * 0.2 + math * 0.2 + art * 0.5) * 10) / 10;
	}

	void ppp() {
		String ttt = kind + "\t" + name + "\t";

		ttt += kor + "\t" + eng + "\t" + math + "\t" + art + "\t";
		ttt += tot + "\t" + score + "\t" + rank;
		System.out.println(ttt);
	}

}

public class StudentMain {

	public static void main(String[] args) {

		Student[] arr = { new generalStudent("일깡", 90, 80, 70), new generalStudent("이깡", 99, 90, 95),
				new AnPStudent("삼깡", 90, 87, 85, 45), new AnPStudent("사깡", 96, 87, 50, 50),
				new generalStudent("오깡", 10, 10, 10), new AnPStudent("육깡", 90, 12, 55, 12),
				new generalStudent("칠깡", 45, 44, 40), new generalStudent("팔깡", 75, 76, 70),
				new AnPStudent("구깡", 85, 87, 80, 89), new generalStudent("십깡", 25, 80, 70) };

		for (Student stud : arr) {
			stud.rankCalc(arr);
		}

		String[] kind = { "일반", "특기" };

		for (String ttt : kind) {
			System.out.println("--------" + ttt + "-------");
			for (int r = 0; r < arr.length; r++) { // ✔ 이 코드가 등수별로 출력되는 이유 !
				for (Student studs : arr) {
					if (ttt.equals(studs.kind) && r == studs.rank) { // ✔ 이 코드가 등수별로 출력되는 이유 !
						studs.ppp();
					}
				}
			}
		}

//		1. arr의 길이는 10이므로 무조건 10번을 돈다. => 비효율적
//		2. r = 0 일때 조건이 없으므로 출력 X
//		3. r = 1일 때 부터 시작하는데, 이때부터 조건문의 조건이 성립되기 시작함.
//		4. 일반의 등수가 끝나도 무조건 10번 돌기 때문에 계속 비효율적으로 돌게됨
//			=> 물론 조건이 충족하지 않으므로, 앞반의 등수가 모두 끝나고 계속 남어지만큼 계속 돌게됨.
//		5. 결국 원하는데로 출력은 할 수 있느나, 효율적이지 못하게 됨.

	}
}