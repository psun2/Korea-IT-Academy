package oops_p;

class StaticCla_A{
	
	int a = goA();
	
	int b = goB();
	
	//static int sa = goA(); 인스턴스 메소드로 초기화 불가
	static int sa = goS_A();
	
	int goA() {
		System.out.println("goA()");
		return 10;
	}
	
	int goB() {
		System.out.println("goB()");
		return c;
	}
	
	int c = 30;
	
	String ppp() {
		return a+","+b+","+c;
	}
	
	static int sb = goS_B();
	
	static int goS_A() {
		System.out.println("goS_A()");
		return 1000;
	}
	
	static int goS_B() {
		System.out.println("goS_B()");
		//return c; 인스턴스 멤버변수 접근 불가
		return sc;
	}
	
	static int sc = 3000;
	
	void meth_1() {
		System.out.println("인스턴스 meth_1()  시작  ---"+a+","+sa);
		meth_2();
		meth_s2();  //인스턴스 메소드는  static 요소를 호출 가능
		System.out.println("인스턴스 meth_1()  끝  ---");
	}
	
	static void meth_s1() {
		//System.out.println("static meth_s1()  시작  ---"+a+","+sa); 인스턴스 a 호출불가
		System.out.println("static meth_s1()  시작  ---"+sa);
		//meth_2();  //static 메소드는  인스턴스 요소를 호출 불가
		meth_s2();
		System.out.println("static meth_s1()  끝  ---");
	}
	
	void meth_2() {
		System.out.println("인스턴스 meth_2()");	
	}
	
	static void meth_s2() {
		System.out.println("static meth_s2()");
	}
	
}
class StaticCla_B{
	
	int a = 123;
	static int sa = 456;  //다른 클래스의 정의된  static 과 공유하지 않음
}

public class StaticMain {

	public static void main(String[] args) {
		
		//StaticCla_A.sb = 2222;
		//StaticCla_A.b = 2222;
		StaticCla_A.meth_s1();
		System.out.println("sa_1 생성전-----------------");
		StaticCla_A sa_1 = new StaticCla_A();
		System.out.println("sa_2 생성전-----------------");
		StaticCla_A sa_2 = new StaticCla_A();
		System.out.println("-----------------");
		
		System.out.println("sa_1:"+sa_1.ppp());
		System.out.println("sa_2:"+sa_2.ppp());
		System.out.println("변경전-----------------");
		System.out.println("sa_1:"+sa_1.a+","+sa_1.sa);
		System.out.println("sa_2:"+sa_2.a+","+sa_2.sa);
		System.out.println("변경후-----------------");
		sa_1.a = 11;
		sa_1.sa = 1111;
		System.out.println("sa_1:"+sa_1.a+","+sa_1.sa+","+sa_1.sb+","+sa_1.sc);
		System.out.println("sa_2:"+sa_2.a+","+sa_2.sa+","+sa_2.sb+","+sa_2.sc);
		

		System.out.println(">>>>>>");
		StaticCla_B sb_1 = new StaticCla_B();
		
		System.out.println("sa_1:"+sa_1.a+","+sa_1.sa);
		System.out.println("sb_1:"+sb_1.a+","+sb_1.sa);
		System.out.println(">>>>>>");
		
		sa_1.meth_1();
		sa_1.meth_s1();
		
	}

}
