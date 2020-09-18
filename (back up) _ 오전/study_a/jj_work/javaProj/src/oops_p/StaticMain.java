package oops_p;

class StaticCla_A{
	
	int a = goA();
	
	int b = goB();
	
	//static int sa = goA(); �ν��Ͻ� �޼ҵ�� �ʱ�ȭ �Ұ�
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
		//return c; �ν��Ͻ� ������� ���� �Ұ�
		return sc;
	}
	
	static int sc = 3000;
	
	void meth_1() {
		System.out.println("�ν��Ͻ� meth_1()  ����  ---"+a+","+sa);
		meth_2();
		meth_s2();  //�ν��Ͻ� �޼ҵ��  static ��Ҹ� ȣ�� ����
		System.out.println("�ν��Ͻ� meth_1()  ��  ---");
	}
	
	static void meth_s1() {
		//System.out.println("static meth_s1()  ����  ---"+a+","+sa); �ν��Ͻ� a ȣ��Ұ�
		System.out.println("static meth_s1()  ����  ---"+sa);
		//meth_2();  //static �޼ҵ��  �ν��Ͻ� ��Ҹ� ȣ�� �Ұ�
		meth_s2();
		System.out.println("static meth_s1()  ��  ---");
	}
	
	void meth_2() {
		System.out.println("�ν��Ͻ� meth_2()");	
	}
	
	static void meth_s2() {
		System.out.println("static meth_s2()");
	}
	
}
class StaticCla_B{
	
	int a = 123;
	static int sa = 456;  //�ٸ� Ŭ������ ���ǵ�  static �� �������� ����
}

public class StaticMain {

	public static void main(String[] args) {
		
		//StaticCla_A.sb = 2222;
		//StaticCla_A.b = 2222;
		StaticCla_A.meth_s1();
		System.out.println("sa_1 ������-----------------");
		StaticCla_A sa_1 = new StaticCla_A();
		System.out.println("sa_2 ������-----------------");
		StaticCla_A sa_2 = new StaticCla_A();
		System.out.println("-----------------");
		
		System.out.println("sa_1:"+sa_1.ppp());
		System.out.println("sa_2:"+sa_2.ppp());
		System.out.println("������-----------------");
		System.out.println("sa_1:"+sa_1.a+","+sa_1.sa);
		System.out.println("sa_2:"+sa_2.a+","+sa_2.sa);
		System.out.println("������-----------------");
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
