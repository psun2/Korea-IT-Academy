package oops_p;

class M_V{
	
	int d = 1357;
	int e = 5555;
	
	void meth_1(int a) { //�Ű������� ��������
		//int a = 10; //���������� �Ű������� ���� �̸����� ���� �Ұ�
		System.out.println("meth_1() ����:"+a+","+d); //�޼ҵ忡�� ����������� ����
		System.out.println("meth_1() ��:"+a+","+d);
	}
	
	void meth_2() {
		//System.out.println("meth_2() ����:"+a);  �ٸ� �޼ҵ峻�� �������� ���ٺҰ�
		int b = 20000;
		int e = 70000; //���������� ��������� ����
						//�켱���� ������ ������ ���������� ���´�
		System.out.println("meth_2() ����:"+b+","+d+","+e+","+this.e);
						// this  :: �� �ν��Ͻ� ��ü�� ��� Ȥ�� �ν��Ͻ� ��ü���� ��������� ǥ��
		d = 2468;	//������� ����
		System.out.println("meth_2() ��:"+b+","+d+","+e+","+this.e);
	}
	void meth_3() {
		int b = 2345;	// �ٸ� �޼ҵ�� ������� ������ �̸����� �������� ���𰡴�
		System.out.println("meth_3() ����:"+b+","+this.d+","+e);
		System.out.println("meth_3() ��:"+b+","+d+","+e);
	}
	
	void init(int d, int e) {
		System.out.println("�ʱ�ȭ �Ҳ���");
		this.d = d;
		this.e = e;
	}
	
	void ppp() {
		System.out.println(this.d+","+this.e);
	}
	
	
}

public class MethodVal {

	public static void main(String[] args) {
		
		M_V mv = new M_V();
		
		mv.meth_1(1111);
		
		mv.meth_2();
		
		mv.meth_3();
		
		//System.out.println("main:"+mv.a);//�޼ҵ� �� �������� ���� �Ұ�
		System.out.println("main:"+mv.d+","+mv.e);
		//System.out.println("main:"+mv.this.d); this�� Ŭ������ ���Ǻο����� ���
		
		System.out.println("-------------------");
		
		M_V mv1 = new M_V();
		System.out.println("�ʱ�ȭ ��:"+mv1.d+","+mv1.e);
		mv1.init(123, 456);
		System.out.println("�ʱ�ȭ ��:"+mv1.d+","+mv1.e);
		mv1.ppp();
		mv.ppp();

	}

}

