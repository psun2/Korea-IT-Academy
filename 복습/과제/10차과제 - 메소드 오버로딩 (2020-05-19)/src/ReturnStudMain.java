
class ReturnStud {

	ReturnMakeStud rrr;
	String name, kind;

	int[] jum;

	int tot, avg, totRank, rank, pos, cateNum;

	void init(ReturnMakeStud rrr, String name, int... jum) {
		this.rrr = rrr;
		this.name = name;
		this.jum = jum;

		cateNum = jum.length - 3;
		kind = new String[] { "일반", "특기생" }[cateNum];

		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}

	void ppp() {
		String ttt = kind + "\t" + name + "\t";

		for (int i : jum) {
			ttt += i + "\t";
		}

		if (cateNum == 0)
			ttt += "\t";

		ttt += tot + "\t" + avg + "\t" + totRank + "\t" + rank;

		System.out.println(ttt);
	}

	void rankCal(ReturnStud[] studs) {
		totRank = 1;
		rank = 1;
		for (ReturnStud you : studs) {

			if (avg < you.avg) {
				totRank++;
				if (cateNum == you.cateNum)
					rank++;
			}
		}

		pos = rank - 1;

		rrr.studs[cateNum][pos] = this;

		if (kind.equals("특기생")) // 2번 방법
			pos += rrr.cateCnt[0];

	}
}

class ReturnMakeStud {

	String[] cate = new String[] { "일반", "특기생" };
	int[] cateCnt = new int[cate.length];

	ReturnStud[][] studs = new ReturnStud[2][];

	ReturnStud make(String name, int... line) {
		cateCnt[line.length - 3]++;
		ReturnStud res = new ReturnStud();
		res.init(this, name, line);
		return res;
	}

	void studsArrSet() {
		for (int i = 0; i < cateCnt.length; i++) {
			studs[i] = new ReturnStud[cateCnt[i]];
		}
		/*
		 * studs = { { null, null ,null ,null ,null ,null }, //일반 일반1등 일반2등 일반3등 ...
		 * 
		 * { null, null ,null ,null }, //특기생 특기생1등,특기생2등,특기생3등,특기생4등
		 * 
		 * };
		 * 
		 * 
		 * 
		 * 
		 */
	}

	void ppp() {
		for (int i = 0; i < cate.length; i++) {
			System.out.println(cate[i] + ">>>>>");

			for (ReturnStud st : studs[i]) {
				st.ppp();
			}
		}
	}
}

public class ReturnStudMain {

	public static void main(String[] args) {

		ReturnMakeStud rms = new ReturnMakeStud();

		ReturnStud[] studs = { rms.make("한가인", 76, 77, 71), rms.make("두가인", 66, 67, 61, 62),
				rms.make("삼가인", 96, 97, 91), rms.make("사가인", 56, 57, 51), rms.make("손예진", 80, 87, 81, 83),
				rms.make("한예진", 76, 70, 71), rms.make("두예진", 66, 60, 61, 62), rms.make("삼예진", 96, 89, 91),
				rms.make("사예진", 56, 48, 51), rms.make("오예진", 83, 80, 81, 83) };

		rms.studsArrSet();

		for (ReturnStud me : studs) {
			me.rankCal(studs);
		}

		System.out.println("1번-----------------------");

		for (String kind : rms.cate) {
			System.out.println(kind + " >>>>>>>>>>");

			for (int i = 1; i <= studs.length; i++) {
				for (ReturnStud me : studs) {
					if (kind.equals(me.kind) && me.rank == i) {
						me.ppp();

					}
				}
			}
		}

		System.out.println("2번-----------------------");
		String title = "";
		for (int i = 0; i < studs.length; i++) {

			for (ReturnStud me : studs) {

				if (me.pos == i) {
					if (!title.equals(me.kind)) {
						title = me.kind;
						System.out.println(me.kind + " >>>>>>>>>>");
					}
					me.ppp();

				}
			}
		}

		System.out.println("3번-----------------------");

		rms.ppp();

	}

}