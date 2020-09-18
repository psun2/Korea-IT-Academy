
class Shape {

	// 원의 넓이 : 파이 알의 제곱
	// 원의 둘레 : 2파이알

	final double PI = Math.PI;
	String name;
	double circumference, area;

	public Shape(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	void circle(int radius) {

		// 원의 둘레
		double value = (2 * PI) * radius;
		this.circumference = position(value);

		// 원의 넓이
		value = PI * Math.pow(radius, 2);
		this.area = position(value);
		
		ppp();
	}

	double position(double value) {

		int temp = (int) (value * 100);

		return ((double) temp / 100);
	}

	void ppp() {

		System.out.println("Shape [name=" + name + ", circumference=" + circumference + ", area=" + area + "]");

	}

}

public class Test1 {

	public static void main(String[] args) {
		Shape shape = new Shape("원");
		shape.circle(5);
	}

}
