package dynamic_p_05_22;

class InHeriShape {
	String name;

	double border, area;

	void calc() {
		System.out.println("부모의 계산을 받아랐");
	}

	void ppp() {
		calc();
		System.out.println(name + ":" + area + "," + border);
	}
}

class InHeriRec extends InHeriShape {

	int w, h;
	String name;

	InHeriRec(int w, int h) {
		name = "직사각형";
//		super.name = "안알랴줌"; // 주석 처리시 출력 결과: null:30.0,22.0
		// why null ???????? => 자식의 name은 부모 변수 name 을 hiding 시켜, 자식에서 밖에 접근 되지 않는 지역변수
		// 입니다.
		// 즉 자식에서 hiding 을 시킴으로써 더이상 공유가 안되고, name은 부모의 자식 따로 따로 존재 하게 됩니다.
		// 부모를 상속 받으므로서, 부모의 변수, 메소드를 공유하게 되는대 이때 부모의 ppp() 에 있는 name 은 부모의 name을 참조 하게
		// 됩니다.
		// 부모의 name을 참조하는 이유는 공유되는 메소드에서의 name 은 공유 되는 변수가 되는 것 이므로, super.name을 따로 값을
		// 주거나
		// 또는 부모의 생성자를 만들어 값을 주는 방식이 있습니다.
		// area = w*h;
		// border = (w+h)*2;
		this.w = w;
		this.h = h;
	}

	void calc() {
		System.out.println("자식의 오버라이딩 계산이다");
		area = w * h;
		border = (w + h) * 2;

		System.out.println("자식의 name 변수: " + name);
	}

}

public class InHeriShapeMain {

	public static void main(String[] args) {

		InHeriRec rec = new InHeriRec(5, 6);
		InHeriRec rec1 = new InHeriRec(7, 8);
		rec.ppp();
		rec1.ppp();

		System.out.println();
		System.out.println(rec.name); // 직사각형
//		System.out.println(rec.super.name); // 자식에서 name hiding 시켯으므로 부모의 name 변수에 접근 할 방법은 없습니다.
//		System.out.println(super.rec.name);

	}

}