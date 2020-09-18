package oops;

class MethShape {
	String name;
	double area, border;

	void rec(int w, int h) {
		name = "직사각혈";
		area = w * h;
		border = (w + h) * 2;
	}

	void circle(int r) {
		name = "원";
		double pi = 3.141592;
		area = r * r * pi;
		border = r * pi * 2;
	}

	void tri(int w, int h, int l) {
		name = "직각삼각형";
		area = w * h / 2;
		border = w + h + l;
	}

	void ppp() {
		System.out.println(name + "\t" + area + "\t" + border);
	}
}

public class MethShapeMain {

	public static void main(String[] args) {
		MethShape[] shapes = new MethShape[5];

		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = new MethShape();
		}

		shapes[0].rec(5, 6);
		shapes[1].circle(6);
		shapes[2].tri(5, 6, 8);
		shapes[3].rec(10, 20);
		shapes[4].circle(10);

		for (MethShape sh : shapes) {
			sh.ppp();
		}
		
		
//		직사각혈	30.0	22.0
//		원	113.097312	37.699104000000005
//		직각삼각형	15.0	19.0
//		직사각혈	200.0	60.0
//		원	314.1592	62.83184

		

	}

}