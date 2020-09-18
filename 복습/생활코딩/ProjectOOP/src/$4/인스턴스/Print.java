package $4.인스턴스;

class Print {
//	public static String delmiter = "";
	// static 이라는 접근제어자가 붙으면 delmiter 변수는 class 소속의 변수가 되고,
	// static 을 지우게 되면 instace 의 소속이 됩니다.
	// 즉 static 을 지움으로써, 인스턴스간에 delmiter 변수가 공유되지 않습니다.
	public String delmiter = "";

//	public static void A() {
	public void A() {
		System.out.println(delmiter); // MyOOP class 의 맴버 변수를 사용합니다.
		System.out.println("A");
		System.out.println("A");
	}

//	public static void B() {
	public void B() {
		System.out.println(delmiter); // MyOOP class 의 맴버 변수를 사용합니다.
		System.out.println("B");
		System.out.println("B");
	}

}
