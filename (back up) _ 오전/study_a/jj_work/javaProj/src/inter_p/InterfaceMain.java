package inter_p;

import pac_p.pac_2.InC;

abstract interface InA{  //interface의 정의
	//void meth_1() {}
	abstract void meth_1();  //method는 추상화
	void meth_2();
	
	//int a; 상수 - 초기값 없으면 에러
	int a = 10;//public, static, final 이 생략
	int b = 20;
	int d = 40;
}

interface InB{  
	void meth_1(); 	//메소드가 겹쳐져도 상관없음
	void meth_3();
	int b = 234;
	int d = 456;
}

				//interface 구현, 다중 구현이 가능
class ImpAAA  implements InA, InB, InC{ //extends InA{

	int d = 123456;  //hiding
	@Override
	public void meth_1() {
		System.out.println("ImpAAA.meth_1() 실행");
	}

	@Override
	public void meth_2() {
		System.out.println("ImpAAA.meth_2() 실행");
		
	}  
	
	@Override
	public void meth_3() {
		System.out.println("ImpAAA.meth_3() 실행");
		
	}

	@Override
	public void meth_4() {  //public으로 인지
		System.out.println("ImpAAA.meth_4() 실행"); 
		
	}  
	
}

public class InterfaceMain {

	public static void main(String[] args) {
		//InA.a = 1357;  상수 : 대입불가
		System.out.println("InA.a:"+InA.a);
		System.out.println("InC.c:"+InC.c);
		//InA ia = new InA(); 에러
		ImpAAA aa = new ImpAAA();
		InA ia = aa; 
		InB ib = aa;
		InC ic = aa;
		
		InA iia = new InA() {

			@Override
			public void meth_1() {
				System.out.println("생성시 meth_1() 실행");
			}

			@Override
			public void meth_2() {
				System.out.println("생성시 meth_2() 실행");
			}
			
		};
		
		System.out.println("aa:---------------");
		aa.meth_1();
		aa.meth_2();
		aa.meth_3();
		aa.meth_4();
		System.out.println("aa.a:"+aa.a);
		//System.out.println("aa.b:"+aa.b);
		System.out.println("aa.c:"+aa.c);
		System.out.println("aa.d:"+aa.d);
		System.out.println("ia:---------------");
		ia.meth_1();
		ia.meth_2();
		//ia.meth_3();
		//ia.meth_4();
		System.out.println("ia.a:"+ia.a);
		System.out.println("ia.b:"+ia.b);
		//System.out.println("ia.c:"+ia.c);
		System.out.println("ia.d:"+ia.d);
		System.out.println("ib:---------------");
		ib.meth_1();
		//ib.meth_2();
		ib.meth_3();
		//ib.meth_4();
		//System.out.println("ib.a:"+ib.a);
		System.out.println("ib.b:"+ib.b);
		System.out.println("ib.d:"+ib.d);
		System.out.println("ic:---------------");
		ic.meth_1();
		//ic.meth_2();
		//ic.meth_3();
		ic.meth_4();
		
		System.out.println("iia:---------------");
		iia.meth_1();
		iia.meth_2();

		System.out.println("iia.a:"+iia.a);
		System.out.println("iia.b:"+iia.b);
		System.out.println("iia.d:"+iia.d);

	}

}
