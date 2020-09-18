package oops_p;

import java.util.Arrays;

class MethodParam{
	
	void meth_1(int a, int b, int c) {
		a = 1111;
		System.out.println("meth_1() ����:"+a+","+b+","+c);
	}
	
	void meth_2(int [] arr) {
			
		arr[1] = 2222;
		System.out.println("meth_2() ����:"+Arrays.toString(arr));
	}

	
	void meth_3(int ... arr) { //�����Ű�����
							//1. �迭�� ���� �� ����
							//2. ������ �Ű������� �迭�� �����Ͽ� ���� �� ����
		arr[2] = 3333;
		System.out.println("meth_3() ����"+Arrays.toString(arr));
	}
	
	
	void meth_4(String name, int age, int ... arr) {
		
		System.out.println("meth_4() ����:"+
				name+","+age+","+Arrays.toString(arr));
	}
	
	void meth_5(int ... arr) { //�����Ű�����
		
		System.out.println("meth_5() ����"+Arrays.toString(arr));
	}
	
	///���� �Ű�������  �� �������� ��ġ�Ͽ��� �Ѵ�.
	//void meth_6(String name, int ... arr, int age) {
//	void meth_6(String name, int ... arr, String age) {	
//		System.out.println("meth_6() ����:"+
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
		mp.meth_4("������",15,20,30);
		mp.meth_4("������",15,20);
		mp.meth_4("������",15);
		//mp.meth_4("������");

	}

}
