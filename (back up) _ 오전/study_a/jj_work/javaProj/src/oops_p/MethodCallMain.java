package oops_p;


class MethodCall{
	
	int tot = 0;
	
	void meth_1() {
		int a = 1;
		System.out.println("meth_1() 시작 "+tot+","+a);
		
		tot+=10;
		a++;
		meth_2();
		System.out.println("meth_1() 끝 "+tot+","+a);
		
//		void meth_4() {  메소드 내부에 메소드 정의 불가
//			
//		}
	}
	
	void meth_2() {
		int a = 1;
		System.out.println("\tmeth_2() 시작 "+tot+","+a);
		tot+=10;
		a++;
		meth_3();
		System.out.println("\tmeth_2() 끝 "+tot+","+a);
	}
	
	void meth_3() {
		System.out.println("\t\tmeth_3() 시작 "+tot);
		tot+=10;
		//meth_1();
		System.out.println("\t\tmeth_3() 끝 "+tot);
	}
	
}

public class MethodCallMain {

	public static void main(String[] args) {
		MethodCall mc = new MethodCall();
		
		mc.meth_1();

	}

}
