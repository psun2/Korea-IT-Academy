package class_p;

class AAA{
	public AAA() {
		System.out.println("AAA ������-----------");
	}
	
	void meth_2() {
		// ���� �Ұ�
		//System.out.println("AAA.meth_2() ����:"+a);
		System.out.println("AAA.meth_2() ����:");
	}
	void meth_22() {
		
		System.out.println("AAA.meth_22() ����:");
	}
}

class Big{
	String a = "Big_a";
	static String a_st = "Big_a_st";
	
	Inner ic = new Inner();		//1. �Ϲ� ��ø�� ����ʵ��
	Inner_Static ics = new Inner_Static();//2. static ��ø�� ����ʵ��
	//Inner_Local icl = new Inner_Local(); //3. local ��ø ���� �� ���� �Ұ�
	//meth_4().Inner_Local icl = meth_4().new Inner_Local();
	AAA ac = new AAA();
	
	public Big() {
		System.out.println("Big ������-----------");
	}
	
	void meth_1() {
		System.out.println("Big.meth_1() ����");
		
		/* �޼ҵ� ���ο� �޼ҵ� ���� �Ұ�
		void meth_sub() {
			
		}
		*/
	}
	
	void meth_3() {
		System.out.println("Big.meth_3() ���� ---");
		//meth_2();
		ic.meth_2();
		System.out.println("Big.meth_3() �� ---");
	}
	
	
	void meth_4() {
		System.out.println("Big.meth_4() ���� ---");
		
		int f = 123;
		
		//3. ���� ��øŬ����
		class Inner_Local{
			void meth_5() {
				
				//Outer ��������� �޼ҵ��� �������� ȣ�� ����
				System.out.println("Big.meth_4().Inner_Local.meth_5() ����:"+a+","+f);
			}
		}
		
		//���ǵ� �޼ҵ� ���ο��� ���� ��ø Ŭ���� ��� ����
		Inner_Local icl2 = new Inner_Local(); 
		icl2.meth_5();
		
		//4. �͸� ��øŬ����
		AAA ianno = new AAA() {
			
			@Override  //�͸� ������ �޼ҵ�
			void meth_2() {
				System.out.println("������ meth_2() ������ ����");
			}
		};
		
		ianno.meth_2();
		ianno.meth_22();
		
		
		
		System.out.println("Big.meth_4() �� ---");
	}
	
	
	
	
	
	
	
	
	//1. ��� ��øŬ����
	class Inner{  
		
		public Inner() {
			System.out.println("Inner ������-----------");
		}
		
		String b = "Big_Inner_b";
		//static String c = "Big_Inner_c"; �Ϲ� inner �� static ��� ���� �Ұ�
		
		void meth_2() {
								//Outer �� ������� ���� ����
			System.out.println("Inner.meth_2() ����:"+a+","+b);
		}
	}
	
	//2. Nested class
	static class Inner_Static{
		
		public Inner_Static() {
			System.out.println("Inner_Static ������-----------");
		
		}
		
		String b = "Big_In_St_b";
		static String c = "Big_In_St_c";
		
		void meth_2() {
								//Outer �� �Ϲ� ��� ���� �Ұ�
			//System.out.println("Inner_Static.meth_2() ����:"+a+","+b);
			//Outer �� static ��� ���� ����
			System.out.println("Inner_Static.meth_2() ����:"+a_st+","+b);
		}
	}
	
	
	
}

public class InnerClassMain {

	public static void main(String[] args) {
		Big big = new Big();
		big.meth_1();
		big.ic.meth_2();
		big.ic.b = "bbb";
		big.meth_3();
		System.out.println();
		Big.Inner inn;
		//inn = new Big.Inner();
		//inn = new big.Inner();
		inn = big.new Inner();
		inn.meth_2();
		big.a = "bb_aa";
		inn.meth_2();
		big.ic.meth_2();
		System.out.println();
		//Big.Inner inn2 = new Big$Inner();
		//Big$Inner inn2;
		//Big.Inner inn2 = big$Inner();
		Big.Inner_Static inn_st = new Big.Inner_Static(); 
		//Inner_Static Inn_st2 = new Inner_Static();
		Big.Inner_Static inn_st2;
		//inn_st2 = big.new Inner_Static();
		//inn_st2 = Big.new Inner_Static();
		inn_st.meth_2();
		
		System.out.println();
		big.meth_4();
	}

}
