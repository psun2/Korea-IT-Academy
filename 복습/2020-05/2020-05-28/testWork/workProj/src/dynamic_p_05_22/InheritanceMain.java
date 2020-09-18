package dynamic_p_05_22;

class Grand {

	int gg = 100;

	void meth_g() {
		System.out.println("할아버지 meth_g 실행");
	}
}

class InPar extends Grand {
	int a = 10;
	int b = 20;
	int gg = 1234;
	int p_gg = super.gg;

	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}

	void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}

	void meth_g() {
		System.out.println("부모 meth_g 실행");
	}

}

class InUncle {

}

class InChild extends InPar {// , InUncle{ 다중 상속 불가
	int c = 30000;
	int a = 10000; // hiding

	int p_a = super.a;
	// int p_gg = super.super.gg;
	// int p_gg = homeplus.gg;

	void meth_1() { // overriding
		System.out.println("자식 meth_1() 실행");
	}

	void meth_3() {
		System.out.println("자식 meth_3() 실행");
	}

	void meth_p_1() {
		super.meth_1();
	}
}

class InChild2 extends InPar {
	int d = 3456;

	void meth_4() {
		System.out.println("자식2 meth_4() 실행");
	}
}

public class InheritanceMain {

	public static void main(String[] args) {
		InPar pp = new InPar();
		InChild cc = new InChild();
		InChild2 cc2 = new InChild2();

		System.out.println("pp.gg:" + pp.gg);
		System.out.println("pp.a:" + pp.a);
		System.out.println("pp.b:" + pp.b);
		// System.out.println("pp.c:"+pp.c);

		pp.meth_g();
		pp.meth_1();
		pp.meth_2();
		// pp.meth_3();

		System.out.println("cc.gg:" + cc.gg);
		System.out.println("cc.p_gg:" + cc.p_gg);
		System.out.println("cc.a:" + cc.a);
		System.out.println("cc.p_a:" + cc.p_a);
		System.out.println("cc.b:" + cc.b);
		System.out.println("cc.c:" + cc.c);
		// System.out.println("cc.d:"+cc.d);
		cc.meth_g();
		cc.meth_1();
		cc.meth_p_1();
		cc.meth_2();
		cc.meth_3();
		// cc.meth_4();

		System.out.println("cc2.a:" + cc2.a);
		System.out.println("cc2.b:" + cc2.b);
		// System.out.println("cc2.c:"+cc2.c);
		System.out.println("cc2.d:" + cc2.d);
		cc2.meth_1();
		cc2.meth_2();
		// cc2.meth_3();
		cc2.meth_4();

	}

}