package $5.스태틱;

class Foo {

	public static String classVar = "I class var";
	public String instanceVar = "I instance var";

	public static void classMethod() {
		// 클래스 메소드 내에서는 클래스 변수에는 접근이 가능하나,
		// 인스턴스 변수에는 접근이 불가능 합니다.
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error 인스턴스 변수 접근 불가
	}

	public void instanceMethod() {
		// 인스턴스 메소드에서는 클래스 변수와 인스턴스변수 모두 접근이 가능합니다.
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}

}

public class StaticApp {

	public static void main(String[] args) {

		System.out.println(Foo.classVar); // OK
		// 클래스를 통해서 당연히 클래스의 변수에 접근이 됩니다.

//		System.out.println(Foo.instanceVar); // Error
		// 인스턴스 변수는 인스턴스를 통해서 사용하도록 고안된 변수 입니다.

		Foo.classMethod(); // OK
//		Foo.indtanceMethod(); // Error
		// 인스턴스 메소드는 인스턴스 소속이기 때문에 클래스를 통해 접근 할 수 없습니다.

		Foo f1 = new Foo(); // 인스턴스 생성
		Foo f2 = new Foo(); // 인스턴스 생성
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var

		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1

		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var

	}

}
