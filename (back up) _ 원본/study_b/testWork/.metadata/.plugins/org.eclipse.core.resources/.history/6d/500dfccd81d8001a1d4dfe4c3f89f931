package oops;

import java.util.Arrays;

class ClaParam{
	
	void meth_1(int a , int b, int c) {  //기본 자료형
		System.out.println("meth_1 ()"+a+","+b+","+c);
	}
	
	void meth_2(int [] arr) {		//배열 (주소)
		System.out.println("meth_2 ()"+Arrays.toString(arr));
	}
	
	void meth_3(int ... arr) {		//가변매개변수 --> 매개변수들을 묶어 배열로 처리후 주소 대입
		System.out.println("meth_3 ()"+Arrays.toString(arr));
	}
	
	
	void meth_4(int a, int b, int ... arr) {		
		System.out.println("meth_4 ()"+a+","+b+Arrays.toString(arr));
	}

	/*
	arr -> 이후의 모든 변수를 배열로 묶음
	따라서 a 의 값이 할당되지 않음 
	void meth_5(int ... arr, int a) {		
		System.out.println("meth_5 ()"+Arrays.toString(arr));
	}
	
	자료형이 달라도 위치의 문제는 변화 없음
	void meth_6(int ... arr, String a) { 		
		System.out.println("meth_6 ()"+Arrays.toString(arr));
	}
	*/
}


public class ParamMain {

	public static void main(String[] args) {
		ClaParam cp = new ClaParam();
		
		cp.meth_1(10, 20, 30);
		//cp.meth_2(10, 20, 30);
		cp.meth_2(new int[] {10, 20, 30});
		cp.meth_3(10, 20, 30);
		cp.meth_3(new int[] {10, 20, 30});
		cp.meth_3(1111,2222,3333);
		cp.meth_3(1111,2222);
		cp.meth_3(1111);
		cp.meth_3();
		System.out.println("-------------------");
		cp.meth_4(12, 34, 56,78,90);
		//a = 12, b = 34, c= [56,78,90]
		cp.meth_4(12, 34, 56,78);
		cp.meth_4(12, 34, 56);
		cp.meth_4(12, 34);
		//cp.meth_4(12);
		//a = 12, b = ?, c= []

	}

}
