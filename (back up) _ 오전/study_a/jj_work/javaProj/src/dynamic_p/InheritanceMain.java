package dynamic_p;

class Par1{
	
	String name = "�θ�1";
	int a = 10;
	void meth_1() {
		System.out.println("�θ�1 meth_1() ����");
	}
	void meth_2() {
		System.out.println("�θ�1 meth_2() ����");
	}	
}

class Par2{
	
	String name = "�θ�2";
	int b = 10;
	void meth_11() {
		System.out.println("�θ�2 meth_11() ����");
	}
	void meth_22() {
		System.out.println("�θ�2 meth_22() ����");
	}	
}

class Child1 extends Par1 //, Par2
{
	String nn = "�ڽ�1";
	
	void meth_3() {
		System.out.println("�ڽ�1 meth_3() ����");
	}
}

class Child2 extends Par1{
	String nn2 = "�ڽ�2";
	
	void meth_4() {
		System.out.println("�ڽ�2 meth_4() ����");
	}
}


public class InheritanceMain {

	public static void main(String[] args) {
		System.out.println("---------------");
		Par1 pp1 = new Par1();
		System.out.println("---------------");
		Child1 cc1 = new Child1();
		System.out.println("---------------");
		Child2 cc2 = new Child2();
		
		System.out.println("---------------");
		
		System.out.println("pp1.name:"+pp1.name);
		//System.out.println("pp1.nn:"+pp1.nn);
		System.out.println("cc1.name:"+cc1.name);
		System.out.println("cc1.nn:"+cc1.nn);
		//System.out.println("cc1.nn2:"+cc1.nn2);
		System.out.println("cc2.name:"+cc2.name);
		//System.out.println("cc2.nn:"+cc2.nn);
		System.out.println("cc2.nn2:"+cc2.nn2);
		
		pp1.meth_1();
		//pp1.meth_3();
		cc1.meth_1();
		cc1.meth_3();
		//cc1.meth_4();
		cc2.meth_1();
		//cc2.meth_3();
		cc2.meth_4();
		
		

	}

}
