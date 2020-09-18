package oops;

/// 학번, 이름, 반, 전화번호,  점수 [국어, 영어, 수학], 총점, 평균
class Student {
	String name, tel;

	int no, ban, tot, avg, rank;

	int[] jum;

}

public class ClassStudent {

	public static void main(String[] args) {

		Student[] student = new Student[5];

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}

		student[0].ban = 2;
		student[0].no = 3;
		student[0].name = "현빈";
		student[0].tel = "1111-1111";
		student[0].jum = new int[] { 77, 78, 71 };

		student[1].ban = 1;
		student[1].no = 2;
		student[1].name = "원빈";
		student[1].tel = "2222-2222";
		student[1].jum = new int[] { 67, 68, 61 };

		student[2].ban = 1;
		student[2].no = 1;
		student[2].name = "골빈";
		student[2].tel = "3333-3333";
		student[2].jum = new int[] { 97, 98, 91 };

		student[3].ban = 2;
		student[3].no = 2;
		student[3].name = "장희빈";
		student[3].tel = "4444-4444";
		student[3].jum = new int[] { 57, 58, 51 };

		student[4].ban = 2;
		student[4].no = 4;
		student[4].name = "젤리빈";
		student[4].tel = "5555-5555";
		student[4].jum = new int[] { 87, 88, 81 };

		for (Student i : student) {
			for (int j : i.jum) {
				i.tot += j; // 총점 계산
			}
			i.avg = i.tot / i.jum.length; // 평균계산
		}

		for (Student i : student) {
			i.rank = 1;
			for (Student j : student) {
				if (i.avg < j.avg)
					i.rank++;
			}
		}

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].avg + ", " + student[i].rank);
		}

		for (int i = 1; i <= student.length; i++) {
			for (Student j : student) {
				if (j.rank == i) {
					String print = j.ban + "\t" + j.no + "\t" + j.name + "\t" + j.tel + "\t";
					for (int k : j.jum) {
						print += k + "\t";
					}
					print += j.tot + "\t" + j.avg + "\t" + j.rank + "\t";
					System.out.println(print);
				}
			}
		}

	}

}
