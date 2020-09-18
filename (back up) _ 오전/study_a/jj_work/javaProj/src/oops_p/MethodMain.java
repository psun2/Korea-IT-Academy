package oops_p;


class MethodCla{
	
	int a = 10;
	
	//param X, ret X
	void meth_1() {  //메소드의 정의
		
		System.out.println("meth_1() 실행");
	}
	
	
	//param O, ret X
	void meth_2(int b, String c) {//매개변수의 갯수는 제한 없음
		
		System.out.println("meth_2() 실행:"+b+","+c);
		//return 123;
		return;
	}
	
	//param X, ret O
	//int,  int meth_3() {
	int meth_3() {
		
		System.out.println("meth_3() 실행");
		
		//return 100, 200;
		
		return 100;  //리턴값은 하나 혹은 없음
		//return 100;  return은 한번만 가능
	}
	
	
	//param O, ret O
	int meth_4(int b, int c) {
		
		System.out.println("meth_4() 실행:"+b+","+c);
		
		return b*c;
	}
	
}
public class MethodMain {

	public static void main(String[] args) {
		MethodCla mc = new MethodCla();
		
		//int r1 = mc.meth_1(); //메소드 호출  리턴을 지정하지 않은 메소드에서 리턴 불가
		mc.meth_1();
		//mc.meth_2();
		mc.meth_2(100,"아기상어");
		
		int r3 = mc.meth_3();
		
		System.out.println("r3:"+r3);
		
		int r4 = mc.meth_4(5,6);
		
		System.out.println("r4:"+r4);
		
		System.out.println("r5:"+mc.meth_4(10,6));

	}

}
