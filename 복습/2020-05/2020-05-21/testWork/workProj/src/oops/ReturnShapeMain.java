package oops;

class ReturnShape {
	String name;

	double border, area;

	void init(int... line) {
		String[] title = { "원", "직사각형", "직각삼각형" };
		int p = line.length;
		double pi = 3.141592;
		name = title[p - 1];

		switch (p) {
		case 1:
			border = line[0] * pi * 2;
			area = line[0] * line[0] * pi;
			break;
		case 2:
			border = (line[0] + line[1]) * 2;
			area = line[0] * line[1];
			break;
		case 3:
			border = line[0] + line[1] + line[2];
			area = line[0] * line[1] / 2;
			break;

		}
	}

	void ppp() {
		String ttt = name + "\t" + border + "\t" + area;
		System.out.println(ttt);
	}
}

class ReturnMakeShape {

	ReturnShape make(int... is) {
		ReturnShape result = new ReturnShape();
		result.init(is);
		return result;
	}

}

public class ReturnShapeMain {

	public static void main(String[] args) {
		ReturnShape[] arr = { new ReturnShape(), new ReturnShape(), new ReturnShape() };
		arr[0].init(5);

		for (ReturnShape sh : arr) {
			sh.ppp();
		}

		System.out.println("----------------");

		ReturnMakeShape rms = new ReturnMakeShape();

		ReturnShape[] arr2 = { rms.make(5), rms.make(5, 6), rms.make(5, 6, 8)

		};

		for (ReturnShape sh : arr2) {
			sh.ppp();
		}
		
//		원	31.41592	78.5398
//		null	0.0	0.0
//		null	0.0	0.0
//		----------------
//		원	31.41592	78.5398
//		직사각형	22.0	30.0
//		직각삼각형	19.0	15.0


	}

}