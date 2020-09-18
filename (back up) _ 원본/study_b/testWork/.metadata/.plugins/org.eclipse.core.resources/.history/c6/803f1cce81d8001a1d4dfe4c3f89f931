package dynamic_p;

abstract interface In1{
	
	//void meth_1() {}
	void meth_1();
	
	abstract void meth_2();
	
	int a = 10, c = 30,d=40;
}

interface In2{
	public final static int b = 2000;
	int c = 3000, d = 4000;
	void meth_1();
	
	void meth_3();
}

class Impl implements In1, In2{

	int d = 4567;
	int cc = In1.c;//상수가 겹칠 경우 인터페이스를 명시적으로 표기
	
	public void meth_1() {
		//a = 1234;
		System.out.println("Impl meth_1():"+a);	
	}

	
	public void meth_2() {
		System.out.println("Impl meth_2()");
	}


	
	public void meth_3() {
		System.out.println("Impl meth_3()");
	}
	
}


public class InterfaceMain {

	public static void main(String[] args) {
		
		In1 in1 = new In1() {
			
			@Override
			public void meth_2() {
				System.out.println("생성시 meth_2()");
				
			}
			
			@Override
			public void meth_1() {
				System.out.println("생성시 meth_1()");
				
			}
		};
		
		in1.meth_1();
		in1.meth_2();
		
		
		Impl imp = new Impl();
		imp.meth_1();
		imp.meth_2();
		imp.meth_3();
		
		System.out.println("In1--------------");
		In1 imp1 = imp;
		imp1.meth_1();
		imp1.meth_2();
		//imp1.meth_3();
		System.out.println("In2--------------");
		In2 imp2 = imp;
		imp2.meth_1();
		//imp2.meth_2();
		imp2.meth_3();
		
		System.out.println("상수--------------");
		//In1.a = 11111;
		//in1.a = 11111;
		//imp.a = 11111;
		//imp1.a = 11111;
		System.out.println("In1.a:"+In1.a);
		System.out.println("in1.a:"+in1.a);
		System.out.println("imp.a:"+imp.a);
		System.out.println("imp1.a:"+imp1.a);
		//System.out.println("imp2.a:"+imp2.a);
		
		
		//System.out.println("In1.b:"+In1.b);
		System.out.println("In2.b:"+In2.b);
		//System.out.println("in1.b:"+in1.b);
		System.out.println("imp.b:"+imp.b);
		//System.out.println("imp1.b:"+imp1.b);
		System.out.println("imp2.b:"+imp2.b);
		
		System.out.println("In1.c:"+In1.c);
		System.out.println("in1.c:"+in1.c);
		System.out.println("imp1.c:"+imp1.c);
		
		System.out.println("In2.c:"+In2.c);
		System.out.println("imp2.c:"+imp2.c);
		
		//System.out.println("imp.c:"+imp.c);
		
		
		System.out.println("In1.d:"+In1.d);
		System.out.println("in1.d:"+in1.d);
		System.out.println("imp1.d:"+imp1.d);
		
		System.out.println("In2.d:"+In2.d);
		System.out.println("imp2.d:"+imp2.d);
		imp.d = 7890;
		System.out.println("imp.d:"+imp.d);  //클래스에서 정의한 d 출력
		System.out.println("imp.cc:"+imp.cc);
		
		
//		System.out.println("In1.cc:"+In1.cc);
//		System.out.println("in1.cc:"+in1.cc);
//		System.out.println("imp1.cc:"+imp1.cc);
//		
//		System.out.println("In2.cc:"+In2.cc);
//		System.out.println("imp2.cc:"+imp2.cc);

	}

}

