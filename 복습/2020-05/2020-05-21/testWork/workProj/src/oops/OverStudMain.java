package oops;

class OverStud {

	String name, kind;
	int[] jum;
	int cateNum, tot, avg, rank, position;

	void init(String name, int... jum) {
		this.name = name;
		this.jum = jum;
		this.kind = new String[] { "일반", "특기생" }[cateNum];
		calc(jum);
	}

	void calc(int[] jum) {
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}

	void rank(OverMakeStud rms, OverStud[] studs) {
		this.rank = 1;

		if (cateNum == 1)
			this.position += rms.person; // 앞반의 인원을 알 수 있습니다.

		for (OverStud overStud : studs) {
			if (this.kind.equals(overStud.kind) && this.avg < overStud.avg)
//			if (cateNum == overStud.cateNum && this.avg < overStud.avg)
				this.rank++;
		}

		position += rank; // 앞반의 인원수와 나의 등수로 나의 위치를 알 수 있습니다.

	}

	void ppp() {
		String ttt = kind + "\t" + name + "\t";

		for (int i : jum) {
			ttt += i + "\t";
		}

		if (cateNum == 0)
			ttt += "\t";

		ttt += tot + "\t" + avg + "\t" + rank;

		System.out.println(ttt);
	}

}

class OverMakeStud {
	int person = 0; // 인원수 체크

	OverStud make(String name, int kor, int eng, int mat) {
		OverStud res = new OverStud();
		res.cateNum = 0;
		res.init(name, kor, eng, mat);
		person++;
		return res;
	}

	OverStud make(String name, int kor, int eng, int mat, int art) {
		OverStud res = new OverStud();
		res.cateNum = 1;
		res.init(name, kor, eng, mat, art);
//		person++; // 앞반의 인원수만 체크하면 됩니다.
		return res;
	}

}

public class OverStudMain {

	public static void main(String[] args) {

		OverMakeStud rms = new OverMakeStud();

		OverStud[] studs = { rms.make("한가인", 76, 77, 71), rms.make("두가인", 66, 67, 61, 62), rms.make("삼가인", 96, 97, 91),
				rms.make("사가인", 56, 57, 51), rms.make("손예진", 80, 87, 81, 83), rms.make("한예진", 76, 70, 71),
				rms.make("두예진", 66, 60, 61, 62), rms.make("삼예진", 96, 89, 91), rms.make("사예진", 56, 48, 51),
				rms.make("오예진", 83, 80, 81, 83) };

		for (OverStud overStud : studs) {
			overStud.ppp();
		}

		for (OverStud overStud : studs) {
			overStud.rank(rms, studs);
		}

		System.out.println("-----------------------------------");

		String temp = "";
		for (int i = 1; i <= studs.length; i++) {
			for (OverStud overStud : studs) {
				if (overStud.position == i) {
					if (!temp.equals(overStud.kind)) {
						System.out.println(overStud.kind + ">>>>>>>");
						temp = overStud.kind;
					}
					overStud.ppp();
				}
			}

		}

	}

}
