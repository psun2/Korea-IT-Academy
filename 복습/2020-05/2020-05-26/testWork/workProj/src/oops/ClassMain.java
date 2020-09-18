package oops;

//class							|	heap							|	main
//클래스를 변수 선언시 클래스란에 생성됩니다	|	배열과 같이 class의 주소를 가지게 됩니다.	|	클래스를 생성하면, 메인은 공간 만 가지고 있습니다.

class ClaAAA { // 클래스의 정의

	int aa = 10; // 맴버 변수
	String bb = "아기상어";

	int meth_1(int num) {
		if (num == 1)
			return num;
		else
			return num * meth_1(num - 1);
	}

}

public class ClassMain {

	public static void main(String[] args) {

		ClaAAA ca1; // 인스턴스 변수 선언 => 실체화
		ca1 = new ClaAAA(); // 변수 = 인스턴스 객체생성 => 실체화
							// 변수 = 객체 주소 대입

		ClaAAA ca2 = new ClaAAA();
		ClaAAA ca3 = ca2; // 배열과 마찬가지로 값 복사가 아닌 주소를 공유 합니다.

		ca1.aa = 123;
		ca2.bb = "엄마상어";
		System.out.println("ca1:" + ca1);
		System.out.println("ca1.aa:" + ca1.aa);
		System.out.println("ca1.bb:" + ca1.bb);
		ca1.meth_1(5);
		System.out.println(ca1.meth_1(5));

		System.out.println("ca2:" + ca2);
		System.out.println("ca2.aa:" + ca2.aa);
		System.out.println("ca2.bb:" + ca2.bb);
		ca2.meth_1(10);
		System.out.println(ca2.meth_1(10));

		System.out.println("ca3:" + ca3);
		System.out.println("ca3.aa:" + ca3.aa);
		System.out.println("ca3.bb:" + ca3.bb);
		ca3.meth_1(15);
		System.out.println(ca3.meth_1(15));

	}

}
