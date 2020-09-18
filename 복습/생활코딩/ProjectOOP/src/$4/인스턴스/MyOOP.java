package $4.인스턴스;

public class MyOOP {

	public static void main(String[] args) {

		// 원상태의 냉장고를 class 라고 한다면,
		// 사람들은 자신의 냉장고에 각기 다른 음식들을 집어 넣을 것 입니다.
		// 그 각 개인의 냉장고를 instance 라 합니다.

		Print p1 = new Print();
		p1.delmiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();

		Print p2 = new Print();
		p2.delmiter = "****";
		p1.A();
		p1.A();
		p1.B();
		p1.B();

		// 상태변경의 불편함 => instance
//		Print.delmiter = "----";
//		Print.A();
//
//		Print.delmiter = "****";
//		Print.A();

//		즉 인스턴스 마다 가지고 있는 delmiter 가 다르기 때문에
//		필요한 상태에 따라서 p1, p2를 결정하여 사용 하면 됩니다.
		p1.A();
		p2.A();
		p1.A();
		p2.A();

	}

}
