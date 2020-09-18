package dynamic_p;

class OverrGrand{
	int g1 = 1234;
	int g2 = 5678;
	
	void meth_g1() {
		System.out.println("�Ҿƹ��� meth_g1()");
	}
	void meth_g2() {
		System.out.println("�Ҿƹ��� meth_g2()");
	}
}

class OverrPar extends OverrGrand{

	int a = 10;		//hiding
	int b = 20;
	int g1 = 80;
	
	void meth_g1() {  //overrriding
		System.out.println("�ƺ� meth_g1()");
	}
	
	void meth_1() {
		System.out.println("�θ� meth_1()");
	}
	
	void meth_2() {
		System.out.println("�θ� meth_2()");
	}
}

class OverrChild extends OverrPar{
	int b = 2222;//hiding
	int c = 3333;
	
	int pb = super.b;  //super - �θ� ������
	
	//int sg1 = super.super.g1;
	//int sg1 = mega.g1;
	
	void meth_2(){//overriding
		System.out.println("�ڽ� meth_2()");
	}
	
	void meth_s2(){
		super.meth_2();//super - �θ� ������
	}
	
	void meth_3(){
		System.out.println("�ڽ� meth_3()");
	}
}



public class OverridingMain {

	public static void main(String[] args) {
		
		OverrPar pp = new OverrPar();
		OverrChild cc = new OverrChild();
		
		System.out.println("pp.g1:"+pp.g1);
		System.out.println("pp.g2:"+pp.g2);
		System.out.println("pp.a:"+pp.a);
		System.out.println("pp.b:"+pp.b);
		pp.meth_g1();
		pp.meth_g2();
		pp.meth_1();
		pp.meth_2();
		
		System.out.println();
		System.out.println("cc.g1:"+cc.g1);
		//System.out.println("cc.sg1:"+cc.sg1);
		System.out.println("cc.g2:"+cc.g2);
		System.out.println("cc.a:"+cc.a);
		System.out.println("cc.b:"+cc.b);
		System.out.println("cc.pb:"+cc.pb);
		System.out.println("cc.c:"+cc.c);
		cc.meth_g1();
		cc.meth_g2();
		cc.meth_1();
		cc.meth_2();
		cc.meth_s2();
		cc.meth_3();

	}

}
