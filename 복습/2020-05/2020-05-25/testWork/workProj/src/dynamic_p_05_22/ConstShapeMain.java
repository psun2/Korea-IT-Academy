package dynamic_p_05_22;

class ConstShape {
	String name; // 5. 부모의 인스턴스 값에 설정됨.

	double border, area;

	ConstShape(String name) { // 3. 자식의 호출로 받아온 name 을 설정
		this.name = name; // 4. 부모의 인스턴스 변수 설정을 위해 먼저실행
	}

	void calc() {

		System.out.println("부모의 계산을 받아랐");
	}

	void ppp() { // 7. 자식에서 상속받은 ppp 메소드 실행
		calc(); // 8. calc 함수 실행
		System.out.println(name + ":" + area + "," + border); // 13. 출력
	}
}

class ConstRec extends ConstShape {

	int w, h;

	ConstRec(int w, int h) { // 1. 자식의 인스턴스 생성으로 인해 값을 받아옴.

		super("직사각형"); // 2. 부모의 생성자를 호출할때 name 값을 넘김

		this.w = w; // 6. 자식의 인스턴스 변수 셋팅
		this.h = h; // 6. 자식의 인스턴스 변수 셋팅
	}

	void calc() { // 9. 부모의 calc 메소드를 오버라이딩
		System.out.println("자식의 오버라이딩 계산이다"); // 10. 출력
		area = w * h; // 11. 부모의 area 인스턴스 변수 셋팅
		border = (w + h) * 2; // 12. 부모의 border 인스턴스 변수 셋팅
	}
}

class ConstCircle extends ConstShape {

	int r;

	ConstCircle(int r) {

		super("원");

		this.r = r;

	}

	void calc() {
		double pi = 3.141592;
		area = pi * r * r;
		border = pi * r * 2;
	}
}

public class ConstShapeMain {

	public static void main(String[] args) {

		ConstRec rec = new ConstRec(5, 6);
		ConstRec rec1 = new ConstRec(7, 8);
		ConstCircle cir = new ConstCircle(5);
		rec.ppp();
		rec1.ppp();
		cir.ppp();

	}

}