
class Shapes {

	final double PI = 3.141592; // 원주율
	final double squared = 2; // 제곱
	final int position = 100; // 소숫점의 자릿수

	String name;
	double width, height, radius; // 맴버 변수 선언

	void init(String name, double w, double h) { // 사각형과, 직각삼각형 맴버 변수 초기화 함수
		this.name = name;
		this.width = w;
		this.height = h;
	}

	void circleInit(String name, double r) { // 원의 반지름 맴버 변수 초기화 함수
		this.name = name;
		this.radius = r;
	}

	// 사각형 메소드
	void rectangle() {
		double result = width * height; // 사각형의 넓이 = 밑변 * 높이
		double circ = (width + height) * squared; // 사각형의 넓이 = (밑변 + 높이) * 2
		result = (double) (int) (result * position) / position; // 소수점 둘째 자리 까지 표시 합니다.
		circ = (double) (int) (circ * position) / position;
		this.print(result, circ);
	}

	// 원 메소드
	void circle() {
//		double result = Math.pow(radius, squared) * Math.PI;
		double result = (radius * radius) * PI; // 원의 넓이 = 반지름^2 * 원주율(PI)
		double circ = squared * PI * radius; // 원의 둘레 = 2 * PI * R
		result = (double) (int) (result * position) / position; // 소수점 둘째 자리 까지 표시 합니다.;
		circ = (double) (int) (circ * position) / position;
		this.print(result, circ);
	}

	// 직각삼각형 메소드
	void triangle() {
		double result = (width * height) * 0.5; // 직각삼각형 넓이 = 밑변 * 높이 * 1/2
//		double circ = Math.pow(width, squared) + Math.pow(height, squared); // 빗변의 길이 =  밑변^2 + 높이^2 = 빗변^2 
		double circ = (width * width) + (height * height);
//		circ = Math.sqrt(circ);
		circ = circ / circ;
		circ = circ + width + height;
		result = (double) (int) (result * position) / position; // 소수점 둘째 자리 까지 표시 합니다.
		circ = (double) (int) (circ * position) / position;
		this.print(result, circ);
	}

	// 출력 메소드
	void print(double area, double circ) {
		System.out.println(name + "의 넓이 를 구하는 메소드를 실행합니다.");
		System.out.println(name + " => " + "넓이: " + area + ", 둘레: " + circ + "\n");
	}
}

public class HomeWork_Shapes {

	public static void main(String[] args) {

		// 도형 클래스를 완성하세요

		// 멤버변수 : 도형 이름, 넓이, 둘레

		// 사각형메소드, 원메소드, 직각삼각형메소드,

		// 출력메소드 - 도형 이름, 넓이, 둘레

		Shapes shape = new Shapes();

		shape.init("사각형", 27.123, 13.157); // 사각형의 넓이를 구하기전 name, wdith, height 를 초기화 하는 메소드
		shape.rectangle(); // 사각형의 넓이를 구하는 메소드 실행

		shape.init("직각삼각형", 13.152, 9.78); // 삼각형의 넓이를 구하기전 name, wdith, height 를 초기화 하는 메소드
		shape.triangle(); // 삼각형의 넓이를 구하는 메소드 실행

		shape.circleInit("원", 5); // 원의 넓이를 구하기전 name, radius(반지름) 을 초기화 하는 메소드
		shape.circle(); // 원의 넓이를 구하는 메소드 실행

//		사각형의 넓이 를 구하는 메소드를 실행합니다.
//		사각형 => 넓이: 356.85, 둘레: 80.56
//
//		직각삼각형의 넓이 를 구하는 메소드를 실행합니다.
//		직각삼각형 => 넓이: 64.31, 둘레: 23.93
//
//		원의 넓이 를 구하는 메소드를 실행합니다.
//		원 => 넓이: 78.53, 둘레: 31.41

	}

}
