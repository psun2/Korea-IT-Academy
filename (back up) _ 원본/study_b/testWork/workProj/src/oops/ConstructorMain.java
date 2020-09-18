package oops;

class Const{
	
	Const(int a, int b){ //생성자 호출은 생성시에만 1회 실행, 멤버변수의 초기화
		System.out.println("사용자 정의 생성자1");
		this.a = a;
		this.b = b;
	}
	
	Const(int a){ //생성자 호출은 생성시에만 1회 실행, 멤버변수의 초기화
		//Const(a,2020);
		this(a,2020);
		System.out.println("사용자 정의 생성자2");
		//this(a,2020);
	}
	
	Const() {
		System.out.println("기본 생성자");
		this.a = 5678;
		this.b = 9012;
	}
	
//	void Const(){   생성자와 혼동할 수 있으므로 생성자와 같은 이름의 메소드는 정의하지 않는다.
//		System.out.println("이것은 메소드임");
//	}
	
	int a = initA();
	static int b = initB();
	
	int initA() {
		System.out.println("initA()");
		//Const();
		return 10;
	}
	
	static int initB() {
		System.out.println("static initB()");
		return 2000;
	}
	
	void ppp() {
		System.out.println(a+","+b);
	}
}

public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("---------------");
		Const c1 = new Const(12,34);
		System.out.println("---------------");
		Const c2 = new Const();
		System.out.println("---------------");
		Const c3 = new Const(9999);
		System.out.println("---------------");
		//c1.new Const();
		//c1.Const();
		c1.ppp();
		c2.ppp();
		c3.ppp();

	}

}
