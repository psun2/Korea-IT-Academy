package oops_p;


class MethodCall{
	
	int tot = 0;
	
	void meth_1() {
		int a = 1;
		System.out.println("meth_1() ���� "+tot+","+a);
		
		tot+=10;
		a++;
		meth_2();
		System.out.println("meth_1() �� "+tot+","+a);
		
//		void meth_4() {  �޼ҵ� ���ο� �޼ҵ� ���� �Ұ�
//			
//		}
	}
	
	void meth_2() {
		int a = 1;
		System.out.println("\tmeth_2() ���� "+tot+","+a);
		tot+=10;
		a++;
		meth_3();
		System.out.println("\tmeth_2() �� "+tot+","+a);
	}
	
	void meth_3() {
		System.out.println("\t\tmeth_3() ���� "+tot);
		tot+=10;
		//meth_1();
		System.out.println("\t\tmeth_3() �� "+tot);
	}
	
}

public class MethodCallMain {

	public static void main(String[] args) {
		MethodCall mc = new MethodCall();
		
		mc.meth_1();

	}

}
