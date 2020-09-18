package inter_p;

import pac_p.pac_2.InC;

abstract interface InA{  //interface�� ����
	//void meth_1() {}
	abstract void meth_1();  //method�� �߻�ȭ
	void meth_2();
	
	//int a; ��� - �ʱⰪ ������ ����
	int a = 10;//public, static, final �� ����
	int b = 20;
	int d = 40;
}

interface InB{  
	void meth_1(); 	//�޼ҵ尡 �������� �������
	void meth_3();
	int b = 234;
	int d = 456;
}

				//interface ����, ���� ������ ����
class ImpAAA  implements InA, InB, InC{ //extends InA{

	int d = 123456;  //hiding
	@Override
	public void meth_1() {
		System.out.println("ImpAAA.meth_1() ����");
	}

	@Override
	public void meth_2() {
		System.out.println("ImpAAA.meth_2() ����");
		
	}  
	
	@Override
	public void meth_3() {
		System.out.println("ImpAAA.meth_3() ����");
		
	}

	@Override
	public void meth_4() {  //public���� ����
		System.out.println("ImpAAA.meth_4() ����"); 
		
	}  
	
}

public class InterfaceMain {

	public static void main(String[] args) {
		//InA.a = 1357;  ��� : ���ԺҰ�
		System.out.println("InA.a:"+InA.a);
		System.out.println("InC.c:"+InC.c);
		//InA ia = new InA(); ����
		ImpAAA aa = new ImpAAA();
		InA ia = aa; 
		InB ib = aa;
		InC ic = aa;
		
		InA iia = new InA() {

			@Override
			public void meth_1() {
				System.out.println("������ meth_1() ����");
			}

			@Override
			public void meth_2() {
				System.out.println("������ meth_2() ����");
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
