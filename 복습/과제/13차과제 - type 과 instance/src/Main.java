class A {
	int a;

	A(int a) {
		this.a = a;
	}

}

class B extends A {

	B(int b) {
		super(b);
	}
}

class C extends A {

	C(int c) {
		super(c);
	}

}

public class Main {

	public static void main(String[] args) {

		A a = new A(10);
		B b = new B(20);
		C c = new C(30);

		System.out.println("A class 의 a: " + a.a); // 10
		System.out.println("B class 의 a: " + b.a); // 20
		System.out.println("C class 의 a: " + c.a); // 30

		System.out.println(a); // A@15db9742
		System.out.println(b); // B@6d06d69c
		System.out.println(c); // C@7852e922
		System.out.println(a == b); // false => 상속을 받아도 주소는 다르다.
		System.out.println(a instanceof A); // true
		System.out.println(a instanceof B); // false
		System.out.println(a instanceof C); // false

		System.out.println();

		System.out.println(b instanceof A); // true
		System.out.println(b instanceof B); // true
//		System.out.println(b instanceof C); // error
		// Incompatible conditional operand types B and C
		// 호환되지 않는 조건부 피연산자 유형 B 및 C

		System.out.println();

		System.out.println(c instanceof A); // true
//		System.out.println(c instanceof B); // error
		// Incompatible conditional operand types C and B
		// 호환되지 않는 조건부 피연산자 유형 C 및 B
		System.out.println(c instanceof C); // true

		System.out.println(a.getClass()); // class A
		System.out.println(a.getClass().getName()); // A

//		13차과제 - 리팩토링 에서의 부모자료형의 배열에 자식들의 instance를 담을 수 있는 이유

//		System.out.println(Arrays.toString(students.students));
//		[SpecialStudent@15db9742, GeneralStudent@6d06d69c, GeneralStudent@7852e922, SpecialStudent@4e25154f, GeneralStudent@70dea4e, SpecialStudent@5c647e05, GeneralStudent@33909752, GeneralStudent@55f96302, GeneralStudent@3d4eac69, SpecialStudent@42a57993]

//		자료를 배열로 다루고 싶어 자료형의 type이 무엇인지 알아보기
//		자식 클래스는 부모 클래스의 자료형을 포함합니다.
//		GeneralStudent, SpecialStudent 두 클래스가 각각의 자료형이기도 하지만 한 부모로 상속 받기때문에 부모의 자료형을 사용 가능합니다.
//		Student 자료형의 배열은 GeneralStudent, SpecialStudent 두가지 자료형을 모두 담을 수 있습니다
//		상속받은 자식 자료형의 배열은 각각 자기 자신의 자료형과 부모의 자료형을 담 을 수 있습니다.

//		for (int i = 0; i < students.students.length; i++) {
//			if (i == 0)
//				System.out.println("students.students[i] instanceof Student");
//			System.out.print(students.students[i] instanceof Student);
//			System.out.print("\t");
//		}
//		true	true	true	true	true	true	true	true	true	true

//		for (int i = 0; i < students.students.length; i++) {
//			if (i == 0)
//				System.out.println("\nstudents.students[i] instanceof GeneralStudent");
//			System.out.print(students.students[i] instanceof GeneralStudent);
//			System.out.print("\t");
//		}
//		false	true	true	false	true	false	true	true	true	false	

//		for (int i = 0; i < students.students.length; i++) {
//			if (i == 0)
//				System.out.println("\nstudents.students[i] instanceof SpecialStudent");
//			System.out.print(students.students[i] instanceof SpecialStudent);
//			System.out.print("\t");
//		}
//		true	false	false	true	false	true	false	false	false	true

	}

}
