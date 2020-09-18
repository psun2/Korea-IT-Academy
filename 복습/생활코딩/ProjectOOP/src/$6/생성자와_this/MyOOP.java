package $6.생성자와_this;

public class MyOOP {

	public static void main(String[] args) {

		Print p1 = new Print("----"); // 생성자를 통하여 작업에 꼭 필요한 인자를 받을 수 있습니다.
//		p1.delmiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();

		Print p2 = new Print("****"); // 생성자를 통하여 작업에 꼭 필요한 인자를 받을 수 있습니다.
//		p2.delmiter = "****";
		p1.A();
		p1.A();
		p1.B();
		p1.B();

		p1.A();
		p2.A();
		p1.A();
		p2.A();

	}

}
