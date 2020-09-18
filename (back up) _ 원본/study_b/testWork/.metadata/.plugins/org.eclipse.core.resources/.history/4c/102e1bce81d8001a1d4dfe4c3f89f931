package dynamic_p;

class FiPar{
	
	int a = 10;
	final int b = 20;
	static int c = 30;
	final static int d = 40;  //상수화 변경 불가
	
	final int e;
	//final int f; 초기화 되지 않은 상수 선언 불가	
	
	public FiPar() {
		a = 12;
		//b = 23;  초기화 된 상수는 생성시 초기화 불가
		c = 34;
		//d = 45;
		e = 67;  // 초기화 되지 않은 상수 생성시 초기화 가능
	}
	
	void meth_1() {
		System.out.println("부모 meth_1()");
	}
	
	final void meth_2() {
		System.out.println("final 부모 meth_2()");
	}
	
	static void meth_3() {
		System.out.println("static 부모 meth_3()");
	}
	
	static final void meth_4() {
		System.out.println("static final 부모 meth_4()");
	}
	
	
}


class FiChild extends FiPar{
	int a = 99;
	final int b = 88;
	static int c = 77;
	final static int d = 66;  //상수화 변경 불가
	
	
	void meth_1() {
		System.out.println("자식 meth_1()");
	}
	
//	final void meth_2() {  재정의 불가
//		System.out.println("final 자식 meth_2()");
//	}
	
	static void meth_3() {
		System.out.println("static 자식 meth_3()");
	}
	
//	static final void meth_4() {재정의 불가
//		System.out.println("static final 자식 meth_4()");
//	}
}

public class FinalMain {

	public static void main(String[] args) {
		FiPar.c = 3333;
		//FiPar.d = 4444;
		System.out.println(FiPar.c);
		System.out.println(FiPar.d);
		
		FiPar pp = new FiPar();
		pp.a = 1010;
		//pp.b = 2020;
		pp.c = 3030;
		//pp.d = 4040;
		
		System.out.println(pp.a);
		System.out.println(pp.b);
		System.out.println(pp.c);
		System.out.println(pp.d);
		
		pp.meth_1();
		pp.meth_2();
		pp.meth_3();
		pp.meth_4();
		
		System.out.println();
		FiChild.c = 3333;
		//FiChild.d = 4444;
		System.out.println(FiPar.c);
		System.out.println(FiPar.d);
		
		FiChild cc = new FiChild();
		
		
		
		
		cc.a = 1010;
		//cc.b = 2020;
		cc.c = 3030;
		//cc.d = 4040;
		
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		System.out.println(cc.d);
		
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		cc.meth_4();

	}

}
