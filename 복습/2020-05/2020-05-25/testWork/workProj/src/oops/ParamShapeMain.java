package oops;

class ParamShape {
	String name;

	double border, area;

	void init(int... line) { // rest 문법은 배열형태로 들어옵니다.
		String[] title = { "원", "직사각형", "직각삼각형" };
		int p = line.length;
		double pi = 3.141592;
		name = title[p - 1];
		// 원 은 인자를 1개 받고, 직사각형은 2개, 직각삼각형은 3개의 인자를 받습니다.
		// index의 번호는 0 부터 시작하기 때문에 -1 을 하게 되면 if문 없이도 원하는 값의 title을 넣을수 있습니다.

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

public class ParamShapeMain {

	public static void main(String[] args) {

		ParamShape ps = new ParamShape();

		ps.init(5);
		ps.ppp();

		ps.init(5, 6);
		ps.ppp();

		ps.init(5, 6, 8);
		ps.ppp();
	
		
//		원	31.41592	78.5398
//		직사각형	22.0	30.0
//		직각삼각형	19.0	15.0
		
	}

}
