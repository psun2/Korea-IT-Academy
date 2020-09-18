package $2.변수와_메소드;

public class MyOOP {

	public static void main(String[] args) {

		System.out.println("delmiter: " + delmiter);

		// ..
		System.out.println("----");
		System.out.println("A");
		System.out.println("A");
		// ..
		System.out.println("----");
		System.out.println("A");
		System.out.println("A");
		// ..

		// 반복되는 코드를 하나의 메소드로 묶어 재사용 성을 높여 줍니다.

		delmiter = "----";
		// ..
		printA();
		// ..
		printA();
		// ..
		printB();
		// ..
		printB();
		// ..

		delmiter = "****";
		printA();
		// ..
		printA();
		// ..
		printB();
		// ..
		printB();
		// ..

	}

	public static String delmiter = ""; // MyOOP class 의 맴버 변수
	// static 은 공용으로 사용 할 수 있으며, static 변수는 클래스의 정의 와 함께 생성 됩니다.

	public static void printA() {
		System.out.println(delmiter); // MyOOP class 의 맴버 변수를 사용합니다.
		System.out.println("A");
		System.out.println("A");
	}

	public static void printB() {
		System.out.println(delmiter); // MyOOP class 의 맴버 변수를 사용합니다.
		System.out.println("B");
		System.out.println("B");
	}

}
