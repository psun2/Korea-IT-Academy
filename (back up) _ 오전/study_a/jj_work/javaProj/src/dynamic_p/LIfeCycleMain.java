package dynamic_p;

class LCPar{
	int a = goA();
	static int b = goSB();
	
	LCPar(int a) {
		System.out.println("부모 생성자:"+a);
		this.a = a;
	}
	
	int goA() {
		System.out.println("부모 goA()");
		return 10;
	}
	
	static int goSB() {
		System.out.println("부모 static goSB()");
		return 20;
	}
}

class LCChild extends LCPar{
	int f = 5555;
	int a = goA2();  //hiding  -- 두번 호출됨
	int c = goA();
	static int d = goSD();
	
	LCChild(int a) {
		//super(c); 에러 - 부모 생성자 이전 자식 멤버가 할당되지 않음
		super(a);
		//super(goA()); 에러 
		//super(goZ()); 에러
		//super(d);   --- 부모여도  생성자 인수로 static 가능
		//super(goSD() ); 부모여도  생성자 인수로 static 가능
		System.out.println("자식 생성자1");
	}
	
	LCChild() {
		//super(8888 ); 에러     부모를 두번 생성하는 형태가 됨
		this(1234);  //생성자를 위임 - 생성자 인수로 상수 ,  static 만 가능 
		//this(d);   //static  가능
		//this(c);  // 일반 멤버변수 불가  -- 생성전이므로 객체가 존재하지 않음!!!
		//this(a);  // 부모 일반 멤버변수 불가
		//super(8888 );  에러   부모보다 자식을 우선할 수 없음
		System.out.println("자식 생성자2");
	}
	
	int goA() {
		System.out.println("자식 goA() - 오버라이딩:"+f);
		return f;
	}
	
	int goA2() {
		System.out.println("자식 goA2()");
		return 6666;
	}
	
	int goC() {
		System.out.println("자식 goC()");
		return 3333;
	}
	
	int goZ() {
		System.out.println("자식 goZ()");
		return 9999;
	}
	
	static int goSD() {
		System.out.println("자식 static goSD()");
		return 4444;
	}
	
	
}

public class LIfeCycleMain {

	public static void main(String[] args) {
		LCPar pp = new LCPar(963);
		System.out.println("-----------------");
		//LCChild cc = new LCChild(1010);
		LCChild cc = new LCChild();

	}

}
