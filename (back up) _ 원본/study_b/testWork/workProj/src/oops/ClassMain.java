package oops;

class ClaAAA{	//Ŭ���� ����
	int aa = 10; 	//�������
	String bb = "�Ʊ���";
	
	void meth_1() {	//�޼ҵ�
		System.out.println("ClaAAA meth_1() ����");
	}
	
}


public class ClassMain {

	public static void main(String[] args) {
		ClaAAA ca1;  //�ν��Ͻ� ���� ����
		ca1 = new ClaAAA();	//���� = �ν��Ͻ� ��ü ����
		               		//���� = ��ü �ּ� ����
		
		ClaAAA ca2 = new ClaAAA();
		ClaAAA ca3 = ca2;
		
		ca1.aa = 123;
		ca2.bb = "�������";
		System.out.println("ca1:"+ca1);
		System.out.println("ca1.aa:"+ca1.aa);
		System.out.println("ca1.bb:"+ca1.bb);
		ca1.meth_1();
		
		System.out.println("ca2:"+ca2);
		System.out.println("ca2.aa:"+ca2.aa);
		System.out.println("ca2.bb:"+ca2.bb);
		ca2.meth_1();
		
		System.out.println("ca3:"+ca3);
		System.out.println("ca3.aa:"+ca3.aa);
		System.out.println("ca3.bb:"+ca3.bb);
		ca3.meth_1();
	}

}
