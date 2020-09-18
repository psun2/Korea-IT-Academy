package oops;

class Method_function {

	int a = 10; // 맴버 변수
	int b = 20;

	// prameter O return O
	int method(int i, String str) {
		// 메소드 이름: method
		// 매개변수: int i, String str
		// 리턴형: int
		System.out.println("메소드가 실행됩니다." + i + ", " + str);
		return 1234;
	}

	// prameter X return X
	void meth_1() {
		System.out.println("meth_1() 실행 : prameter X, return X");
	}

	// prameter O return X
	void meth_2(int i, int j) {
		System.out.println("meth_2() 실행 : prameter (" + i + "," + j + "), return X");
	}

	// prameter X return O
	int meth_3() {
		System.out.println("meth_3() 실행 : prameter X, return O");
		return 9786;
	}

	void val_1() {
		System.out.println("val_1 실행 :" + a + "," + b); // 멤버변수 호출 가능
//		System.out.println("val_1 실행 :" + a + "," + b + "," + s);
		// 다른 메소드의 지역변수에 접근할 수 없습니다.
	}

	void val_2(int z) {
		a = z;// 멤버변수 대입
		// int z; 지역변수와 매개변수 이름 충돌
		int s = 2468; // 지역변수
		System.out.println("val_2 실행 :" + a + "," + b + "," + z + "," + s);
	}

	void val_3(int b) {
		// b : 매개변수(멤버변수 아님)
		System.out.println("val_3 실행 :" + a + "," + b + "," + this.b);
	}

	void init(int a, int b) { // 맴버 변수를 초기화 할 수 있습니다.
		this.a = a;
		this.b = b;
		System.out.println("init 실행 :" + a + "," + b);
	}

}

public class MethodMain {

	public static void main(String[] args) {

		Method_function function = new Method_function(); // 클래스의 인스턴스 생성

		function.method(100, "아기상어");
		// argument(인수) 를 입력한 메소드 호출
		int print = function.method(100, "아기상어");
		// fuction이 참조하고 있는 클래스의 method 의 이름을 가진 메소드는
		// return 값이 존재하고 그 값이 실수 이기때문에 int 형 변수에 return 값을 저장 할 수 있습니다.
		System.out.println("print: " + print); // 1234

		function.meth_1(); // prameter X return X
//		function.meth_1("prameter");
//		function.meth_1(123);
		// prameter을 받지 않기 때문에 argument 를 받을 수 없습니다.
//		print = function.meth_1(123);
		// return 값이 없기 때문에 변수에 저장 할 수 도 없습니다.

		function.meth_2(7, 5); // prameter O return X
//		function.meth_2();
		// parameter을 받는 함수로서 argument 를 입력하지 않으면 실행되지 않습니다.
//		function.meth_2("ㅁㄴㅇ", "ㅁㄴㅇ");
		// parameter의 형식이 int 이므로 argument에 int 값이 아닌 다른 값을 입력하면 실행되지 않습니다.
//		print = function.meth_2("ㅁㄴㅇ", "ㅁㄴㅇ");
		// return 값이 없기 때문에 변수에 저장 할 수 도 없습니다.

		function.meth_3(); // prameter X return O
		print = function.meth_3();
		System.out.println("print: " + print);
		System.out.println("ma.meth_3():" + function.meth_3());

		function.val_1();
		function.a = 1111;
		function.b = 2222;
		function.val_1();
		function.val_2(123456);
		function.val_1();
		// System.out.println(s);

		function.val_3(975);
		function.val_1();
		function.init(9988, 5544);
		function.val_1();
	}

}
