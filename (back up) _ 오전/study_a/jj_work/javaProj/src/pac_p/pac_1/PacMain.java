package pac_p.pac_1;

import pac_p.pac_2.BBB;  //�ٸ� ��Ű�� Ŭ���� ��������
import pac_p.pac_2.*;	//pac_2 ���� ������ Ŭ���� ���� ��� ��������
//import pac_p.pac_2.CCC;
//import pac_p.pac_2.DDD;
import pac_p.pac_1.sub.*; //������ ��Ű���� �ٸ� ��Ű�� �� 

class AAA{
	String a = "pac_1.AAA.a";
	private String b = "pac_1.AAA.b"; //���Ǻο����� ���ٰ���
	int c;
	private int d;
	void meth_1() {
		//private Ŭ���� ���Ǻ��� �޼ҵ忡�� ���� ����
		System.out.println("pac_1.AAA.meth_1() ����:"
		+a+","+b+","+c+","+d);
	}
	
	void init_B(String b) { //�޼ҵ带 ���� private  ���ٰ���
		this.b = b;
	}
	String out_B() {
		return b;
	}
	
	void init_D(int d) { //�޼ҵ带 ���� private  ���ٰ���
		if(d<0 || d>100) { //��ȿ���� Ȯ��
			System.out.println("�Է� ����");
			return;
		}
			
		this.d = d;
	}
}



class ChildBBB extends BBB{
	//�ٸ���Ű���� �θ�Ŭ������ ��Ӱ����� �ڽ�Ŭ������ ���ٰ����� ���
	//void init_A(String a) {
		//this.a = a; default ���ٺҰ�
	//}
	
	void init_C(String c) {
		this.c = c; //protected ���� ����
	}
	
	//void init_D(String d) {
		//this.d = d; //private ���� �Ұ�
	//}
}

class ChildFFF extends FFF{
	
	void init_A(String a) {
		this.a = a; //���� ��Ű�� default ���ٰ���
	}
	
	void init_C(String c) {
		this.c = c; //protected ���� ����
	}
	
	void init_D(String d) {
		//this.d = d; //private ���� �Ұ�
	}
}


public class PacMain {

	public static void main(String[] args) {
		
		
		System.out.println("pacMain  �Դϴ�.");
		AAA p1a = new AAA();
		pac_p.pac_1.BBB p1b = new pac_p.pac_1.BBB();
		BBB p2b = new BBB();
		CCC p1c = new CCC();
		pac_p.pac_2.CCC p2c = new pac_p.pac_2.CCC();
		//DDD p2d = new DDD();
		EEE p1e = new EEE();
		FFF p1f = new FFF();
		GGG psg = new GGG();
		ChildBBB p1cb = new ChildBBB();
		ChildFFF p1cf = new ChildFFF();
		
		
		System.out.println("p1a.a:"+p1a.a);
		//System.out.println("p1a.b:"+p1a.b);
		System.out.println("p2b:"+p2b);
		//System.out.println("p2b.a:"+p2b.a);
		System.out.println("p1b.a:"+p1b.a);
		System.out.println("p2b.b:"+p2b.b);
		//System.out.println("p2b.c:"+p2b.c);
		System.out.println("p1c.a:"+p1c.a);
		System.out.println("p2c.a:"+p2c.a);
		System.out.println("p1e.a:"+p1e.a);
		System.out.println("p1f.a:"+p1f.a);
		System.out.println("psg.a:"+psg.a);
		
		System.out.println("---------------");
		p1a.init_B("�Ʊ���");
		p1a.meth_1();
		//p2b.meth_1();
		p2b.meth_2();
		System.out.println("p1a.out_B():"+p1a.out_B());
		
		p1a.c = 245;
		//p1a.d = 245;
		p1a.init_D(245);
		p1a.init_D(88);
		p1a.meth_1();
		System.out.println("---------------");
		p1cb.meth_2();
		p1cb.b = "�������";
//		p1cb.a = "�Ҿƹ������";
//		p1cb.c = "�ƺ����";
//		p1cb.d = "�Ҿƹ������";
		p1cb.init_C("�ƺ����");
		p1cb.meth_2();
		
		System.out.println("---------------");
		p1cf.meth_2();
		p1cf.b = "�������";
		p1cf.a = "�Ҿƹ������";
		p1cf.c = "�ƺ����";
	//	p1cf.d = "�Ҿƹ������";
		p1cf.init_A("������");
		p1cf.init_C("�ҳ���");
		p1cf.meth_2();
	}

}
