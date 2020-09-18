package oops;

class ParamStud {

	String name, kind;

	int[] jum;

	int tot, avg;

	void init(String name, int... jum) {
		this.name = name;
		this.kind = new String[] { "일반", "특기생" }[jum.length - 3];

//		String[] kind = {"일반", "특기생"};
//		this.kind = kind[jum.length - 3];
//		this.kind = new String[] {"일반", "특기생"}[jum.length - 3]; 코드는 위 두줄의 코드를
//		한꺼번에 처리한 경우 입니다. 배열을 익명형태로 만들어 index번호를 부여함으로서 값을 바로 삽입합니다.

		this.jum = jum;

		for (int i : this.jum)
			tot += i;

		avg = tot / jum.length;
	}

	void ppp() {

		String ttt = kind + "\t" + name + "\t";

		for (int i : this.jum)
			ttt += i + "\t";

		// if(kind=="일반")
		if (kind.equals("일반"))
//			euqals 함수는 대소문자를 구분하고 equalsIgnoreCase 함수는 대소문자의 구분없이
//			argument로 보내는 문자열이 똑같으면 true 아닐시 false를 반환 홥니다.
			ttt += "\t";

		ttt += tot + "\t" + avg;

		System.out.println(ttt);
	}

}

public class ParamStudentMain {

	public static void main(String[] args) {

		/// 국어, 영어, 수학 -일반
		/// 국어, 영어, 수학, 예체능 -특기

		// 총점, 평균까지 출력하세요

		ParamStud[] ps = new ParamStud[5];

		for (int i = 0; i < ps.length; i++) {
			ps[i] = new ParamStud();
		}

		ps[0].init("한가인", 76, 77, 71);
		ps[1].init("두가인", 66, 67, 61, 62);
		ps[2].init("삼가인", 96, 97, 91);
		ps[3].init("사가인", 56, 57, 51);
		ps[4].init("오가인", 86, 87, 81, 83);

		for (ParamStud st : ps)
			st.ppp();
		
		
//		일반	한가인	76	77	71		224	74
//		특기생	두가인	66	67	61	62	256	64
//		일반	삼가인	96	97	91		284	94
//		일반	사가인	56	57	51		164	54
//		특기생	오가인	86	87	81	83	337	84

		
	}

}
