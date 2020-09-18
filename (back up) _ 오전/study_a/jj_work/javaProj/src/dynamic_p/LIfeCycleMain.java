package dynamic_p;

class LCPar{
	int a = goA();
	static int b = goSB();
	
	LCPar(int a) {
		System.out.println("�θ� ������:"+a);
		this.a = a;
	}
	
	int goA() {
		System.out.println("�θ� goA()");
		return 10;
	}
	
	static int goSB() {
		System.out.println("�θ� static goSB()");
		return 20;
	}
}

class LCChild extends LCPar{
	int f = 5555;
	int a = goA2();  //hiding  -- �ι� ȣ���
	int c = goA();
	static int d = goSD();
	
	LCChild(int a) {
		//super(c); ���� - �θ� ������ ���� �ڽ� ����� �Ҵ���� ����
		super(a);
		//super(goA()); ���� 
		//super(goZ()); ����
		//super(d);   --- �θ𿩵�  ������ �μ��� static ����
		//super(goSD() ); �θ𿩵�  ������ �μ��� static ����
		System.out.println("�ڽ� ������1");
	}
	
	LCChild() {
		//super(8888 ); ����     �θ� �ι� �����ϴ� ���°� ��
		this(1234);  //�����ڸ� ���� - ������ �μ��� ��� ,  static �� ���� 
		//this(d);   //static  ����
		//this(c);  // �Ϲ� ������� �Ұ�  -- �������̹Ƿ� ��ü�� �������� ����!!!
		//this(a);  // �θ� �Ϲ� ������� �Ұ�
		//super(8888 );  ����   �θ𺸴� �ڽ��� �켱�� �� ����
		System.out.println("�ڽ� ������2");
	}
	
	int goA() {
		System.out.println("�ڽ� goA() - �������̵�:"+f);
		return f;
	}
	
	int goA2() {
		System.out.println("�ڽ� goA2()");
		return 6666;
	}
	
	int goC() {
		System.out.println("�ڽ� goC()");
		return 3333;
	}
	
	int goZ() {
		System.out.println("�ڽ� goZ()");
		return 9999;
	}
	
	static int goSD() {
		System.out.println("�ڽ� static goSD()");
		return 4444;
	}
	
	
}

public class LIfeCycleMain {

	public static void main(String[] args) {
		LCPar pp = new LCPar(963);
		System.out.println("-----------------");
		//LCChild cc = new LCChild(1010);
		LCChild cc = new LCChild();

	}

}
