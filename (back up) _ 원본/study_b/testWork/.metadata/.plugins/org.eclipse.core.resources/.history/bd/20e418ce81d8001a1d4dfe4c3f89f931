package dynamic_p;

class CastPar{
	
	String name = "부모";
	int a = 10, b = 20;
	
	void meth_1() {
		System.out.println("부모 meth_1():"+a+","+b);
	}

	void meth_2() {
		System.out.println("부모 meth_2()");
	}
}

class CastChild extends CastPar{
	
	String name = "자식";
	int a = 1000, c = 2000;
	
	void meth_1() {
		System.out.println("자식 meth_1()"+a+","+b+","+c);
	}

	void meth_3() {
		System.out.println("자식 meth_3()");
	}
}


class CastChild2 extends CastPar{
	
	String name = "자식";
	int a = 1000, c = 2000;
	
	void meth_1() {
		System.out.println("자식 meth_1()"+a+","+b+","+c);
	}

	void meth_3() {
		System.out.println("자식 meth_3()");
	}
}


public class CastingClassMain {

	public static void main(String[] args) {
		CastPar pp = new CastPar();
		CastPar pc = new CastChild();
		//CastChild cp = new CastPar();
		CastChild cc = new CastChild();
		//CastChild2 cc2 = (CastChild2)new CastChild(); 형제로 형변환 불가
		CastChild2 cc2 = new CastChild2();
		
		
		System.out.println("pp.name:"+pp.name);
		System.out.println("pc.name:"+pc.name);
		System.out.println("cc.name:"+cc.name);
		cc.a = 123;
		System.out.println("cc.a:"+cc.a);
		System.out.println("cc.c:"+cc.c);
		pp.meth_1();
		pc.meth_1();
		//pc.meth_3();
		cc.meth_1();
		cc.meth_3();
		
		CastPar pcc = cc;
		System.out.println("pcc.a:"+pcc.a);
		//System.out.println("pcc.c:"+pcc.c);
		pcc.meth_1();
		//pcc.meth_3();
		
		CastChild cpcc = (CastChild)pcc;
		System.out.println("cpcc.a:"+cpcc.a);
		System.out.println("cpcc.c:"+cpcc.c);
		cpcc.meth_1();
		cpcc.meth_3();
		System.out.println("instanceof -----------");
		System.out.println(pp instanceof CastPar);
		System.out.println(pp instanceof CastChild);
		System.out.println(cc instanceof CastPar);
		System.out.println(cc instanceof CastChild);
		//System.out.println(cc instanceof CastChild2);
		System.out.println(pcc instanceof CastPar);
		System.out.println(pcc instanceof CastChild);
		System.out.println(cpcc instanceof CastPar);
		System.out.println(cpcc instanceof CastChild);
		System.out.println(cc2 instanceof CastPar);
		System.out.println(cc2 instanceof CastChild2);
		
		
	}

}
