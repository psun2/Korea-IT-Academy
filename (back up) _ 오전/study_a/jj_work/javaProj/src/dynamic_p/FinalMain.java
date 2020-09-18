package dynamic_p;

abstract class FinalPar{
	
	int a = 10;
	final int b = 20;
	static int c = 30;
	final static int d = 40;
	//final int e;  �ʱⰪ ���� final ���� ���Ұ�
	final int e;  //���� 1ȸ �� �Է� �޴� ��츸 ���� ���� 
	//(���� ����� �ʱ�ȭ  or �����ڳ� �ʱ�ȭ)
	
	
	
	
	public FinalPar() {
		//b = 2345; // �ʱⰪ �ִ� final ������ ���� �Ұ�
		e = 5678;	// ������ �ʱⰪ ���� final ���� �� ���� ����
	}

	void meth_1() {
		a = 1111;
		//b = 2222; final ���ԺҰ�
		c = 3333;
		//d = 4444;
		//e = 5555;
		System.out.println("�θ� meth_1() ����");
	}
	
	final void meth_2() {
		System.out.println("�θ� meth_2() ����");
	}
	
	//final abstract void meth_3() ; final ��  abstract�� ���ÿ� ���Ұ�
	abstract void meth_3() ;
	
	static void meth_4() {
		System.out.println("�θ� meth_4() ����");
	}
	
	final static void meth_5() {
		System.out.println("�θ� meth_5() ����");
	}
}

class FinalChild extends FinalPar{
	
	int a = 101;
	final int b = 202;  //hiding �Ǿ� �θ�/�ڽ� ���� �ٸ� ������
	static int c = 303;
	final static int d = 404;  //hiding �Ǿ� �θ�/�ڽ� ���� �ٸ� ������
	
	
	

	@Override
	void meth_3() {
		System.out.println("�ڽ� meth_3() ����");
		
	}
	
	void meth_1() {
		System.out.println("�ڽ� meth_1() ����");
	}
	
	/* final �޼ҵ� overriding �Ұ�
	void meth_2() {
		System.out.println("�ڽ� meth_2() ����");
	}
	*/
	
	static void meth_4() {
		System.out.println("�ڽ� meth_4() ����");
	}
	/* final �޼ҵ� overriding �Ұ�
	final static void meth_5() {
		System.out.println("�ڽ� meth_5() ����");
	}
	 */

}
public class FinalMain {

	public static void main(String[] args) {

		FinalChild fc = new FinalChild() {
			
			int a = 135;		//������ �޼ҵ忡���� ��밡����
			final int b = 246;
			//static int c = 789; static ������ overriding  �Ұ�
			final static int d = 369; //final �̶� ��밡�� static �� �ǹ̰� ����

			void meth_3() {
				///Ŭ������ ���ǵ� ��������� �ƴ� �����ÿ� ����� �������� �켱������ ����
				System.out.println("������ meth_3() ����:"+a+","+b+","+c+","+d);
				
			}
			
			void meth_1() {
				a = 11223344;
				//b = 44556677; final
				System.out.println("������ meth_1() ����");
			}
			
			/* final �޼ҵ� overriding �Ұ�
			void meth_2() {
				System.out.println("������ meth_2() ����");
			}
			*/
			
			/* static ������ overriding  �Ұ�
			 static void meth_4() { 
				System.out.println("������ meth_4() ����");
			}
			*/
			/* final �޼ҵ� overriding �Ұ�
			final static void meth_5() {
				System.out.println("������ meth_5() ����");
			}
			 */
		};
		
		
		System.out.println("fc:"+fc.a+","+fc.b+","+fc.c+","+fc.d+","+fc.e);
		fc.a = 1000;
		//fc.b = 2000; final ���ԺҰ�
		fc.c = 3000;
		//fc.d = 4000; final ���ԺҰ�
		
		System.out.println("fc:"+fc.a+","+fc.b+","+fc.c+","+fc.d+","+fc.e);
		
		
		fc.meth_1();
		fc.meth_2();
		fc.meth_3();
		fc.meth_4();
		fc.meth_5();
		
		System.out.println("--------------------");
		FinalPar fpc = fc;
		System.out.println("fpc:"+fpc.a+","+fpc.b+","+fpc.c+","+fpc.d+","+fpc.e);
		fc.meth_1();
		fc.meth_2();
		fc.meth_3();
		fc.meth_4();
		fc.meth_5();
		
		//������ overriding �� �޼ҵ��� ȣ���� ������  hiding�� ��������� �����ϹǷ� ���� ��������� ������ ��ġ�� ����
		System.out.println("fpc:"+fpc.a+","+fpc.b+","+fpc.c+","+fpc.d+","+fpc.e);
		
		
		
		/*
		 
		 �θ� : Ŀ��
		 �ڽ� : 
		 			����,   ��  ������ ����
		 �Ƹ޸�ī�� 	2		8
		 �ƽþƳ�		3		7
		 ������ī��	1		9
		 
		 order(4);  //4:Ŀ���ֹ���
		 
		 �� Ŀ���� ���� 200cc ��
		 
		 �ֹ��� ���ο� ���� �հ踦 ����ϼ���
		 
		 ĸ��ȭ X
		 * */
		
		
		
		
		
		
		
		
		
	}

}
