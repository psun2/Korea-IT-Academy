package oops_p;


class MethodCla{
	
	int a = 10;
	
	//param X, ret X
	void meth_1() {  //�޼ҵ��� ����
		
		System.out.println("meth_1() ����");
	}
	
	
	//param O, ret X
	void meth_2(int b, String c) {//�Ű������� ������ ���� ����
		
		System.out.println("meth_2() ����:"+b+","+c);
		//return 123;
		return;
	}
	
	//param X, ret O
	//int,  int meth_3() {
	int meth_3() {
		
		System.out.println("meth_3() ����");
		
		//return 100, 200;
		
		return 100;  //���ϰ��� �ϳ� Ȥ�� ����
		//return 100;  return�� �ѹ��� ����
	}
	
	
	//param O, ret O
	int meth_4(int b, int c) {
		
		System.out.println("meth_4() ����:"+b+","+c);
		
		return b*c;
	}
	
}
public class MethodMain {

	public static void main(String[] args) {
		MethodCla mc = new MethodCla();
		
		//int r1 = mc.meth_1(); //�޼ҵ� ȣ��  ������ �������� ���� �޼ҵ忡�� ���� �Ұ�
		mc.meth_1();
		//mc.meth_2();
		mc.meth_2(100,"�Ʊ���");
		
		int r3 = mc.meth_3();
		
		System.out.println("r3:"+r3);
		
		int r4 = mc.meth_4(5,6);
		
		System.out.println("r4:"+r4);
		
		System.out.println("r5:"+mc.meth_4(10,6));

	}

}
