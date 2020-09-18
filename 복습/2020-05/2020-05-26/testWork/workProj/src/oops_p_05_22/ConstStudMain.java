package oops_p_05_22;

class ConstStud {
	String name, kind;
	int[] jum;
	int tot, avg, rank;

	ConstStud(String name, int kor, int eng, int mat) { // 생성자 constructor 도 오버로딩이 가능합니다.
		this("일반", name, kor, eng, mat); // 본인의 생성자 호출
	} // 1

	ConstStud(String name, int kor, int eng, int mat, int art) { // 생성자 constructor 도 오버로딩이 가능합니다.
		this("예체능", name, kor, eng, mat, art); // 본인의 생성자 호출
	} // 2

	// 1,2 의 생성자로 각type의 정보를 받고 그 정보를 바로 아래의 생정자로 보내줍니다.
	// 이렇게 할 수 있는 기본적인 이유는 메소드의 오버로딩 에 있고, this를 사용해 본인의 생성자를 다시한번 호출합니다.
	ConstStud(String kind, String name, int... jum) { // 생성자 constructor 도 오버로딩이 가능합니다.
		super();
		this.kind = kind; // 2번째 작업으로 처음 생성자가 받아온 정보를 parameter로 받아
		this.name = name; // 맴버 변수를 초기화 합니다.
		this.jum = jum;
		calc();
	}

	void calc() { // 점수 계산
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}

	void ppp() { // 출력부
		String ttt = kind + "\t" + name + "\t";

		for (int i : jum) {
			ttt += i + "\t";
		}

		if (kind.equals("일반"))
			ttt += "\t";
		ttt += tot + "\t" + avg + "\t" + rank;

		System.out.println(ttt);
	}

	void rankCalc(ConstStud[] arr) { // 등수 계산
		rank = 1;

		for (ConstStud you : arr) {
			if (avg < you.avg && kind.equals(you.kind))
				rank++;
		}
	}

}

public class ConstStudMain {

	public static void main(String[] args) {

		ConstStud[] arr = { new ConstStud("백승수", 77, 78, 71, 70), new ConstStud("임동규", 87, 88, 81),
				new ConstStud("유민호", 47, 48, 41, 45), new ConstStud("장진우", 57, 58, 51, 59),
				new ConstStud("서영주", 97, 98, 91), new ConstStud("곽한영", 80, 88, 81, 84),
				new ConstStud("이용재", 37, 38, 31), new ConstStud("이철민", 27, 28, 21) };

		for (ConstStud st : arr) {

			st.rankCalc(arr);
		}

		String[] title = { "일반", "예체능" };
		for (String ttt : title) {
			System.out.println(ttt + ">>>");

			for (ConstStud st : arr) {
				if (ttt.equals(st.kind))
					st.ppp();
			}
		}

	}

}
