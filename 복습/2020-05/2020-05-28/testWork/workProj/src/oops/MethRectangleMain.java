package oops;

class MethRec {
	int ww, hh, area, border;

	void init(int ww, int hh) {
		this.ww = ww;
		this.hh = hh;
		area = ww * hh;
		border = (ww + hh) * 2;
	}

	void ppp() {
		System.out.println("직사각형 " + ww + "," + hh + "," + area + "," + border);
	}
}

public class MethRectangleMain {

	public static void main(String[] args) {
		MethRec[] mr = new MethRec[5];

		for (int i = 0; i < mr.length; i++) {
			mr[i] = new MethRec();
		}

		mr[0].init(5, 6);
		mr[1].init(6, 6);
		mr[2].init(7, 9);
		mr[3].init(8, 30);
		mr[4].init(10, 6);

		for (MethRec m : mr) {
			m.ppp();
		}

	}

}