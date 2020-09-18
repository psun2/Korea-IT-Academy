package oops;

class ClaSta{

	int a = initA();
	//int b = b2;
	int b = initB();
	
	
	int initA() {
		System.out.println("a 선언");
		return 10;
	}
	
	int initB() {
		System.out.println("b 선언");
		return b2;
	}
	
	int b2 = 30;
	
	void ins_1() {
		System.out.println("인스턴스 메소드 1 시작--------():"+a+","+b+","+c+","+d);
		ins_2();
		sta_2();
		System.out.println("인스턴스 메소드 1 끝-----------()");
	}
	
	void ins_2() {
		System.out.println("인스턴스 메소드 2 실행()");
	}
	
	static void sta_1() {
		//System.out.println("static 메소드 1 시작--------():"+a+","+b+","+c+","+d);
		//static --> static 만 호출 가능
		System.out.println("static 메소드 1 시작--------():"+c+","+d);
		//ins_2();
		sta_2();
		System.out.println("static 메소드 1 끝--------()");
	}
	static void sta_2() {
		System.out.println("static 메소드 2 실행()");
	}
	
	static int c = initC(); //initA(); //static이  instance보다 먼저 선언 instance 멤버 호출불가 
	//static int d = d2;
	static int d = initD();
	static int initC() {
		System.out.println("c 선언");
		return 1000;
	}
	
	static int initD() {
		System.out.println("d 선언");
		return d2;
	}
	static int d2 = 3000;
}
public class StaticMain {

	public static void main(String[] args) {
		//System.out.println("cs1:"+cs1.a+","+cs1.b+","+cs1.c+","+cs1.d);
		//System.out.println("ClaSta:"+ClaSta.a+","+ClaSta.b+","+ClaSta.c+","+ClaSta.d);
		System.out.println("ClaSta:"+ClaSta.c+","+ClaSta.d);
		ClaSta.sta_1();
		//ClaSta.ins_1();
		System.out.println("-----------------");
		ClaSta cs1 = new ClaSta();
		System.out.println("-----------------");
		ClaSta cs2 = new ClaSta();
		System.out.println("-----------------");
		
		System.out.println("변경전:");
		System.out.println("cs1:"+cs1.a+","+cs1.b+","+cs1.b2+","+cs1.c+","+cs1.d);
		System.out.println("cs2:"+cs2.a+","+cs2.b+","+cs2.b2+","+cs2.c+","+cs2.d);
		cs1.a = 17;
		cs1.c= 1111;
		System.out.println("변경후:");
		System.out.println("cs1:"+cs1.a+","+cs1.b+","+cs1.c+","+cs1.d);
		System.out.println("cs2:"+cs2.a+","+cs2.b+","+cs2.c+","+cs2.d);
		cs1.ins_1();
		cs1.sta_1();
		System.out.println();
		System.out.println("cs1.initB():"+cs1.initB());
	}

}
