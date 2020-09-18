package oops_p;

import java.util.Arrays;

class MethodParam{
	
	void meth_1(int a, int b, int c) {
		a = 1111;
		System.out.println("meth_1() 실행:"+a+","+b+","+c);
	}
	
	void meth_2(int [] arr) {
			
		arr[1] = 2222;
		System.out.println("meth_2() 실행:"+Arrays.toString(arr));
	}

	
	void meth_3(int ... arr) { //가변매개변수
							//1. 배열을 받을 수 있음
							//2. 나열된 매개변수를 배열로 생성하여 받을 수 있음
		arr[2] = 3333;
		System.out.println("meth_3() 실행"+Arrays.toString(arr));
	}
	
	
	void meth_4(String name, int age, int ... arr) {
		
		System.out.println("meth_4() 실행:"+
				name+","+age+","+Arrays.toString(arr));
	}
	
	void meth_5(int ... arr) { //가변매개변수
		
		System.out.println("meth_5() 실행"+Arrays.toString(arr));
	}
	
	///가변 매개변수는  맨 마지막에 위치하여야 한다.
	//void meth_6(String name, int ... arr, int age) {
//	void meth_6(String name, int ... arr, String age) {	
//		System.out.println("meth_6() 실행:"+
//				name+","+age+","+Arrays.toString(arr));
//	}
	
}

public class MethodParamMain {

	public static void main(String[] args) {

		MethodParam mp = new MethodParam();
		int a = 10;
		mp.meth_1(a,20,30);
		
		System.out.println(a);
		
		int [] arr = {10,20,30, 40, 50};
		mp.meth_2(arr);
		//mp.meth_2(a,20,30);
		
		System.out.println("main:"+Arrays.toString(arr));
		
		mp.meth_3(arr);
		System.out.println("main:"+Arrays.toString(arr));
		
		mp.meth_3(a,20,30);
		mp.meth_5(a,20);
		mp.meth_5(a);
		mp.meth_5();
		mp.meth_4("차은우",15,20,30);
		mp.meth_4("차은우",15,20);
		mp.meth_4("차은우",15);
		//mp.meth_4("차은우");

	}

}
