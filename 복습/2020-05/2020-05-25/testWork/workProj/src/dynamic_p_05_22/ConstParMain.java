package dynamic_p_05_22;

class ConsChild extends ConsPar { // 부모와 자식 클래스간의 위치는 상관없음 hoisting
	int c = initC(); // 10. 자식의 인스턴스 변수를 설정하기 위해 => 현재의 c = 1111;
	static int d = initD(); // 3. 자식의 스태틱 변수를 설정하기 위해 => 현재의 d = 2222

	ConsChild(int c, int dd) { // 7. 부모의 생성자를 실행하기 위해
		super(d, dd); // 8. super(2222, 456) 메소드로 부모의 생성자에 argument를 넘겨 부모 생성자 호출
		this.d = c; // 11. 인스턴스 설정이 끝나고 마지막으로 자식의 생성자가 실행 이때 d 의 값을 받아온 c 123 으로 바꾸어 준다.
	}

	int initC() { // 11. 자식의 인스턴스 메소드가 실행
		System.out.println("자식 c : 1111");
		return 1111;
	}

	static int initD() { // 4. 자식의 스태틱 메소드가 실행
		System.out.println("자식 static d : 2222");
		return 2222;
	}

	void ppp() {
		System.out.println(a + "," + b + "," + c + "," + d);
		// 모든 과정을 통해 1 ~ 11 번 까지의 과정을 통해
		// 2222, 456, 1111, 123 이 출력
	}

}

class ConsPar { // 부모와 자식 클래스간의 위치는 상관없음 hoisting
	int a = initA(); // 5. 부모의 인스턴스 변수를 설정하기 위해 => 현재의 a = 1
	static int b = initB(); // 1. 부모의 스태틱 변수를 설정하기위해 => 현재의 b = 2

	ConsPar(int a, int b) { // 9. 자식의 부름을 받아 부모의 생성자가 호출되어 값을 변경
		System.out.println("부모 생성자");
		this.a = a; // => 현재의 a = 2222
		this.b = b; // => 현재의 b = 456
	}

	int initA() { // 6. 부모의 인스턴스 메소드가 실행
		System.out.println("부모 a : 1");
		return 1;
	}

	static int initB() { // 2. 부모의 스태틱 메소드가 실행
		System.out.println("부모 static b : 2");
		return 2;
	}

}

public class ConstParMain {

	public static void main(String[] args) {

		ConsChild cc = new ConsChild(123, 456);
		cc.ppp();

	}

}
