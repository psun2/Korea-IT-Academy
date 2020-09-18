package note;

// ✔ hiding 이라는 개념은 굉장한 오류와 실수를 유발 할 수 있으므로 특히 주의합니다.✔

class Pather {
	String name;

	void show() {
		System.out.println(name);
	}

}

class Child extends Pather {

	Child(String name) {
		this.name = name;
	}

	void show() {
		System.out.println("오버라이딩 된 자식의 show 메소드: " + name);
	}

}

class Child2 extends Pather {

	String name;

	Child2(String name) {
		this.name = name;
	}

}

class Child3 extends Pather {

	String name;

	Child3(String name) {
		this.name = name;
	}

	void show() {
		System.out.println("하이딩된 자식의 내부 변수의 name 값을 보기 위해 메소드를 오버라이딩 합니다. " + name);
	}

}

class Child4 extends Pather {

	String name;

	Child4(String name) {
		super.name = name;
	}

}

class Child5 extends Pather {

	String name;

	Child5(String name) {
		super.name = name;
	}

	void show() {
		System.out.println("super.name,  this.name: " + super.name + ", " + this.name);
	}

}

public class HidingAndOverriding {

	public static void main(String[] args) {

		Pather pather = new Pather();

		Child child = new Child("상속과 오버라이딩"); // 부모와 공유하는 name 변수 즉 자식의 this.name 에 준 값이 출력 됩니다.

		Child2 child2 = new Child2("hiding"); // 하이딩 되어 부모의 name 변수를 자식의 name 변수가 가리고 있기 때문에 null 이 출력 됩니다.

		Child3 child3 = new Child3("하이딩 과 오버라이딩"); // 생성자로 받은 parameter을 super.name 을 통해 부모에게 직접적으로 입력합니다.

		Child4 child4 = new Child4("super.name"); // 생성자로 받은 parameter을 super.name 을 통해 부모에게 직접적으로 입력합니다.

		Child5 child5 = new Child5("출력"); // 생성자로 받은 parameter을 super.name 을 통해 부모에게 직접적으로 입력합니다.

		pather.show(); // null

		child.show(); // 오버라이딩 된 자식의 show 메소드: 상속과 오버라이딩

		child2.show(); // null

		child3.show(); // 하이딩된 자식의 내부 변수의 name 값을 보기 위해 메소드를 오버라이딩 합니다. 하이딩 과 오버라이딩

		child4.show(); // super.name

		child5.show(); // super.name, this.name: 출력, null

		pather.show(); // null

		// ✔ hiding 이라는 개념은 굉장한 오류와 실수를 유발 할 수 있으므로 특히 주의합니다.✔

	}

}
