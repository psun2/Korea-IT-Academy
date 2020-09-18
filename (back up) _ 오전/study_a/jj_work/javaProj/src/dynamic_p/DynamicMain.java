package dynamic_p;

class DyUncle{
	int a = 10;
	int b = 20;
	
	void meth_1() {
		System.out.println("부모 meth_1()");
	}
	
	void meth_2() {
		System.out.println("부모 meth_2()");
	}
}

class DyPar{
	int a = 10;
	int b = 20;
	
	void meth_1() {
		System.out.println("부모 meth_1()");
	}
	
	void meth_2() {
		System.out.println("부모 meth_2()");
	}
}
class DyChild extends DyPar{
	
	int b = 2222;		///hiding
	int c = 3333;
	
	void meth_2() {		//overriding
		System.out.println("자식 meth_2() 오버라이딩:"+c);
	}
	void meth_3() {
		System.out.println("자식 meth_3()");
	}
}




public class DynamicMain {

	public static void main(String[] args) {
		DyPar pp = new DyPar();
		DyPar pc = new DyChild();
		//DyChild cp = new DyPar();  
		DyChild cc = new DyChild();
		
		System.out.println("pp >>>>>>>>>>>>");
		System.out.println("pp.a:"+pp.a);
		System.out.println("pp.b:"+pp.b);
		//System.out.println("pp.c:"+pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		
		System.out.println("pc >>>>>>>>>>>>");
		System.out.println("pc.a:"+pc.a);
		System.out.println("pc.b:"+pc.b); //부모
		//System.out.println("pc.c:"+pc.c);
		pc.meth_1();
		pc.meth_2();
		//pc.meth_3();
		
		System.out.println("cc >>>>>>>>>>>>");
		cc.b = 2468;
		cc.c = 3456;
		System.out.println("cc.a:"+cc.a);
		System.out.println("cc.b:"+cc.b); //자식
		System.out.println("cc.c:"+cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		
		System.out.println("[[[ Casting ]]]");
		
		DyPar pcc = cc;  /// 부모  <- 자식  : 자동 형변환
		
		System.out.println("pcc >>>>>>>>>>>>");
		System.out.println("pcc.a:"+pcc.a);
		System.out.println("pcc.b:"+pcc.b); //부모
		//System.out.println("pcc.c:"+pcc.c);
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
		DyChild cpcc = (DyChild)pcc;  /// 자식  <- 부모  : 명시적 형변환
		System.out.println("cpcc.a:"+cpcc.a);
		System.out.println("cpcc.b:"+cpcc.b); //자식
		System.out.println("cpcc.c:"+cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		DyChild cpc = (DyChild)pc;
		//DyChild cpp = (DyChild)pp;  //명시적 형변환 : 코드 만으로 변환가능 유무 확인 불가
		
		DyUncle dd = new DyUncle();
		//DyPar pdd = (DyPar)dd;  클래스간 형변환 대입은 상속 관계에서만 가능
		
		System.out.println("pp > DyPar:"+ (pp instanceof DyPar));
		System.out.println("pp > DyChild:"+ (pp instanceof DyChild));
		System.out.println("pc > DyPar:"+ (pc instanceof DyPar));
		System.out.println("pc > DyChild:"+ (pc instanceof DyChild));
		System.out.println("cc > DyPar:"+ (cc instanceof DyPar));
		System.out.println("cc > DyChild:"+ (cc instanceof DyChild));
	}

}

